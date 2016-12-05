package org.usfirst.frc.team6117.robot.commands;

import java.awt.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinUpShooter extends Command {

	public SpinUpShooter() { 
		requires(Robot.shooter); 
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		SetTragetSpeed();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		SpeedUp(); 
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		HoldSpeed();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end(); 
	}
}
