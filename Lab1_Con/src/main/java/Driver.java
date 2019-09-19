import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
//		Create a new maven project “working-professional-app” that will reference the classes from 
//		“working-professional-lib” as a Maven dependency
		
//		In the “working-professional-app” project
//		Create a Driver class with a runnable main method
//		Create a Tool collection using a built-in generic data structure
//		Add 5 tool objects to the collection created
//		Prompt the user for details relating to their profession and create a professional object and store it in a variable named “prof” of type Professional
//		Create an instance of a BreakableItem the professional would be able to fix
//		Demonstrate the professional fixing this BreakableItem with all the tools.
//		End the program by printing “Amazing Work!”
		
		
		List <Tool> tool = new ArrayList<Tool>();
		
		tool.add(new Pliers("Snap Ring"));
		tool.add(new Pliers("Grommet"));
		tool.add(new Wrench("Crowfoot"));
		tool.add(new Wrench("Impact"));
		tool.add(new Wrench("Adjustable"));
		
		for(Tool var: tool) {
			System.out.println(var.getBrand());
		}
		
		
	}

}
