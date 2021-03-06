package org.usfirst.frc.team3591.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick JoyStick = new Joystick(RobotMap.JOYSTICK_ID);
	public JoystickButton trigger = new JoystickButton(JoyStick, RobotMap.TRIGGER_ID);
	public JoystickButton button = new JoystickButton(JoyStick, RobotMap.BUTTON_ID);
	
	public JoystickButton whileActive(){
		return trigger;
}
	public JoystickButton whileHeld(){
		return button;
	}
	

public enum Axis {
		X,Y,Z, THROTTLE;
	}
	
		public double getAxis(int stick, Axis axis){
			switch (axis){
		case X:
			double X = (JoyStick.getX());
			/*
			   if (X < 0.5 && X > 0.2){
				   return 0;
				   }
			   else if (X > -0.5 && X < 0.2){
				   return 0;
			   } else {
			   */
				   return X;
			   //}
			
		case Y:
			double Y = (JoyStick.getY());
			  /* if (Y < 0.5 && Y > 0.2){
				   return 0;
				   }
			   else if (Y > -0.5 && Y < 0.2){
				   return 0;
			   } else {*/
				   return Y;
			   //}
			
		case Z:
			double Z = (JoyStick.getZ());
			   /*
			    * if (Z < 0.5 && Z > 0.2){
			    
				   return 0;
				   }
			   else if (Z > -0.5 && Z < 0.2){
				   return 0;
			   } else {
			   */
				   return Z;
			   //}
		case THROTTLE:
			//return (1 - JoyStick.getThrottle()) / 2;
			return(JoyStick.getThrottle());
		default:
			System.out.println("Invalid Axis");
			return 0.0;
		

}
}

}

	
	
	
	
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

