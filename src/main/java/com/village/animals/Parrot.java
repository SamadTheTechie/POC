package com.village.animals;

import java.util.ArrayList;

public class Parrot extends Animal {

	private String wingSpan;
	private boolean canSpeak;

	private Parrot(ParrotBuilder parrotBuilder) {
		this.setName(parrotBuilder.name);
		this.setFavFood(parrotBuilder.favFood);
		this.setwingSpan(parrotBuilder.wingSpan);
		this.setCanSpeak(parrotBuilder.canSpeak);
		this.setBestFriend(parrotBuilder.bestFriend);
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

	public String getwingSpan() {
		return wingSpan;
	}

	public void setwingSpan(String wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getBestFriend() {
		return bestFriend;
	}

	public void setBestFriend(String bestFriend) {
		this.bestFriend = bestFriend;
	}

	public static class ParrotBuilder {

		private String name;
		private String favFood;

		private String wingSpan;
		private String bestFriend;
		private boolean canSpeak;

		public ParrotBuilder(String name, String favFood) {
			this.name = name;
			this.favFood = favFood;
		}

		public ParrotBuilder withWingSpan(String wingSpan) {
			this.wingSpan = wingSpan;
			return this;
		}

		public ParrotBuilder withBestFriend(String bestFriend) {
			this.bestFriend = bestFriend;
			return this;
		}
		
		public ParrotBuilder canSpeak(boolean canSpeak) {
			this.canSpeak = canSpeak;
			return this;
		}

		public Parrot create() {
			return new Parrot(this);
		}
	}

	@Override
	public boolean isInviteAccepted(Animal animal) {
		return animal instanceof Parrot ? false : true;
	}

	public boolean canSpeak() {
		return canSpeak;
	}

	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}

	@Override
	public String toString() {
		return "Parrot [wingSpan=" + wingSpan + ", canSpeak=" + canSpeak + ", name=" + name + ", favFood=" + favFood
				+ ", bestFriend=" + bestFriend + "]";
	}

}
