package org.first.team4533.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.first.team4533.robot.RobotMap;

/**
 *
 */
public class LiftSystem extends Subsystem {
	
	private static final LiftSystem INSTANCE = new LiftSystem();
    private Talon liftMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private LiftSystem() {
    	liftMotor = new Talon(RobotMap.LIFT_MOTOR);
    }
    public static LiftSystem getInstance() {
    	return INSTANCE;
    }
    
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}

