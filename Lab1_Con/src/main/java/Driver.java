import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		

		/*Create a Tool collection using a built-in generic data structure
		Add 5 tool objects to the collection created*/
		
		List <Tool> tool = new ArrayList<Tool>();
		
		tool.add(new Pliers("Snap Ring"));
		tool.add(new Pliers("Grommet"));
		tool.add(new Wrench("Crowfoot"));
		tool.add(new Wrench("Impact"));
		tool.add(new Wrench("Adjustable"));
		
//		for(Tool var: tool) {
//			System.out.println(var.getBrand());
//		}
		
		/*Prompt the user for details relating to their profession and create a professional 
		object and store it in a variable named “prof” of type Professional
		Create an instance of a BreakableItem the professional would be able to fix
		Demonstrate the professional fixing this BreakableItem with all the tools.
		End the program by printing “Amazing Work!”*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		
		System.out.println("1 ------------ Plumber");
		System.out.println("2 ------------ Network Specialist");
		System.out.println("Choose your profession: ");
		int choice = in.nextInt();
		in.close();
		

		switch(choice) {
		case 1:{
			PlumbingProfessional prof = new PlumbingProfessional(name);
			Pipe pvc = new PvcPipe(1.5f, 3.6f, "Blue");
			Wrench wrench = new Wrench("Crowfoot");
			Pliers pliers = new Pliers("Snap Ring");
			pvc.updateDamage(3500.00f);
			prof.fixPipe(pvc, wrench);
			prof.fixPipe(pvc, pliers);
			System.out.println("Amazing Work!");
			break;
		}
		case 2:{
			NetworkingProfessional prof = new NetworkingProfessional(name);
			Router router = new CiscoRouter(52354);
			Wrench wrench = new Wrench("Crowfoot");
			Pliers pliers = new Pliers("Snap Ring");
			router.updateDamage(5500.00f);
			prof.fixRouter(router, pliers);
			prof.fixRouter(router, wrench);
			System.out.println("Amazing Work!");
			break;
		}
		default:
			System.out.println("Can only enter 1 or 2");
		}
	
	}

}
