package com.manju.demo;

public class FiboDemo {
   private int number1,number2;
   public void setNumber(int num1,int num2) {
	   this.number1=num1;
	   this.number2=num2;
   }
   public void getFibonacci() {
	   int n1=0,n2=1,i,temp;
	   for(i=num1;i<=num2;i++)
	   {
		   temp=n1+n2;
		   n1=n2;
		   n2=temp;
	   }
   }
}
