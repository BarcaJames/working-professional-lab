
public abstract class Pipe implements BreakableItem{
	protected float length;
	protected float diameter;
	
	public Pipe(float length, float diameter) {
		super();
		this.length = length;
		this.diameter = diameter;
	}
	
	public Pipe() {
		super();
		this.length = 0.0f;
		this.diameter = 0.0f;
	}
	
	
}
