/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1827.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * This is a demo program showing how to use Mecanum control with the RobotDrive
 * class.
 */
public class Robot extends IterativeRobot {
	private static final int kFrontLeftChannel = 2;
	private static final int kRearLeftChannel = 3;
	private static final int kFrontRightChannel = 1;
	private static final int kRearRightChannel = 0;

	private static final int kJoystickChannel = 0;

	SpeedController frontLeft = new VictorSP(kFrontLeftChannel);
	SpeedController rearLeft = new  VictorSP(kRearLeftChannel);
	SpeedController frontRight = new VictorSP(kFrontRightChannel);
	SpeedController rearRight = new VictorSP(kRearRightChannel);
	
	private Joystick m_stick; 

	@Override
	public void robotInit() {
		// Invert the left side motors.
		// You may need to change or remove this to match your robot.
		frontLeft.setInverted(true);
		rearLeft.setInverted(true);


		m_stick = new Joystick(kJoystickChannel);
	}

	@Override
	public void teleopPeriodic() {
		// Use the joystick X axis for lateral movement, Y axis for forward
		// movement, and Z axis for rotation.

	}
	
	@Override
	public void autonomousPeriodic() {
		double speed = 1;
		Timer time = new Timer();
		while(time.get()<2) {
			frontLeft.set(speed);
			frontRight.set(speed);
			rearLeft.set(speed);
			rearRight.set(speed);
		}
	}
	
	
}
