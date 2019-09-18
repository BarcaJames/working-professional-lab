
public abstract class Tool {
	private String brand;

	public Tool(String brand) {
		super();
		this.brand = brand;
	}
	
	public boolean fix (BreakableItem item);
}
