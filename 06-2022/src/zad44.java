import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class zad44 {

	public static void main(String[] args) throws FileNotFoundException {
		var file = new File("liczby.txt");
		var scanner = new Scanner(file);
		
		var arr = new ArrayList<Integer>();
		
		while(scanner.hasNextInt())
			arr.add(scanner.nextInt());
		
		scanner.close();
		
		var reducedArray = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			var number = arr.get(i);
			
			if (!reducedArray.contains(number))
				reducedArray.add(number);
		}
		
		
		var unique = reducedArray.size();
		var twice = 0;
		var thrice = 0;
		
		for (int i = 0; i < reducedArray.size(); i++) {
			var number = reducedArray.get(i);
			
			var occurrence = getOccurrence(arr, number);
			if (occurrence == 2)
				twice++;
			else if (occurrence == 3)
				thrice++;
		}
		
		System.out.println(unique + " " + twice + " " + thrice);
	}
	
	public static int getOccurrence(ArrayList<Integer> array, int number) {
		var counter = 0;
		
		for (int i = 0; i < array.size(); i++)
			if (array.get(i) == number)
				counter++;
		
		return counter;
	}
}
