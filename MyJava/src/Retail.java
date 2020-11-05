
public class Retail {

	public static void main(String[] args) {
		double amount;
		Shopkeeper shopkeeper=new Shopkeeper();
		shopkeeper.setNumber(2, 3);
        amount=shopkeeper.getPrice();	
        System.out.println("Total Retail Price: "+amount);

	}

}
