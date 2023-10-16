/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar datos de amenidades
 * 
 * @author: Erick Barrera - 231238
 * @version: 1.0.0
 * @date: 16/10/23
 * @lastUpdate: 16/10/23
 * 
 * Changes: --
 * 
 */
public class Amenidades extends Espacio{
    private String tipoAmenidad;
    private String capacidad;

    public Amenidades(String ID, String mCuadrados, int cantDisponible, int cantVendidos, String categoria, 
    String estado, String tipoAmenidad, String capacidad){
        super(ID, mCuadrados, cantDisponible, cantVendidos, categoria, estado);
        this.tipoAmenidad = tipoAmenidad;
        this.capacidad = capacidad;
    }
    
}
