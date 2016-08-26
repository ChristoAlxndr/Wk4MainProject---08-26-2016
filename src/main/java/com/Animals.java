package com;

public class Animals {

	private String animalID = null;
	private String species = null;
	private String animalName = null;
	private String habitat = null;
	private String diet = null;
	private double weight = 0.0d;
	private int age = 0;
	
	
	public Animals() {
		super();
	}


	public String getAnimalID() {
		return animalID;
	}


	public void setAnimalID(String animalID) {
		this.animalID = animalID;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getDiet() {
		return diet;
	}


	public void setDiet(String diet) {
		this.diet = diet;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Animals [animalID=" + animalID + ", species=" + species + ", animalName=" + animalName + ", habitat="
				+ habitat + ", diet=" + diet + ", weight=" + weight + ", age=" + age + "]";
	}
	
}
