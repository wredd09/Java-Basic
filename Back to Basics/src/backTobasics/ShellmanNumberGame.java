package backTobasics;

public class ShellmanNumberGame extends NumberGame {

	public ShellmanNumberGame () {
		
	}
	
	public void play() {
		System.out.println("Think of a number between 1 and 100 (inclusive).");
		System.out.println("Are you ready? (Enter anything when you are ready)");
		scanner.nextLine();
		
		int low = 1, high = 100;
		
		boolean correct = false;
		
		while (!correct)
		{
			System.out.println("");
		}
	}
	
	private int guess(int low, int high)
	{
		return (high - low + 1)/2 + low;
	}
}
