package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 *
 * @author (Your name)
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave.
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// You can remove this line
		paule.write("I do not know how to continue:'(");

		// Move to the second grain
		// TODO:implement

		// Pick up the second grain
		// TODO:implement

		// Add further steps (comment + code) to collect all grains!
		// TODO:implement

		// Put down all grains in the cave
		// TODO:implement

	}
}
