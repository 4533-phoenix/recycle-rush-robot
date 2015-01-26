package org.first.team4533.robot.subsystems;

import org.first.team4533.robot.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.first.team4533.robot.RobotMap;
/**
 *
 */
public class DriveSystem extends Subsystem {
    
    private static final DriveSystem INSTANCE = new DriveSystem();
    private Talon leftFront = new Talon(RobotMap.TALON_LEFT_FRONT);
    private Talon rightFront = new Talon(RobotMap.TALON_RIGHT_FRONT);
    private Talon leftRear = new Talon(RobotMap.TALON_LEFT_REAR);
    private Talon rightRear = new Talon(RobotMap.TALON_RIGHT_REAR);
    private RobotDrive robotDrive = new RobotDrive(this.leftFront, this.leftRear, this.rightFront, this.rightRear);
    
    public void driveForward(double value) {
        this.robotDrive.mecanumDrive_Cartesian(0.0, -value, 0.0, 0.0);
    }
    
    public void driveForward(){
    	this.driveForward(1.0);
    }
    
    public void driveBackward(double value) {
        this.robotDrive.mecanumDrive_Cartesian(0.0, value, 0.0, 0.0);
    }
	
    public void driveBackward(){
    	this.driveForward(1.0);
    }
    
    public void stop() {
        this.robotDrive.mecanumDrive_Cartesian(0.0, 0.0, 0.0, 0.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

