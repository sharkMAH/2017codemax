package org.usfirst.frc.team3591.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	public CANTalon flTalon;
	public CANTalon frTalon;
	public CANTalon blTalon;
	public CANTalon brTalon;
	
	RobotDrive myDrive;
	
	public DriveSubsystem() {
		flTalon = new CANTalon(RobotMap.FRONTLEFTTALON_ID);
		frTalon = new CANTalon(RobotMap.FRONTRIGHTTALON_ID);
		blTalon = new CANTalon(RobotMap.BACKLEFTTALON_ID);
		brTalon = new CANTalon(RobotMap.BACKRIGHTTALON_ID);
		myDrive = new RobotDrive(flTalon, blTalon, frTalon, brTalon);
		
		myDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		myDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		
		
		/*
		flTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		blTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		frTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		brTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		
		flTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		blTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		frTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		brTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		*/
}	
	public void mecanumDrive(double X, double Y, double Z){
		myDrive.mecanumDrive_Cartesian(X, Y, Z, 0);
	}

	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

