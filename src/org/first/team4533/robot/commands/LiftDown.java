package org.first.team4533.robot.commands;

import org.first.team4533.robot.subsystems.LiftSystem;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This will make the lifter to go down?
 */
public class LiftDown extends Command {
	private LiftSystem lift;

	public LiftDown() {
		this.lift = LiftSystem.getInstance();
		this.requires(lift);
	}

	protected void execute() {
		this.lift.down();
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
