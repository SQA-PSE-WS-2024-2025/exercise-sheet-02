package de.unistuttgart.iste.sqa.pse.sheet02.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * Mysterious hamsters are a mystery, their actions are very mysterious.
 *
 * Class for exercise 3 on sheet 02.
 *
 * @author (Your name)
 *
 */
public final class MysteriousHamster {
	private Integer stepCounter = 0;
	private Hamster hamster;

	/**
	 * This constructor allows to access methods of a mysterous hamster on a specified hamster.
	 * @param hamster A mysterioshamster-object will be created from this hamster.
	 */
	public MysteriousHamster(final Hamster hamster) {
		this.hamster = hamster;
	}

	/**
	 * Turns the hamster to the left.
	 */
	void turnHamsterLeft() {
		hamster.turnLeft();
	}

	/**
	 * Moves the hamster, increases the stepCounter and prints the stepCounter.
	 */
	void moveHamsterAndCount() {
		hamster.move();
		stepCounter++;
		hamster.write("I have already walked " + stepCounter + " steps.");
	}

	/**
	 * Turns the hamster around by turning him left twice.
	 */
	void turnHamsterAround() {
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Turns the hamster to his right by turning him left three times.
	 */
	void turnHamsterRight() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Returns the Step Counter
	 * @return int stepCounter
	 */
	int getStepCounter() {
		return stepCounter;
	}

	/**
	 * Hamster writes the stepCounter
	 */
	void hamsterWriteStepCounter() {
		hamster.write(stepCounter.toString());
	}

	/**
	 * Hamster picks up a grain
	 */
	void hamsterPickGrain() {
		hamster.pickGrain();
	}

	/**
	 * Hamster writes 'I'm done! :)'
	 */
	void hamsterWriteDone() {
		hamster.write("I'm done! :)");
	}

	/**
	 * Hamster moves, increases the step counter and puts all grains down.
	 * Then he moves again and increases the step counter.
	 */
	void hamsterMoveDropGrainMove() {
		hamster.move();
		stepCounter++;
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
		}
		hamster.move();
		stepCounter++;
	}
	/**
	 * This method is used to grant mysterioushamster-objects access the {@link Hamster#write(String)} method.
	 * @param text This text will be printed out in the game log.
	 */
	void write(final String text) {
		hamster.write(text);
	}
}
