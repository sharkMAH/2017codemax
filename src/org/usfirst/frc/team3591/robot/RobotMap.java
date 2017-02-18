package org.usfirst.frc.team3591.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int FRONTLEFTTALON_ID = 11;
	public static int FRONTRIGHTTALON_ID = 21;
	public static int BACKLEFTTALON_ID = 12;
	public static int BACKRIGHTTALON_ID = 22;
	public static int JOYSTICK_ID = 0;
	public static int LEFTCLIMBTALON_ID = 32;
	public static int RIGHTCLIMBTALON_ID = 31;
	public static int TRIGGER_ID = 1;
	public static int BUTTON_ID = 2;
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
