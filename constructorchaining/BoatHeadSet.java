/*
 * Defining a base template or blueprint for
 * all type of BoatHeadSets.
 * */

class BoatHeadSet {

	final static String brandName = "Boat";
	final static String slogan = "Plug Into Nirvana";
	int warranty;
	int price;
	String modelName;

	public BoatHeadSet() {
		System.out.println("super class");
	}
	
	public BoatHeadSet(String mn, int p, int w) {
		modelName = mn;
		price = p;
		warranty = w;
		System.out.println("parameter cons super class");
	} 

}
