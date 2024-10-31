package de.unistuttgart.iste.sqa.pse.sheet02.presence;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * A simple HamsterGame where paule can walk a path of grains
 */
public class ExerciseHamsterGame extends InternalExerciseHamsterGame {

	/**
	 * Make Paule turn right, e.g., if Paule looks to the north, he should look to
	 * the east after this operation got executed.
	 */
	public void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}

	public Hamster getHamster() {
		return paule;
	}

	@Override
	void hamsterRun() {
		int grainCount = 0;
		while(paule.frontIsClear()){
			if(grainCount == 5){
				paule.putGrain();
				grainCount = 0;
			}
			paule.move();
			if(paule.grainAvailable()){
				paule.pickGrain();
				grainCount++;
			}

			paule.write("My name is Paule!");
		}
		// TODO your code for A4 goes here.
	}
}
