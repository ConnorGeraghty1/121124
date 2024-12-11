package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.MotorSubsystem;
import frc.robot.commands.RunMotorCommand;

public class RobotContainer {
    private final XboxController controller = new XboxController(0); // Controller on port 0
    private final MotorSubsystem motorSubsystem = new MotorSubsystem();

    public RobotContainer() {
        configureButtonBindings();
    }

    private void configureButtonBindings() {
        new JoystickButton(controller, XboxController.Button.kA.value)
            .whileTrue(new RunMotorCommand(motorSubsystem));
    }
}
