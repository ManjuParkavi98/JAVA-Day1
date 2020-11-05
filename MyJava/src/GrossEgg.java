
public class GrossEgg {
	
	private int number,gross;
	public void setNumber(int number){
	this.number=number;
	}
	public int getGross()
	{
	int num=number;
	gross=num/144;
	return gross;
	}
}
