package com.village.animals;

import java.util.List;
import java.util.stream.Collectors;

public class DayEnd {

	public void showFrndsList(List<Animal> animals) {
		List<String> animalNames = animals.parallelStream().map(ttt -> ttt.name).collect(Collectors.toList());
		System.out.print("|   ");
		// animalNames.forEach(System.out::print);
		animalNames.forEach(name -> {
			System.out.print("|" + name);
		});
		System.out.println();

		animals.forEach(animal -> {
			System.out.print("|");
			System.out.print(animal.name);
			animalNames.forEach(animalName -> {
				System.out.print("|");
				if (animal.friends.parallelStream().anyMatch(w -> w.name.equalsIgnoreCase(animalName))) {
					System.out.print(" X ");
				}else if(animal.name.equalsIgnoreCase(animalName)) {
					System.out.print(" / ");
				} else {
					System.out.print("   ");
				}
			});
			System.out.println("|");
		});

	}
}
