import java.util.Scanner;
public class DetectSeizure {
	
	
	public static void main(String[] args) {
	boolean seizure = false; // initially set as no seizure
	double threshold = 20; // the absolute difference between timed average and peak
	double difference = 0;
		//Keep looping until threshold is greater than 20uS and a seizure is detected
		while (seizure == false && difference < threshold){ // redundant here but keep maybe
		Scanner scanner = new Scanner(System.in);
		double currentConductanceValue = scanner.nextDouble();// input most recent current conductance value	
		double baseline = scanner.nextDouble(); // timed average input
		difference = Math.abs( baseline - currentConductanceValue );// redefine threshold
	}
	
	}

}
