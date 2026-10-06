public class patrones {

	public static void piramideA(int n){
			System.out.println(" 1");
			for(int i = 1; i <= n; i++ ){
				System.out.print("1");
				for(int j = 1; j <= i; j++){
					System.out.print("*");			
				}
			System.out.println("1");
			}

		}

	public static void piramideB(int n){
		for(int i = 1; i <= n; i++ ){
			for(int j = 1; j <= i; j++){
				System.out.print("  *  ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int n = 5;
		piramideB(n);
		piramideC(n);
	}
}
