package org.first.team4533.robot.commands;

import org.first.team4533.robot.subsystems.LiftSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftDown extends Command {
	private LiftSystem lift;

    public LiftDown() {
        this.lift = LiftSystem.getInstance();
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
		// TODO Auto-generated method stub
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
