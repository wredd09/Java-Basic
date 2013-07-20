package backTobasics;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		GameClass gc = new GameClass();
		
		while (gc.PromptToPlay(true)) {
			gc.play();
		}
		
		System.exit(0);
	}
}
