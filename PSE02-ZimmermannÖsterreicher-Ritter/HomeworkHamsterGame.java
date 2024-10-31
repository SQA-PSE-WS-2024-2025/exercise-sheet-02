package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 *
 * @author Finn Österreicher 3777877 st193897@stud.uni-stuttgart.de
 * @author Tim Zimmermann 3787155 st192571@stud.uni-stuttgart.de
 *
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/**
	 * Turns paule to the right by turning him left three times.
	 */
	void turnRight(){
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}

	/**
	 * Turns paule around by turning left twice.
	 */
	void turnAround(){
		paule.turnLeft();
		paule.turnLeft();
	}
	/**
	 * @param grainCount = current grainCount that is returned
	 * @return int grainCount = input GrainCount + Grains picked
	 * This function lets paule walk until he reaches a wall in front of him. He also picks up every grain on his way
	 */
	int moveAndPickWhileClear(int grainCount){
		while(paule.frontIsClear()) {
			paule.move();
			while(paule.grainAvailable()){
				paule.pickGrain();
				grainCount++;
			}
		}
		return grainCount;
	}
	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 4 * column 1 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.
		int grainCount = 0;
		while(true){
			if(grainCount != 7) {
				// First Grain
				grainCount = moveAndPickWhileClear(grainCount);
				turnRight();
				paule.move();
				paule.move();
				turnRight();
				// Second Grain
				grainCount = moveAndPickWhileClear(grainCount);
				paule.turnLeft();
				paule.move();
				turnRight();
				// Third Grain
				grainCount = moveAndPickWhileClear(grainCount);
				turnAround();
				grainCount = moveAndPickWhileClear(grainCount);
				turnRight();
				grainCount = moveAndPickWhileClear(grainCount);
				turnRight();
				// Fourth, Fifth, Sixth Grain
				grainCount = moveAndPickWhileClear(grainCount);
				turnAround();
				grainCount = moveAndPickWhileClear(grainCount);
				paule.turnLeft();
				grainCount = moveAndPickWhileClear(grainCount);
				turnRight();
				grainCount = moveAndPickWhileClear(grainCount);
				turnRight();
				// Seventh (Last) Grain -> Cave
				grainCount = moveAndPickWhileClear(grainCount);
			} else {
				while(grainCount != 0) {
					paule.putGrain();
					grainCount--;
				}
				break;
			}
		}
	}
}
