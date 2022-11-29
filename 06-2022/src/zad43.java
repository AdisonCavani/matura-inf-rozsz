import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad43 {

	public static void main(String[] args) throws FileNotFoundException {
		var file = new File("liczby.txt");
		var scanner = new Scanner(file);
		
		while(scanner.hasNextInt()) {
			var number = scanner.nextInt();
			var inversedNumber = inverseNumber(number);
			
			if (isPrime(number) && isPrime(inversedNumber)) {
				System.out.println(number);
			}
		}
		
		scanner.close();
	}
	
	public static boolean isPrime(int number) {	
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		
		return true;
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
