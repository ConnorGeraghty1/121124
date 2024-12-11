package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorSubsystem;

public class RunMotorCommand extends Command {
    private final MotorSubsystem motorSubsystem;

    public RunMotorCommand(MotorSubsystem subsystem) {
        motorSubsystem = subsystem;
        addRequirements(motorSubsystem); // Declare subsystem dependency
    }

    @Override
    public void execute() {
        System.out.println("Executing Run Command");
        motorSubsystem.setSpeed(0.5); // Set motor to half speed
    }

    @Override
    public void end(boolean interrupted) {
        motorSubsystem.stop(); // Stop the motor when the command ends
    }

    @Override
    public boolean isFinished() {
        return false; // Keep running until interrupted
    }
}
