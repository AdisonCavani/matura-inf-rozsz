import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad41 {

	public static void main(String[] args) throws FileNotFoundException {
		var file = new File("liczby.txt");
		var scanner = new Scanner(file);
		
		while(scanner.hasNextInt()) {
			var number = scanner.nextInt();
			var inversedNumber = inverseNumber(number);
			
			if (inversedNumber % 17 == 0) {
				System.out.println(inversedNumber);
			}
		}
		
		scanner.close();
	}
	
	public static int inverseNumber(int number) {
		var result = 0;
		
		while (number != 0) {
			var tmp = number % 10;
			result = result * 10 + tmp;
			number /= 10;
		}

		return result;
	}
}
