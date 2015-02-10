package org.first.team4533.robot.commands;

import org.first.team4533.robot.subsystems.LiftSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *This will cause the lifter to stop where it is?
 */
public class LiftStop extends Command {
	private LiftSystem lift;

	public LiftStop() {
		this.lift = LiftSystem.getInstance();
		requires(lift);
	}

	protected void execute() {
		this.lift.stop();
	}

	protected void end() {
		this.lift.stop();
	}

	protected void interrupted() {
		this.lift.stop();
	}

	protected void initialize() {
	}

	protected boolean isFinished() {
		return false;
	}
}
