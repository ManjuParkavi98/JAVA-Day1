

public class Egg {

	public static void main(String[] args) {
		int totaleggs=1342;
		GrossEgg grossegg=new GrossEgg();
		DozenEgg dozenegg=new DozenEgg();
		grossegg.setNumber(totaleggs);
		int gegg=grossegg.getGross();
		dozenegg.setNumber((totaleggs-(gegg*144)));
		int degg=dozenegg.getDozen();
		System.out.println("Gross Eggs="+gegg);
		System.out.println("Dozen Eggs="+degg);
		System.out.println("Remaining Eggs="+(totaleggs-(gegg*144)-(degg*12)));

	}

}
