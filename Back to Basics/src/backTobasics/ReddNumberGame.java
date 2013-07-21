package backTobasics;

public class ReddNumberGame extends NumberGame {

	public ReddNumberGame () {
		
	}
	
	public void play() {
		int low, high, guesses;
		System.out.println("What do you want set as your low number?");
		low = scanner.nextInt(); 
		scanner.nextLine();
		System.out.println("What do you want to set as your high number?");
		high = scanner.nextInt();
		scanner.nextLine();
		System.out.println("");
		int n = high - low;
		int randomnumber = random.nextInt(n); 
		System.out.println(randomnumber);
		
	}
}
