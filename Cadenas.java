public class Cadenas{
/**
 * Creamos variable de prueba
 * para comprobar que el código funciona
 * antes de añadir scanner
 */
static String prueba = "0123456789";	
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
            	"=======================\n" +
            	"Selecciona una opción: "
        	);		

	}
	/**
	 * Muestra la longitud de la cadena
	 * almacenada en la variable de prueba
	 */
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
	public static void Cuarto(){
		char letra = '1';
		int contador = 0; 
		for (int i = 0; i < prueba.length(); i++){
			if ( prueba.charAt(i) == letra ) {
				contador++;
			}
		}

		System.out.println("La letra: " + letra + "\nAparece " + contador + " en el texto");
	}
	public static void Quinto(){

	}
	public static void Sexto(){

	}
	public static void main(String[] args){
		menu();
		longitud();
		caracter();
		inversiva();
	}
}
