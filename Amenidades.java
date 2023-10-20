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

    /**
     * @param ID
     * @param mCuadrados
     * @param cantDisponible
     * @param cantVendidos
     * @param categoria
     * @param estado
     * @param tipoAmenidad
     * @param capacidad
     */
    public Amenidades(String ID, String mCuadrados, String cantDisponible, String cantVendidos, String categoria, 
    String estado, String tipoAmenidad, String capacidad){
        super(ID, mCuadrados, cantDisponible, cantVendidos, categoria, estado);
        this.tipoAmenidad = tipoAmenidad;
        this.capacidad = capacidad;
    }
    // getters y setters
    /**
     * @return
     */
    public String getCapacidad() {
        return capacidad;
    }
    /**
     * @param capacidad
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return
     */
    public String getTipoAmenidad() {
        return tipoAmenidad;
    }
    /**
     * @param tipoAmenidad
     */
    public void setTipoAmenidad(String tipoAmenidad) {
        this.tipoAmenidad = tipoAmenidad;
    }
}
