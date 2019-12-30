import java.util.*;

public class Driver {

	
	public static void main(String[] args) {
		int choice;
		System.out.println("Enter choice:\n\t1. FCFS\n\t2. SJF\n\t3. Priority\n\t4. Round Robin");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			FCFS fc = new FCFS();
			fc.setTimes();
			break;
		case 2:
			break;
			
		default:
			break;
		}

	}

}
