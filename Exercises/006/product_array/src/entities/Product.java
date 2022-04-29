package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
		super();
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + String.format("\t$%.2f", price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}