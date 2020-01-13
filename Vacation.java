import java.util.Scanner;
public class Vacation {

	public static void main(String[] args) {
		int groupSize;
	String travelSuggestion;
	String destination ; 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What kind of trip would you like to go on, musical,tropical, or adventurous?");
		
		String vacationType = scan.nextLine();
		System.out.println("Vacation is: " + vacationType);
		
		
		System.out.println("How many are in your group");
		groupSize = scan.nextInt();
		System.out.println("Group size is: " + groupSize);
	
		if (groupSize <=2) {
			 travelSuggestion = "First Class";
		} else if ((groupSize >=3) && (groupSize <=5)) {
			 travelSuggestion = "Helicopter";
		} else if (groupSize >= 6) {
			 travelSuggestion = "Charter Flight";
		}
		
		if (vacationType.equals("musical")) {
			destination = " New Orleans ";
		} else if (vacationType.equals("tropical")) {
			destination = "Beach Vacation in Mexico ";
		} else if (vacationType.contentEquals("adventurous")) {
			destination = "Whitewater Rafting ";
		}			
		String result = "Since you're a group of " + groupSize + "going on a" + vacationType + " you should take" 
		+ travelSuggestion + "to" + destination;
	
		System.out.println(result);
}
	}
	