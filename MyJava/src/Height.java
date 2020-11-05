
public class Height {
 private int feet,inches;
 public void inputHeight(int feet,int inches) {
	 this.feet=feet;
	 this.inches=inches;
 }
 public void getHeight() {
	 System.out.println(""+feet+"feet"+" "+inches+"inches");
 }
 public void addHeight(Height h1,Height h2) {
	 int newinch,newfeet;
	 newfeet=h1.feet+h2.feet;
	 newinch=h1.inches+h2.inches;
	 System.out.println("Total Feet:"+newfeet);
	 System.out.println("Total Inch:"+newinch);
	 newfeet+=newinch/12;
	 newinch=newinch%12;
	 System.out.println("Total Height:"+newfeet+"feet"+" "+newinch+"inches");
 }
}
