package jala.controller;

public class U2 extends Rocket {
/**
 * Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)

 */
	final static int PROBABILITY_LAUNCH = 4;
	final static int PROBABILITY_LAND = 8;

	public U2() {
		super(120000000,18,29,PROBABILITY_LAUNCH,PROBABILITY_LAND);
	}
	
}
