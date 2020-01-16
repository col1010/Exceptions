import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
	
	private static Scanner input = new Scanner(System.in);
	private static boolean cont = true;

	public static void main(String[] args) {
		Exceptions myEx = new Exceptions();
		while (cont) {
			System.out.println("Enter an integer");
			try {
				myEx.checkArray(input.nextInt());
				cont = false;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index out of bounds exception, try again");
			}
			catch (InputMismatchException e) {
				System.out.println("Incorrect input. please enter an integer instead");
				input.next(); 
				/* When a scanner throws an InputMismatchException, 
				 * the scanner will not pass the token that caused the exception, 
				 * so that it may be retrieved or skipped via some other method.
				 * input.next() essentially just moves the scanner on from the error state
				 */
			}
			catch (Exception e) {
				System.out.println("how did you even get here?");
			}
		}
	}
}
