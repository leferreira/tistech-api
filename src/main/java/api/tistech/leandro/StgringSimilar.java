package api.tistech.leandro;

import java.util.Scanner;

/**
 * 
 * @author Leandro
 *
 */
public class StgringSimilar {
	
	public static int calculaString(String string) {
		char[] array = string.toCharArray();
		int length = array.length;
		int count = length;
		for (int i = 1; i < length; i++) {
			int len = length - i;
			for (int j = 0; j < len; j++)
				if (array[j] == array[j + i]) {
					count++;
				} else {
					break;
				}
		}
		return count;
	}

	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		for (int i = 0; i < n; i++) {
			String string = ler.next();
			System.out.println(calculaString(string));
		}
		
		ler.close();
	}
}
