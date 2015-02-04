package org.first.team4533.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.first.team4533.robot.RobotMap;

/**
 *
 */
public class LiftSystem extends Subsystem {

	private static LiftSystem INSTANCE;
	private Talon liftMotor;

	private LiftSystem() {
		liftMotor = new Talon(RobotMap.MOTOR_LIFT);

	}
	public static LiftSystem getInstance() {
		return INSTANCE;
	}

	public static void initialize() {
		if (INSTANCE == null)
			INSTANCE = new LiftSystem();
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
