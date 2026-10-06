import java.util.Scanner;

public class patrones {

	public static void piramideA(int n){
		for(int j = 1; j<= n; j++){
			System.out.print(" ");
		}
			System.out.println("1");
			
			for(int i = 1; i <= n; i++ ){
				for(int j = 1; j <= n - 1; j++){
					System.out.print(" ");
				} 
				System.out.print("1");
				for(int j = 1; j <= i; j++){
					System.out.print("*");			
				}
			System.out.println("1");
			}

		}

	public static void piramideB(int n){
		for(int i = 1; i <= n; i++ ){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			
			System.out.println();
			}
		}
	
	public static void piramideC(int n){
		for(int i = 1; i <= n; i++ ){	
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}	
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i = n; i > 0; i-- ){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
				}		

			System.out.println();
			}
	}

	public static void piramideD(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){ 
				System.out.print(j);
			}
			for(int j = i - 1; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		int n = 0;
		while( n <= 0){
			System.out.println("Ingresa un valor de n mayor a 0");
			n = number.nextInt();
		}
		
		System.out.println("Patrón A: Triángulo delimitado\n");
		piramideA(n);
		
		System.out.println("Patrón B: Pirámide de asteriscos\n");
		piramideB(n);
		
		System.out.println("Patrón C: Rombo de asteriscos\n");
		piramideC(n);
		
		System.out.println("Patrón D: Piramide númerica simetrica\n");
		piramideD(n);
	}
}
