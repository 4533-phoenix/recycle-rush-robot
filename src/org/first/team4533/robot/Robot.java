
package org.first.team4533.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.first.team4533.robot.autonomous.DefaultAutonomous;
import org.first.team4533.robot.subsystems.DriveSystem;
import org.first.team4533.robot.subsystems.GripperSystem;
import org.first.team4533.robot.subsystems.LiftSystem;

/**
 * Main class that is executed when robot is turned on
 */
public class Robot extends IterativeRobot {

    private Command autonomousCommand;

    private CameraServer cameraServer;

    public void robotInit() {
        cameraServer = CameraServer.getInstance();
        cameraServer.setQuality(50);
        cameraServer.startAutomaticCapture("cam0");

		DriveSystem.initialize();
		LiftSystem.initialize();
        GripperSystem.initialize();
        OI.initialize();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        this.autonomousCommand = new DefaultAutonomous();
        this.autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void disabledInit(){

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
