package jala.controller;

import jala.data.Item;

public interface SpaceShip {

	
	/**
	 * launch: a method that returns either true or false indicating if the launch 
       was successful or if the rocket has crashed
	 * @return boolean
	 */
	public boolean launch();
	
	/**
	 * land: a method that also returns either true or false based on the success of the landing.
	 * @return
	 */
	public boolean land();
	/**
	 * canCarry: a method that takes an Item as an argument and returns true if the
              rocket can carry such item or false if it will exceed the weight limit.
	 */
	public boolean canCarry(Item item);
	
	/**
	 * carry: a method that also takes an Item object and updates the current weight
           of the rocket.
	 */
	public void carry(Item item);
}
