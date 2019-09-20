
public abstract class Router implements BreakableItem{
	
	private String brand;
	private float bandwidth;
	
	public Router(String brand, float bandwidth) {
		super();
		this.brand = brand;
		this.bandwidth = bandwidth;
	}
	
	public Router() {
		super();
		this.brand = "";
		this.bandwidth = 0.0f;
	}
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(float bandwidth) {
		this.bandwidth = bandwidth;
	}

	public void updateDamage(float cost) {
		// TODO Auto-generated method stub
		
	}
	
}
