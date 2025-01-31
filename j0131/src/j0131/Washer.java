package j0131;

public class Washer extends Product {
	Washer(){
		this("LGWasher",900000,90000);
	}
	
	public Washer(String name, int price, int point) {
		setName(name);
		setPrice(price);
		setPoint(point);
	}
}
