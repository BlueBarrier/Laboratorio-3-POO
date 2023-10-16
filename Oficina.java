/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar datos de oficina
 * 
 * @author: Erick Barrera - 231238
 * @version: 1.0.0
 * @date: 16/10/23
 * @lastUpdate: 16/10/23
 * 
 * Changes: --
 * 
 */
public class Oficina extends Espacio{
    private String totalParqueos;
    private boolean mantenimiento;

    /**
     * @param ID
     * @param mCuadrados
     * @param cantDisponible
     * @param cantVendidos
     * @param categoria
     * @param estado
     * @param totalParqueos
     * @param mantenimiento
     */
    public Oficina(String ID, String mCuadrados, int cantDisponible, int cantVendidos, String categoria, 
    String estado, String totalParqueos, boolean mantenimiento){
        super(ID, mCuadrados, cantDisponible, cantVendidos, categoria, estado);
        this.totalParqueos = totalParqueos;
        this.mantenimiento = mantenimiento;
    }

    // getters y setters
    /**
     * @return
     */
    public String getTotalParqueos() {
        return totalParqueos;
    }
    /**
     * @param totalParqueos
     */
    public void setTotalParqueos(String totalParqueos){
        this.totalParqueos = totalParqueos;
    }

    /**
     * @return
     */
    public boolean getMantenimiento(){
        return mantenimiento;
    }
    /**
     * @param mantenimiento
     */
    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
}
