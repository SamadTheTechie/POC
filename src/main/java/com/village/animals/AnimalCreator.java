package com.village.animals;

import java.util.List;

public class AnimalCreator {
	
	// even this hard-coded value can be retrieved through Reflection API..but for time being hard-coded
	Animal rex = new Dog.DogBuilder("Rex", "RoyalCanin").withBreed("Shepherd").withBestFriend("Tom").create();
	Animal max = new Dog.DogBuilder("Max", "Purina ONE").withBreed("Shepherd").withBestFriend("Jay").create();
	Animal tom = new Dog.DogBuilder("Tom", "RoyalCanin").withBreed("Husky").withBestFriend("Rex").create();
	Animal jay = new Dog.DogBuilder("Jay", "“Purina ONE").withBreed("Husky").withBestFriend("Max").create();


	Animal zoe = new Cat.CatBuilder("Zoe", "9Lives").withBestFriend("Ada").create();
	Animal ada = new Cat.CatBuilder("Ada", "Purina Friskies").withBestFriend("Zoe").create();
	
	Animal meg =  new Chicken.ChickenBuilder("Meg", "Purina Layena").withBestFriend("Lis").isLaysEggs(true).withWingSpan("0.4m").create();
	Animal lis =  new Chicken.ChickenBuilder("Lis", "Manna Pro").withBestFriend("Meg").isLaysEggs(true).withWingSpan("0.35m").create();
	Animal emi =  new Chicken.ChickenBuilder("Emi", "Purina Layena").withBestFriend("Lua").isLaysEggs(false).withWingSpan("0.2m").create();
	Animal lua =  new Chicken.ChickenBuilder("Lua", "Manna Pro").withBestFriend("Emi").isLaysEggs(false).withWingSpan("0.3m").create();
	
	
	Animal mac =  new Parrot.ParrotBuilder("Mac", "Lafeber Original").withBestFriend("Alf").canSpeak(true).withWingSpan("0.33m").create();
	Animal alf =  new Parrot.ParrotBuilder("Alf", "Kaytee Fiesta").withBestFriend("Mac").canSpeak(false).withWingSpan("0.25m").create();

	
	public AnimalCreator() {
		
	}

	public void createAnimals(List<Animal> animals) {
		animals.add(rex);
		animals.add(max);
		animals.add(tom);
		animals.add(jay);
		
		animals.add(zoe);
		animals.add(ada);
		animals.add(meg);
		animals.add(lis);
		
		animals.add(emi);
		animals.add(lua);
		animals.add(mac);
		animals.add(alf);

		System.out.println("------------------- Adding best friends ---------------------------");
		animals.stream().forEach(a -> {
			animals.parallelStream().filter(b -> b.name.equalsIgnoreCase(a.bestFriend)).findFirst().ifPresent(bff -> a.friends.add(bff));
			//a.friends.add(animals.parallelStream().filter(b -> b.bestFriend!=null && b.bestFriend.equalsIgnoreCase(a.bestFriend)).findFirst().get());
		});

	}
	
	
}
