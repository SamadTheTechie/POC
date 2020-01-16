package com.village.animals;

import java.util.ArrayList;

public class Chicken extends Animal {

	private String wingSpan;
	private boolean laysEggs;

	private Chicken(ChickenBuilder chickenBuilder) {
		this.setName(chickenBuilder.name);
		this.setFavFood(chickenBuilder.favFood);
		this.setwingSpan(chickenBuilder.wingSpan);
		this.setLaysEggs(chickenBuilder.laysEggs);
		this.setBestFriend(chickenBuilder.bestFriend);
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

	public static class ChickenBuilder {

		private String name;
		private String favFood;

		private String wingSpan;
		private String bestFriend;
		private boolean laysEggs;

		public ChickenBuilder(String name, String favFood) {
			this.name = name;
			this.favFood = favFood;
		}

		public ChickenBuilder withWingSpan(String wingSpan) {
			this.wingSpan = wingSpan;
			return this;
		}

		public ChickenBuilder withBestFriend(String bestFriend) {
			this.bestFriend = bestFriend;
			return this;
		}
		
		public ChickenBuilder isLaysEggs(boolean laysEggs) {
			this.laysEggs = laysEggs;
			return this;
		}

		public Chicken create() {
			return new Chicken(this);
		}
	}

	@Override
	public boolean isInviteAccepted(Animal animal) {
		return animal instanceof Chicken ? false : true;
	}

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	@Override
	public String toString() {
		return "Chicken [wingSpan=" + wingSpan + ", laysEggs=" + laysEggs + ", name=" + name + ", favFood=" + favFood
				+ ", bestFriend=" + bestFriend + "]";
	}


}
