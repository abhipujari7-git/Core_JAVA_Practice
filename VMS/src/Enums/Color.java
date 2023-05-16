package Enums;

public enum Color {
	WHITE(10000), RED(20000), BLACK(70000), GREY(15000);

	public double price;

	private Color(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
