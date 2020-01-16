package com.village.animals;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public abstract class Animal {

	protected String name;
	protected String favFood;
	protected String bestFriend;
	
	List<Animal> friends;
	
	//public abstract void inviteFriend(List<Animal> animals);
	public abstract boolean isInviteAccepted(Animal animal);
	//public abstract void unFriend();
	
	public final void inviteFriend(List<Animal> animals) {
		int reqIndex = new Random().nextInt(animals.size());
		IntStream.range(0, reqIndex).forEach(frndslist -> {
			Collections.shuffle(animals);
			animals.stream().findAny().ifPresent(frndAnimal -> {
				if (!this.friends.stream().anyMatch(frnd -> frnd.name.equalsIgnoreCase(frndAnimal.name) || frndAnimal.name.equalsIgnoreCase(bestFriend))) {
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

	}
	
	public final void unFriend() {
		Collections.shuffle(friends);
		friends.stream().findAny().ifPresent(unfrndAnimal -> {
			if (bestFriend!=null && !unfrndAnimal.name.equalsIgnoreCase(bestFriend)) {
				unfrndAnimal.friends.removeIf(unfrnd -> unfrnd.name.equalsIgnoreCase(this.name));
				friends.remove(unfrndAnimal);
				System.out.println(this.name +" and " + unfrndAnimal.name +  " are not friends any more ");
			} else {
				System.out.println(this.name +" and " + unfrndAnimal.name + " are best friends,  so can't be unfriend");
			}
		});
	}
}
