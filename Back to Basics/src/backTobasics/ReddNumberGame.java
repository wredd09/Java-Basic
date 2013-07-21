package backTobasics;

public class ReddNumberGame extends NumberGame {

	public ReddNumberGame () {
		
	}
	
	public void play() {
		int randomnumber = numbergenerator();
		//System.out.println("random number is " + randomnumber);
		int guesses = actualgame(randomnumber);
		System.out.println("It took you " + guesses + " Guesses");
	}
	
	public int numbergenerator () {
		int low, high, randomnumber; 
		System.out.println("What do you want set as your low number?");
		low = scanner.nextInt(); 
		//scanner.nextLine();
		System.out.println("What do you want to set as your high number?");
		high = scanner.nextInt();
		//scanner.nextLine();
		System.out.println("low is " + low + ". High is " + high);
		randomnumber = random.nextInt(high - low + 1); //WHOOOOO Comments
		randomnumber = randomnumber + low;
		return randomnumber;
	}
	
	public int actualgame (int randomnumber) {
		int guess = 0;
		int guesses = 0;
		System.out.print("Guess a number ");
		guess = scanner.nextInt();
		System.out.println();
		if (guess == randomnumber){
			guesses++;
			System.out.println("Lucky Guess!");
			return guesses;
		} else {
			do {
				guesses++;
				if (guess < randomnumber){
					System.out.print("Too low. Guess again ");
					guess = scanner.nextInt();
					System.out.println();
				} else if (guess > randomnumber) {
					System.out.print("Too high. Guess again ");
					guess = scanner.nextInt();
					System.out.println();
				}
			} while (guess != randomnumber);
		} 
		
		if (guess == randomnumber) {
			guesses++;
			System.out.println("Got it!");
		}
		return guesses;
	}
}
