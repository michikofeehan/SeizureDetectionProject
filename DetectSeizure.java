import java.util.Scanner;

public class detect1 {
			
		public static void main(String[] args) {
		boolean seizure = false; // initially set as no seizure
		double threshold = 20; // the absolute difference between timed average and peak
		double difference = 0;
		double currentConductanceValue = 0;
		
			//Keep looping until threshold is greater than 20uS and a seizure is detected
			while (difference < threshold){ // redundant here but keep maybe
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\n Please enter current conductance numerical value (uS) \n");
			currentConductanceValue = scanner.nextDouble();// input most recent current conductance value	
			
			System.out.println("\n Please enter current baseline value numerical value (uS) \n");
			double baseline = scanner.nextDouble(); // timed average input
			
			difference = Math.abs( baseline - currentConductanceValue );// redefine threshold
			System.out.println("\nThe difference is " + difference + " uS. You do not have the symptoms of a grand mal seizure! \n");
		}
			 
			
			System.out.println("\nThe difference is " + difference + "\n\nYou have the symptoms of a grand mal seizure!!! Your caretakers will be alerted!!!!\n");
			seizure = true; 
			
		
		

	}

			

		

	}


