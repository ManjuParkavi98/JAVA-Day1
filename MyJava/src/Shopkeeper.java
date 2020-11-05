
public class Shopkeeper {
     private int productnumber,quantity_sold;
     private float total_retail;
    public void setNumber(int productnumber,int quantity_sold) {
    	this.productnumber=productnumber;
    	this.quantity_sold=quantity_sold;
    }
    public float getPrice() { 
    	
	switch(productnumber){
	case 1:
	total_retail+=22.50*quantity_sold;
	break;
	case 2:
	total_retail+=44.50*quantity_sold;
	break;
	case 3:
	total_retail+=9.98*quantity_sold;
	break;
	default:
		System.out.println("Enter valid product number");
     }
	return total_retail;
  }
}