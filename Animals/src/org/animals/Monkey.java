package org.animals;

public class Monkey {
	 private int weight,age;
	 private String color;
	 public void setNumber(String color,int weight,int age) {
		 this.color=color;
		 this.weight=weight;
		 this.age=age;
	 }
	 public void isVegetarian() {
		 System.out.println("Monkey");
		 System.out.println(color);
		 System.out.println(weight);
		 System.out.println(age);
		 System.out.println("Omnivores");
	 }
	 public void canClimb() {
		 System.out.println("Can climb");
	 }
	 public void Sound() {
		 System.out.println("Scream");
	 }
}
