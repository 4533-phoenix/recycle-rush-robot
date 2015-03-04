package org.first.team4533.robot;

import org.first.team4533.robot.commands.GripperClose;
import org.first.team4533.robot.commands.GripperOpen;
import org.first.team4533.robot.commands.GripperStop;
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
	// private Joystick gunner = new Joystick(1);
	private static OI INSTANCE;
	public static final int JOYSTICK_LIFT_DOWN2 = 1;
	public static final int JOYSTICK_LIFT_UP2 = 2;
	public static final int JOYSTICK_LIFT_UP = 5;
	public static final int JOYSTICK_LIFT_DOWN = 6;
	public static final int JOYSTICK_GRIPPER_CLOSE = 8;
	public static final int JOYSTICK_GRIPPER_OPEN = 7;

	private OI() {
		// this.gunner = new Joystick(1);
		JoystickButton liftDown = new JoystickButton(driver, JOYSTICK_LIFT_DOWN);
		JoystickButton liftUp = new JoystickButton(driver, JOYSTICK_LIFT_UP);
		JoystickButton gripperClose = new JoystickButton(driver,
				JOYSTICK_GRIPPER_CLOSE);
		JoystickButton gripperOpen = new JoystickButton(driver,
				JOYSTICK_GRIPPER_OPEN);
		// // JoystickButton liftUp2 = new JoystickButton(gunner,
		// JOYSTICK_LIFT_UP2);
		// JoystickButton liftDown2 = new JoystickButton(gunner,
		// JOYSTICK_LIFT_DOWN2);

		liftDown.whileHeld(new LiftDown());
		liftDown.whenReleased(new LiftStop());

		// liftDown2.whileHeld(new LiftDown());
		// liftDown2.whenReleased(new LiftStop());

		liftUp.whileHeld(new LiftUp());
		liftUp.whenReleased(new LiftStop());

		// liftUp2.whileHeld(new LiftUp());
		// liftUp2.whenReleased(new LiftStop());

		gripperClose.whileHeld(new GripperClose());
		gripperClose.whenReleased(new GripperStop());

		gripperOpen.whileHeld(new GripperOpen());
		gripperOpen.whenReleased(new GripperStop());
	}

	public static OI getInstance() {
		return INSTANCE;
	}

	public static void initialize() {
		if (INSTANCE == null) {
			INSTANCE = new OI();
		}
	}

	// public Joystick getGunnerJoystick() {
	// return gunner;
	// }

	public Joystick getDriverJoystick() {
		return driver;
	}
	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by its isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
