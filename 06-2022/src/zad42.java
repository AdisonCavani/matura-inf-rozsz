import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad42 {

	public static void main(String[] args) throws FileNotFoundException {
		var file = new File("liczby.txt");
		var scanner = new Scanner(file);
		
		var largestDiff = 0;
		var largestNum = 0;
		
		while(scanner.hasNextInt()) {
			var number = scanner.nextInt();
			var inversedNumber = inverseNumber(number);
			
			var diff = Math.abs(number - inversedNumber);
			
			if (largestDiff < diff) {
				largestDiff = diff;
				largestNum = number;
			}
		}
		
		scanner.close();
		System.out.println(largestNum + " " + largestDiff);
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
