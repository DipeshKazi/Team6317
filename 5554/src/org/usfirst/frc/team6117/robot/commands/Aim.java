package org.usfirst.frc.team6117.robot.commands;

import java.awt.Robot;

public class Aim extends AutonomousCommand {

	public Aim () {
		requires(Robot.turret); 
	}
	protected void initialize() { 
		SetTargetAngle();
	}
	


		
	public void SetTargetAngle() {
		// TODO Auto-generated method stub
		
	}




	
	protected void execute() { 
		CorrectAngle(); 
	}
	
public void CorrectAngle() {
		// TODO Auto-generated method stub
		
	}
protected boolean  isFinished() { 
		
		return AtRightAngle(); 

	}
public boolean AtRightAngle() {
	// TODO Auto-generated method stub
	return (Boolean) null;
}
protected void end() { 
	HoldAngle(); 
}

	public void HoldAngle() {
	// TODO Auto-generated method stub
	
}
	protected void interrupted() { 
		end(); 
	}

}
