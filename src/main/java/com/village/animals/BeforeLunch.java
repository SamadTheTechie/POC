package com.village.animals;

import java.util.List;

public class BeforeLunch {

	public void unFriendBeforeLunch(List<Animal> animals) {
		animals.stream().forEach(animal -> animal.unFriend());
	}
}
