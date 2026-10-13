import java.util.Scanner;


public class Cadenas{
/**
 * Creamos variable de prueba
 * para comprobar que el código funciona
 * antes de añadir scanner
 */
private static String prueba;

	public static void menu() {
		System.out.println("\n====================================================");
		System.out.println("\n                 MANEJO DE CADENAS                  ");
		System.out.println("\n====================================================\n");
		
		System.out.println(
            	"\n" +
            	"1. Mostrar longitud\n" +
            	"2. Mostrar caracteres\n" +
            	"3. Mostrar cadena invertida\n" +
            	"4. Contar apariciones de un carácter\n" +
            	"5. Buscar una subcadena\n" +
            	"6. Checar anagrama\n" +
            	"=======================\n "
        	);		

	}
	public static void longitud() {
		
		int length = prueba.length();
		System.out.println("La longitud de la cadena es: " + length);
	}
	/**
	 * Muestra la palabra almacenada en la variable de prueba
	 * Imprime cada uno de sus caracteres en líneas separadas
	 */
	public static void caracter() {
		
		int length = prueba.length();
		System.out.println("PALABRA: " + prueba);
		System.out.println("Todos los caracteres");
		
		for(int i = 0; i < length; i++){
			System.out.println( prueba.charAt(i) );
		}
	}
	/** 
	 * Muestra la palabra invertida almacenando 
	 * los caracteres de la misma con 
	 * la instrucción charAt
	 */
	public static void inversiva(){
		int length = prueba.length();
		System.out.println("PALABRA: " + prueba);
		System.out.println("Inverso");
		
		for(int i = length - 1 ; i >= 0; i--){
			System.out.print( prueba.charAt(i) );
		}
		System.out.println("");
	}
	/**
	 * Te dice cuantas veces se repite
	 * un caracter en una cadena
	 */
	public static void Cuarto(Scanner scanner){
		
		System.out.println("Introduce el caracter");
		char letra = scanner.next().charAt(0);

		int contador = 0; 
		for (int i = 0; i < prueba.length(); i++){
			if ( prueba.charAt(i) == letra ) {
				contador++;
			}
		}

		System.out.println("La letra: \"" + letra + "\" \nApareció " + contador + " veces en el texto");
	}
	/**
	 * Muestra si se encuentra una subcadena en el texto
	 * junto a su posición
	 */
	public static void Quinto(Scanner scanner){
		
		System.out.println("Introduce la subcadena a buscar: ");
		String subcadena = scanner.nextLine();
		
		subcadena = subcadena.trim().toLowerCase();
		prueba = prueba.trim().toLowerCase();

		int i = prueba.indexOf(subcadena);
		int j = i + subcadena.length() - 1;
		
		if(i == -1){
		System.out.println("No se encontro la subcadena");
		}
		else{
		System.out.println("Se encontro la subcadena: " + subcadena + " en la posición: (" + i + "," + j + ")");
		}
	}
	public static void Sexto(){

	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		menu();
		

		System.out.println("Introduce tu cadena de texto: ");
		prueba = scanner.nextLine();
		
		int opcion = 0;
		do{
			System.out.println("Selecciona una opción");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion){
				case 1:
					longitud();
					break;			
				case 2:
					caracter();
					break;			
				case 3:
					inversiva();
					break;			
				case 4:
					Cuarto(scanner);
					break;			
				case 5:
					Quinto(scanner);
					break;		
				case 6:
					System.out.println("Hola");
					break;
				default:
					System.out.println("Opción no válida. Intenta de nuevo");
					break;
			}

		}while(opcion < 0 || opcion > 6);
	}
}
