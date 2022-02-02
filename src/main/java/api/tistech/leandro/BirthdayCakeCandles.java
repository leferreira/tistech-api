package api.tistech.leandro;

import java.util.Scanner;

/**
 * 
 * @author Leandro
 *
 */
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		BirthdayCakeCandles b = new BirthdayCakeCandles();
		System.out.println("Existem " + b.calculate() +" velas mais altas");
	}
	
	public int calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos anos a criança irá fazer ");
		int n = sc.nextInt();
		int[] velas = new int[n];
		int maisAltas = -1;
		int count = 0;
		System.out.println("Informe a altura das velas ");
		for (int n0 = 0; n0 < n; n0++) {
			velas[n0] = sc.nextInt();
			if (velas[n0] > maisAltas) {
				maisAltas = velas[n0];
				count = 1;
			} else if (velas[n0] == maisAltas) {
				count++;
			}
		}
		sc.close();
		System.out.println("As velas mais altas tem " + maisAltas + " pontos de altura");
		return count;
	}
}
