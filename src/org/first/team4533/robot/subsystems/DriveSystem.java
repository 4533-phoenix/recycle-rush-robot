package org.first.team4533.robot.subsystems;

import org.first.team4533.robot.RobotMap;
import org.first.team4533.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveSystem extends Subsystem {
    
    public static final DriveSystem INSTANCE = new DriveSystem();
    private Talon leftFront;
    private Talon rightFront;
    private Talon leftRear;
    private Talon rightRear;
    private RobotDrive robotDrive;
    
    private DriveSystem(){
    	leftFront = new Talon(RobotMap.MOTOR_LEFT_FRONT);
    	rightFront = new Talon(RobotMap.MOTOR_RIGHT_FRONT);
    	leftRear = new Talon(RobotMap.MOTOR_LEFT_REAR);
    	rightRear = new Talon(RobotMap.MOTOR_RIGHT_REAR);
    	robotDrive = new RobotDrive(this.leftFront, this.leftRear, this.rightFront, this.rightRear);
    	robotDrive.setInvertedMotor(MotorType.kFrontRight, true);
    	robotDrive.setInvertedMotor(MotorType.kRearRight, true);
    }
    
    public static DriveSystem getInstance(){
    	return INSTANCE;
    }
    
    public void driveWithJoystick(Joystick driver){
    	double x = -driver.getX() * 0.80;
    	double y = driver.getY() * 0.80;
    	double rot = driver.getZ() * 0.80;
    	this.robotDrive.mecanumDrive_Cartesian(x, y, rot, 0.0);
    }
    
    public void forward(double value) {
        this.robotDrive.mecanumDrive_Cartesian(0.0, -value, 0.0, 0.0);
    }
    
    public void forward(){
    	this.forward(1.0);
    }
    
    public void backward(double value) {
        this.robotDrive.mecanumDrive_Cartesian(0.0, value, 0.0, 0.0);
    }
	
    public void backward(){
    	this.backward(1.0);
    }
    
    public void stop() {
        this.robotDrive.mecanumDrive_Cartesian(0.0, 0.0, 0.0, 0.0);
    }
    
    public void driveLeft(double value){
    	this.robotDrive.mecanumDrive_Cartesian(-value, 0.0, 0.0, 0.0);
    }
    
    public void driveLeft(){
    	this.driveLeft(1.0);
    }
    
    public void driveRight(double value){
    	this.robotDrive.mecanumDrive_Cartesian(value, 0.0, 0.0, 0.0);
    }
    
    public void driveRight(){
    	this.driveRight(1.0);
    }
    
    public void initDefaultCommand() {
        this.setDefaultCommand(new DriveWithJoystick());
    }
}

