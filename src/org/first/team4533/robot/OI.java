package org.first.team4533.robot;

import org.first.team4533.robot.commands.LiftDown;
import org.first.team4533.robot.commands.LiftStop;
import org.first.team4533.robot.commands.LiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick driver = new Joystick(0);
	private Joystick gunner = new Joystick(1);
	private static OI INSTANCE = new OI();
	// public static final int RANDOM_THING = 0;
	public static final int JOYSTICK_LIFT_UP = 1;
	public static final int JOYSTICK_LIFT_DOWN = 2;
	// public static final int RANDOM_THING = 3;
	// public static final int RANDOM_THING = 4;
	// public static final int RANDOM_THING = 5;
	public static final int JOYSTICK_GRIPPER_CLOSE = 6;
	public static final int JOYSTICK_GRIPPER_OPEN = 7;

	// public static final int RANDOM_THING = 8;
	// public static final int RANDOM_THING = 9;
	// public static final int RANDOM_THING = 10;
	// public static final int RANDOM_THING = 11;

	private OI() {
		this.gunner = new Joystick(0);
		JoystickButton liftDown = new JoystickButton(gunner, JOYSTICK_LIFT_DOWN);
		JoystickButton liftUp = new JoystickButton(gunner, JOYSTICK_LIFT_UP);
		JoystickButton gripperClose = new JoystickButton(gunner,
				JOYSTICK_GRIPPER_CLOSE);
		JoystickButton gripperOpen = new JoystickButton(gunner,
				JOYSTICK_GRIPPER_OPEN);

		liftDown.whileHeld(new LiftDown());
		liftDown.whenReleased(new LiftStop());

		liftUp.whileHeld(new LiftUp());
		liftUp.whenReleased(new LiftStop());

		// GripperClose.whileHeld(new GripperClose());
		// GripperClose.whileReleased(new GripperStop());

		// GripperOpen.whileHeld(new GripperOpen());
		// GripperOpen.whileReleased(new GripperStop());
	}

	public static OI getInstance() {
		return INSTANCE;
	}

	public static void initialize() {
		if (INSTANCE == null) {
			INSTANCE = new OI();
		}
	}

	public Joystick getGunnerJoystick() {
		return gunner;
	}

	public Joystick getDriverJoystick() {
		return driver;
	}
	// // TRIGGERING COMMANDS WITH BUTTONS
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
}
