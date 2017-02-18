package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbSubsystem extends Subsystem {

	public CANTalon lcTalon;
	public CANTalon rcTalon;
	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

public ClimbSubsystem(){
	lcTalon = new CANTalon(RobotMap.LEFTCLIMBTALON_ID);
	rcTalon = new CANTalon(RobotMap.RIGHTCLIMBTALON_ID);
}

	public void ClimbTalon(){
		lcTalon.set(1);
		rcTalon.set(-1);
	}

	public void ClimbTalonDown(){
		lcTalon.set(-1);
		rcTalon.set(1);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

