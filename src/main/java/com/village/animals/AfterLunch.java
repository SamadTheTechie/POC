package com.village.animals;

import java.util.List;

public class AfterLunch {

	/**
	 * parallel stream can be implemented but for now used streams
	 * @param animals
	 */
	public void beFriends(List<Animal> animals) {
		long startTime1 = System.currentTimeMillis();
		animals.stream().forEach(animal -> {
			animal.inviteFriend(animals);
		});

		long endTime1 = System.currentTimeMillis();
		double sequentialStreamTimetaken1 = (endTime1 - startTime1);
		System.out.println("Time required with stream() : " + sequentialStreamTimetaken1);
	}
}
