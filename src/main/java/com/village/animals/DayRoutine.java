package com.village.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DayRoutine {

	public static void main(String[] args) {

		List<Animal> animals = new ArrayList<>();
		
		AnimalCreator animalCreator = new AnimalCreator();
		animalCreator.createAnimals(animals);
		
		IntStream.range(1, 11).forEach(day -> {

		System.out.println("------------------- Day "+ day + " Starts ---------------------------");
		animals.parallelStream().forEach(System.out::println);

		System.out.println("------------------- Before Lunch ---------------------------");
		BeforeLunch beforeLunch = new BeforeLunch();
		beforeLunch.unFriendBeforeLunch(animals);

		// during lunch
		System.out.println("------------------- During Lunch ---------------------------");
		DuringLunch duringLunch = new DuringLunch();
		duringLunch.groupByFood(animals);

		System.out.println("------------------- After Lunch ---------------------------");
		//parallel stream can be implemented but for now used streams
		AfterLunch afterLunch = new AfterLunch();
		afterLunch.beFriends(animals);

		// day end
		System.out.println("------------------- Day " +day+ " Ends ---------------------------");
		DayEnd dayEnd = new DayEnd();
		dayEnd.showFrndsList(animals);
		
		System.out.println("================================================");
		
		
		});
	} 

}
