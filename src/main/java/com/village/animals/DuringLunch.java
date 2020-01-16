package com.village.animals;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuringLunch {

	public void groupByFood(List<Animal> animals) {
		Map<String, List<Animal>> favFoodTeam = animals.stream().collect(Collectors.groupingBy(zzz -> zzz.favFood));

		favFoodTeam.entrySet().forEach(food -> {
			food.getValue().forEach((val) -> {
				System.out.print(val.name + " and ");
			});
			System.out.println(" are eating " + food.getKey());
		});
	}
}
