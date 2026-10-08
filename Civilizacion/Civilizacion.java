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
public class Civilizacion {

	private String nombre;
	private String era;
	private int poblacion;	
	private int alimento;	
	private int madera;
	private int oro;

	/**
	 * Crea una nueva instancia de una Civilizacion con los valores iniciales
	 * Si algún valor es menor a 0, se le asigna 0 por default
	 *
	 * @param nombre Nombre de la civilizacion
	 * @param Era Era de la civilizacion
	 * @param poblacion  Cantidad inicial de habitantes de la civilizacion
	 * @param alimento Cantidad inicial de alimento
	 * @param madera Cantidad inicial de madera
	 * @param oro Cantidad inicial de oro
	 */
	public Civilizacion(String nombre, String era, int poblacion, int alimento, int madera, int oro){
		this.nombre = nombre;	
		this.era = era;		
		
		if ( poblacion >= 0 ) {
			this.poblacion = poblacion;
		}else {
			this.poblacion = 0;
		}
		if ( alimento >= 0 ) {
			this.alimento = alimento;
		}else {
			this.alimento = 0;
		}
		if ( madera >= 0 ) {
			this.madera = madera;
		}else {
			this.madera = 0;
		}
		if ( oro >= 0 ) {
			this.oro = oro;
		}else {
			this.oro = 0;
		}
	}
		
	public String getNombre() {
			return nombre;
		}
	public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	public String getEra() {
			return era;	
		}
	public void setEra(String era) {
			this.era = era;
		}	
	public int getPoblacion() {
			return poblacion;
		}
	public int getAlimento() {
			return alimento;
		}
	public void setAlimento(int alimento) {
		if (alimento >= 0) {
			this.alimento = alimento;
			}
		}
	public int getMadera() {
			return madera;
		}
	public void setMadera(int madera) {
		if (madera >= 0) {
			this.madera = madera;
			}
		}
	public int getOro() {
			return oro;
		}
	public void setOro(int oro) {
		if (oro >= 0) {
			this.oro = oro;
			}
		}

	public void Estado(){
		System.out.println("==========================");
		System.out.println("        CIVILIZACION      ");
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("Civilización: " + nombre);

	}

	/**
	 * Creación de aldeano
	 * Un aldeano cuesta 50 unidades de alimento
	 * Si la civilización posee suficiente alimento, reduce 50 unidades
	 * de alimento e incrementa la población en 1
	 *
	 * @return {@code True} si el aldeano fue creado con éxito;
	 * @return {@code False} si no había suficiente alimento;
	 *
	 */
	public boolean Aldeano(){
		if(this.alimento >= 50){
			this.alimento = this.alimento - 50;
			this.poblacion = this.poblacion + 1;
			Estado(); 
			return true;
			}
			System.out.println("No hay suficiente alimento para crear aldeano");
			return false;
	}
}
