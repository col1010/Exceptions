public class Exceptions {
	
	private int[] array;
	
	public Exceptions() {
		
		array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
	}
	
	public void checkArray(int userInput) {
		System.out.println("Value at " + userInput + ": " + array[userInput]);
	}



}
