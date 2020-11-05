
public class HeightDemo {

	public static void main(String[] args) {
		Height height1=new Height();
		height1.inputHeight(5,9);
		height1.getHeight();
		Height height2=new Height();
		height2.inputHeight(3,5);
		height2.getHeight();

		Height height3=new Height();
		height3.addHeight(height1,height2);
		

	}

}
