package org.first.team4533.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.first.team4533.robot.RobotMap;

/**
 *This is the lift subsystem, it deals with anything involving the lifter and its components
 */
public class LiftSystem extends Subsystem {
	private static LiftSystem INSTANCE;
	private CANTalon liftMotor;
	private static final double DEFAULT_LIFT_STOP_VALUE = 0.0;
	private static final double DEFAULT_LIFT_UP_VALUE = 1.0;
	private static final double DEFAULT_LIFT_DOWN_VALUE = -1.0;

	private LiftSystem() {
		liftMotor = new CANTalon(RobotMap.MOTOR_LIFT);
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
	}

}
