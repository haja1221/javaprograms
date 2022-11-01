/*
 * Template for BassHeads.
 * */

class BassHeads extends BoatHeadSet {
	
	String color;
	boolean wired;

	
	public BassHeads(String modelName, int price, int warranty, String c, boolean w) {
		super(modelName, price, warranty);
		color = c;
		wired = w;
		System.out.println("parameter cons child class");
	}

 	public BassHeads() {
		System.out.println("child");
	}

	public static void main(String[] ar) {
		BassHeads obj = new BassHeads("BassHeads", 500, 2, "Green", true);
		BassHeads obj1 = new BassHeads();
	}
}

