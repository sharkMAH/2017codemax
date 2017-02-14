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
}	
	public void mecanumDrive(double x, double y, double z){
		myDrive.mecanumDrive_Cartesian(x, y, z, 0);
	}

	
	
		// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

