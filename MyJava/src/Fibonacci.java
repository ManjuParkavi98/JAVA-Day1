
public class Fibonacci {

	public static void main(String[] args) {
		 int n1=0,n2=1,temp=0;
		while(temp<200)
		 {
			 System.out.println(temp+" ");
			 temp=n1+n2;
			 n1=n2;
			 n2=temp;
			
		 }
		
	}

}
