package org.usfirst.frc.team6117.robot.commands;

public class AutonomousCommand extends ExampleCommand {

	public AutonomousCommand() {
		addSequential(new Aim()); 
		addSequential(new SpinUpShooter()); 
		addSequential(new Shoot()); 


	}

}
