import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class MotorSubsystem extends SubsystemBase {
    private final CANSparkMax motor;

    public MotorSubsystem() {
        // Initialize the SparkMax with the appropriate CAN ID and motor type
        motor = new CANSparkMax(1, MotorType.kBrushless); // Replace 1 with your CAN ID
    }

    // Method to set motor speed
    public void setSpeed(double speed) {
        motor.set(speed);
    }

    // Stop the motor
    public void stop() {
        motor.set(0);
    }
}
