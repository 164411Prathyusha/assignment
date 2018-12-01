package One;

public class Transaction {
	String trader; 
	String place;
	int year; 
	int value;
	public Transaction(String trader,String place, int year, int value) {
		super();
		this.trader = trader;
		this.place=place;
		this.year = year;
		this.value = value;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", place=" + place + ", year="
				+ year + ", value=" + value + "]";
	}
	
}
