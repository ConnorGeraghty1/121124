import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunMotorCommand extends CommandBase {
    private final MotorSubsystem motorSubsystem;

    public RunMotorCommand(MotorSubsystem subsystem) {
        motorSubsystem = subsystem;
        addRequirements(motorSubsystem); // Declare subsystem dependency
    }

    @Override
    public void execute() {
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
