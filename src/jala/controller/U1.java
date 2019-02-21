package jala.controller;

public class U1 extends Rocket{

	/**
	 * Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)
	 */
	
	final static int PROBABILITY_LAUNCH = 5;
	final static int PROBABILITY_LAND = 1;
	
	public U1() {
		super(100000000,10,18,PROBABILITY_LAUNCH,PROBABILITY_LAND);
	}
	
}
