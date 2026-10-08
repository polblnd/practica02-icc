/**
 * Simulación primitiva de un juego de estrategia
 * Representa dos civilizaciones
 * Administra los datos de la civilización
 * Nombre y era
 * Población y recursos (alimento, madera, oro)
 *
 * @author Pól
 * @version 1.0
 */
public class Main {
	public static void main(String[] args){
		/**
		 *
		 * Crear las instancias de Civilizacion
		 *
		 */
		Civilizacion vikinga = new Civilizacion("Vikinga", "XI", 101, 10, 30, 101);
		Civilizacion persa = new Civilizacion("Persa", "IV", 85, 80, 45, 150);
		Civilizacion mongola = new Civilizacion("Mongola", "XIII", 60, 120, 200, 850);
		Civilizacion mexica = new Civilizacion("Mexica", "XV", 120, 150, 600, 11000);
		Civilizacion maya = new Civilizacion("Maya", "VIII", 95, 95, 120, 7500);
		Civilizacion sumeria = new Civilizacion("Sumeria", "0", 5, 6, 35, 4);
		
		System.out.println("==========================================");
        	System.out.println("    ESTADO INICIAL DE LAS CIVILIZACIONES  ");
        	System.out.println("==========================================");
        	persa.Estado();
        	mongola.Estado();
        	mexica.Estado();
       		maya.Estado();
        	sumeria.Estado();

		System.out.println("\n==========================================");
       		System.out.println("        EJECUTANDO ACCIONES DEL JUEGO     ");
        	System.out.println("==========================================");

		/** 
	 	* Ejecución de comercio y creación de aldeano en Persa.
	 	* */
        	System.out.println(">>> [PERSA] Comercia en la Vía Real (+20,000 Oro) y recluta un aldeano:");
        	persa.obtenerOro(20000);
        	persa.Aldeano();

        	/** 
	 	*Prueba de fallo por alimento insuficiente y posterior cacería en Mongola. 
	 	*/
        	System.out.println(">>> [MONGOLA] Intenta crear aldeano sin alimento suficiente:");
        	mongola.Aldeano();
        	System.out.println(">>> [MONGOLA] Realiza una cacería (+100 Alimento) e intenta crear el aldeano de nuevo:");
        	mongola.obtenerAlimento(100);
        	mongola.Aldeano();

        	/** 
		 * Cosecha masiva y creación doble de aldeanos en Mexica. 
		 * */
       		System.out.println(">>> [MEXICA] Cosecha chinampas (+500 Alimento, +200 Madera) y crea 2 aldeanos:");
        	mexica.obtenerAlimento(500);
        	mexica.obtenerMadera(200);
        	mexica.Aldeano();
        	mexica.Aldeano();

        	/** 
		 * Avance de era y prueba de validación de valor negativo en Maya.
		 * */
        	System.out.println(">>> [MAYA] Avanza a la era IX e intenta asignar un valor negativo de oro (-1000):");
        	maya.setEra("IX");
        	maya.setOro(-1000);
        	maya.obtenerMadera(300);
        	maya.Estado();

        	/** Recolección de recursos e incremento de población en Sumeria. */
        	System.out.println(">>> [SUMERIA] Recolecta recursos en el Tigris (+150 Madera, +50 Oro) y crea un aldeano:");
        	sumeria.obtenerMadera(150);
        	sumeria.obtenerOro(50);
        	sumeria.Aldeano();

        	System.out.println("**********************************************************");
        	System.out.println("             ESTADO FINAL DE LAS CIVILIZACIONES           ");
        	System.out.println("**********************************************************\n");

        	persa.Estado();
        	mongola.Estado();
        	mexica.Estado();
        	maya.Estado();
        	sumeria.Estado();
    	}
}
