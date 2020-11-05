
public class StuDetails {
  private int MarkInEng,MarkInMath,MarkInScience,RollNo;
  private String StudName;
  public void setNumber(String StudName,int RollNo,int MarkInEng,int MarkInMath,int MarkInScience)
  {
	this.StudName=StudName;
	this.RollNo=RollNo;
	this.MarkInEng=MarkInEng;
	this.MarkInMath=MarkInMath;
	this.MarkInScience=MarkInScience;
  }
  public void getNumber()
  {
	 
      System.out.println("RollNo: "+RollNo);
      System.out.println("Name: "+StudName);
	  System.out.println("Maths Mark: "+MarkInMath);
	  System.out.println("English Mark: "+MarkInEng);
	  System.out.println("science Mark: "+MarkInScience);
  }
}
