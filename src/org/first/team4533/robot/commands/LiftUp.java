package org.first.team4533.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.first.team4533.robot.subsystems.LiftSystem;

/**
 *
 */
public class LiftUp extends Command {
	private LiftSystem lift;

    public LiftUp() {
        this.lift = LiftSystem.getInstance();
    }

    protected void execute() {
    	this.lift.up();
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
