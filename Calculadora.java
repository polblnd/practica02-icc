import java.util.Scanner;

public class Calculadora{
	private int n1, n2;
	public static int res1, res2;

	public static void decimalABinario(int n1, int n2){
		res1 = 0;
		 res2 = 0;
		int pos1 = 1;
		int pos2 = 1;

		for (int i = n1; i>0; i /= 2){
		 	res1 = res1 + (( i %2)  * pos1);
			pos1 *= 10;
		
		}

		for (int i = n2; i>0; i /= 2){
		 	res2 = res2 + ((i % 2) * pos2);
			pos2 *= 10;
		
		}

		System.out.println(res1 + " + " + res2);
	}

	public static int sumarBinario(){
		int resultado = 0;
		int carry = 0;
		int pos = 1;

		int b1 = res1;
		int b2 = res2;

		while (b1 > 0 || b2 > 0 || carry > 0){
			int bit1 = b1 % 10;
			int bit2 = b2 % 10;

			int sumaBits = bit1 + bit2 + carry;
			int bitres = sumaBits % 2;
			carry = sumaBits / 2;

			resultado = resultado + (bitres * pos);
			pos *= 10;

			b1 /=10;
			b2 /= 10;
		}

		return resultado;
	}
	

	public static void main(String[] args){ 
		int n1 = 10;
		int n2 = 100;
		decimalABinario(n1, n2);
		
		int sumaBinaria = sumarBinario();

		System.out.println(sumaBinaria);
		
	}

}
