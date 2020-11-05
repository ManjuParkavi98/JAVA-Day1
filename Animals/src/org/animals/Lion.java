package org.animals;

public class Lion {
	 private int weight,age;
	 private String color;
	 public void setNumber(String color,int weight,int age) {
		 this.color=color;
		 this.weight=weight;
		 this.age=age;
	 }
	 public void isVegetarian() {
		 System.out.println("Lion");
		 System.out.println(color);
		 System.out.println(weight);
		 System.out.println(age);
		 System.out.println("Carnivorous");
	 }
	 public void canClimb() {
		 System.out.println("Can climb");
	 }
	 public void Sound() {
		 System.out.println("Roar");
	 }
}
