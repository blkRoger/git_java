package entities;

public class Bill {
	
	public char gender;
	public int beer, barbecue, softDrink;
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00; 
		}
		else {
			return 10.00;
		}
	}
	
	public double feeding() {
		return 5.0 * beer + 3.0 * softDrink + 7.0 * barbecue;
	}
	
	public double cover() {
		if (feeding() > 30.00) {
			return 0.00;
		}
		else {
			return 4.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}

}
