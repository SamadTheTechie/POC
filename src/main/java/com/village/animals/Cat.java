package com.village.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Cat extends Animal {

	private String breed;

	private Cat(CatBuilder catBuilder) {
		this.setName(catBuilder.name);
		this.setFavFood(catBuilder.favFood);
		this.setBreed(catBuilder.breed);
		this.setBestFriend(catBuilder.bestFriend);
		this.friends = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBestFriend() {
		return bestFriend;
	}

	public void setBestFriend(String bestFriend) {
		this.bestFriend = bestFriend;
	}

	public static class CatBuilder {

		private String name;
		private String favFood;

		private String breed;
		private String bestFriend;

		public CatBuilder(String name, String favFood) {
			this.name = name;
			this.favFood = favFood;
		}

		public CatBuilder withBreed(String breed) {
			this.breed = breed;
			return this;
		}

		public CatBuilder withBestFriend(String bestFriend) {
			this.bestFriend = bestFriend;
			return this;
		}

		public Cat create() {
			return new Cat(this);
		}
	}

	// @Override
	// public void run() {
	// unFriend();
	// inviteFriend();
	// }

	/*@Override
	public boolean inviteFriend(List<Animal> animals) {
		System.out.println("comes in here");
		int reqIndex = new Random().nextInt(animals.size());
		//int reqIndex = 4;
		System.out.println("animals.size() " + animals.size());
		System.out.println("reqIndex " + reqIndex);
		IntStream.range(0, reqIndex).forEach(frndslist -> {
			System.out.println("executed ");
			Collections.shuffle(animals);
			animals.stream().findAny().ifPresent(frndAnimal -> {
				if (!this.friends.stream().anyMatch(frnd -> frnd.name.equalsIgnoreCase(frndAnimal.name))) {
					System.out.println(this.name + " asking " + frndAnimal.name + " to be friends");
					if (frndAnimal.isInviteAccepted(this)) {
						this.friends.add(frndAnimal);
						System.out.println(frndAnimal.name + " and " + this.name + " are friends now");
					} else {
						System.out.println(frndAnimal.name + " doesn't want to be a friend of " + this.name);
					}
				}
			});
		});
		
		return true;

	}

	@Override
	public void unFriend() {
		Collections.shuffle(friends);
		friends.stream().findAny().ifPresent(unfrndAnimal -> {
			//System.out.println("unfrndAnimal.name " + unfrndAnimal.name  + " - "  + name);
			if (bestFriend!=null && !unfrndAnimal.name.equalsIgnoreCase(bestFriend)) {
				unfrndAnimal.friends.removeIf(unfrnd -> unfrnd.name.equalsIgnoreCase(this.name));
				friends.remove(unfrndAnimal);
				System.out.println(this.name +" and " + unfrndAnimal.name +  " are not friends any more ");
			} else {
				System.out.println(this.name +" and " + unfrndAnimal.name + " are best friends,  so can't be unfriend");
			}
		});
	} */

	@Override
	public boolean isInviteAccepted(Animal animal) {
		return animal instanceof Cat ? false : true;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", favFood=" + favFood + ", bestFriend=" + bestFriend
				+ "]";
	}

}
