
public abstract class Tool {
	private String brand;

	public Tool(String brand) {
		super();
		this.setBrand(brand);
	}
	
	public abstract boolean fix (BreakableItem item);

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
