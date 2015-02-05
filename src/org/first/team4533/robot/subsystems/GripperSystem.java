package org.first.team4533.robot.subsystems;

import org.first.team4533.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GripperSystem extends Subsystem {
    private static GripperSystem INSTANCE;
    private SpeedController gripperMotor;
    
    private GripperSystem(){
    	gripperMotor = new Talon(RobotMap.MOTOR_GRIPPER);
    }
    
    public static GripperSystem getInstance(){
    	return INSTANCE;
    }
    
    public static void initialize(){
    	if (INSTANCE == null)
    		INSTANCE = new GripperSystem();
    }
    
    public void open(){
    	this.gripperMotor.set(1.0);
    }
    
    public void close(){
    	this.gripperMotor.set(-1.0);
    }
    
    public void stop(){
    	this.gripperMotor.set(0.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

