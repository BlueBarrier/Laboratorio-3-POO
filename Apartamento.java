/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar datos de apartamentos
 * 
 * @author: Erick Barrera - 231238
 * @version: 1.0.0
 * @date: 16/10/23
 * @lastUpdate: 16/10/23
 * 
 * Changes: --
 * 
 */
public class Apartamento extends Espacio{
    private boolean lineaBlanca;
    private String habitaciones;
    
    /**
     * @param ID
     * @param mCuadrados
     * @param cantDisponible
     * @param cantVendidos
     * @param categoria
     * @param estado
     * @param lineaBlanca
     * @param habitaciones
     */
    public Apartamento(String ID, String mCuadrados, int cantDisponible, int cantVendidos, String categoria, 
    String estado, boolean lineaBlanca, String habitaciones){
        super(ID, mCuadrados, cantDisponible, cantVendidos, categoria, estado);
        this.lineaBlanca = lineaBlanca;
        this.habitaciones = habitaciones;
    }

    // Getters y Setters 
    /**
     * @return
     */
    public String getHabitaciones() {
        return habitaciones;
    }
    /**
     * @param habitaciones
     */
    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * @return
     */
    public boolean getLineaBlanca() {
        return lineaBlanca;
    }
    /**
     * @param lineaBlanca
     */
    public void setLineaBlanca(boolean lineaBlanca) {
        this.lineaBlanca = lineaBlanca;
    }
}