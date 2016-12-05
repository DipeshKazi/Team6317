package org.usfirst.frc.team6117.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class DoubleButton {
 ControlStick = new Joystick(1);

	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
	double value; 
	value = ControlStick.getX() ;
	value = ControlStick.getY();
	value = ControlStick.getZ(); 
	value = ControlStick.getTHrottle(); 
	value = ControlStick.getTwist();

	
	
	boolean buttonValue; 
	buttonValue =  ControlStick.getTop();
	buttonValue = (boolean) ControlStick.getTrigger();
	
	
	}

}

