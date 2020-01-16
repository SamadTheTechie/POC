package com.village.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Dog extends Animal {

	private String breed;

	private Dog(DogBuilder dogBuilder) {
		this.setName(dogBuilder.name);
		this.setFavFood(dogBuilder.favFood);
		this.setBreed(dogBuilder.breed);
		this.setBestFriend(dogBuilder.bestFriend);
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

	public static class DogBuilder {

		private String name;
		private String favFood;

		private String breed;
		private String bestFriend;

		public DogBuilder(String name, String favFood) {
			this.name = name;
			this.favFood = favFood;
		}

		public DogBuilder withBreed(String breed) {
			this.breed = breed;
			return this;
		}

		public DogBuilder withBestFriend(String bestFriend) {
			this.bestFriend = bestFriend;
			return this;
		}

		public Dog create() {
			return new Dog(this);
		}
	}

	/*@Override
	public void inviteFriend(List<Animal> animals) {
		inviteFrindInVillage(animals);
		/*
		 * int reqIndex = new Random().nextInt(animals.size()); IntStream.range(0,
		 * reqIndex).forEach(frndslist -> { Collections.shuffle(animals);
		 * animals.stream().findAny().ifPresent(frndAnimal -> { if
		 * (!this.friends.stream().anyMatch(frnd ->
		 * frnd.name.equalsIgnoreCase(frndAnimal.name) ||
		 * frndAnimal.name.equalsIgnoreCase(bestFriend))) { System.out.println(this.name
		 * + " asking " + frndAnimal.name + " to be friends"); if
		 * (frndAnimal.isInviteAccepted(this)) { this.friends.add(frndAnimal);
		 * System.out.println(frndAnimal.name + " and " + this.name +
		 * " are friends now"); } else { System.out.println(frndAnimal.name +
		 * " doesn't want to be a friend of " + this.name); } } }); });
		 * 
		 *}

	@Override
	public void unFriend() {
		 unFriendInVillage();
		/*
		 * Collections.shuffle(friends);
		 * friends.stream().findAny().ifPresent(unfrndAnimal -> { if (bestFriend!=null
		 * && !unfrndAnimal.name.equalsIgnoreCase(bestFriend)) {
		 * unfrndAnimal.friends.removeIf(unfrnd ->
		 * unfrnd.name.equalsIgnoreCase(this.name)); friends.remove(unfrndAnimal);
		 * System.out.println(this.name +" and " + unfrndAnimal.name +
		 * " are not friends any more "); } else { System.out.println(this.name +" and "
		 * + unfrndAnimal.name + " are best friends,  so can't be unfriend"); } });
		 *} */

	@Override
	public boolean isInviteAccepted(Animal animal) {
		return animal instanceof Dog ? false : true;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", favFood=" + favFood + ", bestFriend=" + bestFriend + "]";
	}

}
