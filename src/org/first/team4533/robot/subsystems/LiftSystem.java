package org.first.team4533.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.first.team4533.robot.RobotMap;

/**
 *This is the lift subsystem, it deals with anything involving the lifter and its components
 */
public class LiftSystem extends Subsystem {
	private static LiftSystem INSTANCE;
	private Talon liftMotor;
	private static final double DEFAULT_LIFT_STOP_VALUE = 0.0;
	private static final double DEFAULT_LIFT_UP_VALUE = 0.5;
	private static final double DEFAULT_LIFT_DOWN_VALUE = -0.5;

	private LiftSystem() {
		liftMotor = new Talon(RobotMap.MOTOR_LIFT);

	}

	public static LiftSystem getInstance() {
		return INSTANCE;
	}

	public static void initialize() {
		if (INSTANCE == null) {
			INSTANCE = new LiftSystem();
		}
	}

	public void up() {
		liftMotor.set(DEFAULT_LIFT_UP_VALUE);
	}

	public void down() {
		liftMotor.set(DEFAULT_LIFT_DOWN_VALUE);
	}

	public void stop() {
		liftMotor.set(DEFAULT_LIFT_STOP_VALUE);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
