package org.first.team4533.robot.subsystems;

import org.first.team4533.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 *
 */
public class GripperSystem extends Subsystem {
    private static GripperSystem INSTANCE;
    private SpeedController gripperMotor;
    private AnalogPotentiometer magnetopot = new AnalogPotentiometer(0, 3.3);
    
    private static final double MAX_OPEN_VALUE = 3.0;
    private static final double MIN_OPEN_VALUE = 0.3;
    
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
//    	if (this.magnetopot.get() > MIN_OPEN_VALUE) {
//        	this.gripperMotor.set(0.5);    		
//    	}
    	this.gripperMotor.set(0.5);
    	System.out.println(magnetopot.get() + " is the Value.");
    }
    
    public void close(){
//    	if (this.magnetopot.get() < MAX_OPEN_VALUE) {
//        	this.gripperMotor.set(-0.5);
//    	}
    	this.gripperMotor.set(-0.5);
    	System.out.println(magnetopot.get() + " is the Value.");
    }
    
    public void stop(){
    	this.gripperMotor.set(0.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

