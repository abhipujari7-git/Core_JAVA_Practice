package Enums;

public enum Color {
	BLACK(50000), BLUE(40000), WHITE(10000), RED(60000), GREY(70000);

	Color(int price) {
		this.price = price;
	}

	private int price;

	@Override
	public String toString() {
		return super.name() + " Price=" + price;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}