import java.util.*;

public class FCFS {

	private ArrayList<Integer> q = new ArrayList<Integer>();
	private int ct = 0;
	private int at[];
	
	public void setTimes() {
//		ArrayList<Integer> q = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of processes: ");
		int bt, n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter burst time for process " + i);
			bt = sc.nextInt();
			q.add(bt);
			System.out.println("Enter arrival time for process " + i);
			at[i] = sc.nextInt();
		}
		
		System.out.println("Enter process for which you want to find completion time, waiting time and turn around time: ");
		int in = sc.nextInt();
		int yo = compTime(in);
		System.out.println("Completion time = " + yo);
		
	}
	
	public int compTime(int process) {
		if(at[process] > compTime(process - 1))
		for(; process > 0; process--) {
			ct += q.get(process - 1);
		}
		return ct;
	}
	
	public int waitingTime(int process) {
		int wt = 0;
		if (at[process] > compTime(process - 1))
			wt = 0;
		else
			wt = compTime(process - 1);
		return wt;
	}
	
//	public int turnAroundTime(int process){
//		
//	}
	
	
}
