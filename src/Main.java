import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la lunghezza della sequenza ");
		int l = input.nextInt();
		
		// istanziamento ArrayList
		ArrayList<Integer> integerList = new ArrayList();
		
		// lettura numeri
		for(int i = 0; i < l; i++) {
			System.out.print("Inserisci un numero ");
			integerList.add(input.nextInt());
		}
				
		// ordinamento ArrayList
		Collections.sort(integerList);
		// Collections.sort(integerList, Collections.reverseOrder());
		
		// stampa del risultato
		for(int n: integerList) {
			System.out.println(n);
		}
	}
}
