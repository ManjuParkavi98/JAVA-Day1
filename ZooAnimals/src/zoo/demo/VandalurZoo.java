package zoo.demo;
import org.animals.*;
public class VandalurZoo {

	public static void main(String[] args) {
		Elephant ele=new Elephant();
		Girafee gira=new Girafee();
		Lion leo=new Lion();
		Monkey monk=new Monkey();
		Tiger tiger=new Tiger();
		ele.setNumber("Black",2268,15);
		ele.isVegetarian();
		ele.canClimb();
		ele.Sound();
		gira.setNumber("Brown",354,15);
		gira.isVegetarian();
		gira.canClimb();
		gira.Sound();
		leo.setNumber("Orange-Brown",300,15);
		leo.isVegetarian();
		leo.canClimb();
		leo.Sound();
		monk.setNumber("Black",200,15);
		monk.isVegetarian();
		monk.canClimb();
		monk.Sound();
		tiger.setNumber("Brown",220,15);
		tiger.isVegetarian();
		tiger.canClimb();
		tiger.Sound();

	}

}
