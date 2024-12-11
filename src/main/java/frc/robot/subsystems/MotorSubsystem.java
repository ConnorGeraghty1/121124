package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class MotorSubsystem extends SubsystemBase {
    private final CANSparkMax motor;

    public MotorSubsystem() {
        // Initialize the SparkMax with the appropriate CAN ID and motor type
        motor = new CANSparkMax(1, MotorType.kBrushless); // Replace 1 with your CAN ID
        motor.restoreFactoryDefaults();
        motor.setIdleMode(IdleMode.kBrake);
        motor.enableVoltageCompensation(11);
        motor.setSmartCurrentLimit(12);
        motor.burnFlash();
    }

    // Method to set motor speed
    public void setSpeed(double speed) {
        System.out.println("Setting Motor Speed");
        motor.set(speed);
    }

    // Stop the motor
    public void stop() {
        motor.set(0);
    }
}
