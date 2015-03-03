package org.first.team4533.robot.autonomous;

import org.first.team4533.robot.commands.TimedDriveForward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DefaultAutonomous extends CommandGroup {
    
	private static final long DRIVE_FORWARD_DURATION = 2500;
	
    public  DefaultAutonomous() {
    	this.addSequential(new TimedDriveForward(DRIVE_FORWARD_DURATION));
    }
}
