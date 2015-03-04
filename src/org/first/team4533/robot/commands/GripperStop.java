package org.first.team4533.robot.commands;

import org.first.team4533.robot.subsystems.GripperSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GripperStop extends Command {
	private GripperSystem gripper;

	public GripperStop() {
		this.gripper = GripperSystem.getInstance();
		requires(gripper);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		this.gripper.stop();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		this.gripper.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		this.gripper.stop();
	}
}
