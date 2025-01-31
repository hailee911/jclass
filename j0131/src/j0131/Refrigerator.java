package j0131;

public class Refrigerator extends Product {
	
	private int liter;
	
	Refrigerator(){
		this("BESPOKE",1200000,12000,900);
	}

	public Refrigerator(String name, int price, int point, int liter) {
		setName(name);
		setPrice(price);
		setPoint(point);
		this.liter = liter;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}
	

}
