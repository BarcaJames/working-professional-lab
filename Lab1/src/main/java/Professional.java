import java.util.ArrayList;

public abstract class Professional{
	private int id;
	private String name;
	private float salary;
	private ArrayList <Certification> certifications= new ArrayList <Certification>();
	
	public Professional(String name) {
		this.name = name;
		
	}
	
	public abstract void addCertificate(Certification certification);
}
