package frc.robot.subsystems;

import java.lang.Math;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IMU extends SubsystemBase {
  
  public ADIS16470_IMU imu;

  double accelerationXa; // = 0
  double accelerationXb; // = 0

  public void updateMotion(){
    
    updateAccelerationX();
    updateAccelerationY();
    updateVelocityX();
    updateVelocityY();
    updatePositionX();
    updatePositionY();
    
  }
  
  public void updateAccelerationX(){
    accelerationXa = accelerationXb;
    accelerationXb = getAccelX * Math.cos(Math.toRadians(imu.getAngle()));
  }
  
  public initialize() {
    imu = Constants.imu;
  }

  public reset() {
    imu.reset();
  }

  public double yaw(){
    return imu.getAngle();
  }

  // An accessor method to set the speed (technically the output percentage) of the feed wheel
  public void setFeedWheel(double speed) {
    m_feedWheel.set(speed);
  }

}
