package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.JoystickBase;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbSubsystem extends Subsystem {

	public CANTalon lcTalon;
	public CANTalon rcTalon;
	public JoystickButton trigger;
	public JoystickButton button;
	public JoystickBase Joystick;
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

public ClimbSubsystem(){
	lcTalon = new CANTalon(RobotMap.LEFTCLIMBTALON_ID);
	rcTalon = new CANTalon(RobotMap.RIGHTCLIMBTALON_ID);
	trigger = new JoystickButton(Joystick, RobotMap.TRIGGER_ID);
	button = new JoystickButton(Joystick, RobotMap.BUTTON_ID);
}

	public void trigger(){
		lcTalon.set(1);
		rcTalon.set(-1);
	}

	public void button(){
		lcTalon.set(-1);
		rcTalon.set(1);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

