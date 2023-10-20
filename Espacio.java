/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar datos de espacios
 * 
 * @author: Erick Barrera - 231238, Juan Ignacio Figueroa - 23092
 * @version: 1.0.0
 * @date: 16/10/23
 * @lastUpdate: 16/10/23
 * 
 * Changes: --
 * 
 */
 public class Espacio{
    protected String ID;
    protected String mCuadrados;
    protected String cantDisponible;
    protected String cantVendidos;
    protected String categoria;
    protected String estado;

    /**
     * @param ID
     * @param mCuadrados
     * @param cantDisponible
     * @param cantVendidos
     * @param categoria
     * @param estado
     */
    public Espacio(String ID, String mCuadrados, String cantDisponible, String cantVendidos, String categoria, String estado){
        this.ID=ID;
        this.mCuadrados=mCuadrados;
        this.cantDisponible=cantDisponible;
        this.cantVendidos=cantVendidos;
        this.categoria=categoria;
        this.estado=estado;
    }
    
    public String getID(){return ID;}
    public void setID(String ID){this.ID=ID;} 
    public String getMCuadrados(){return mCuadrados;}
    public void setMCuadrados(String mCuadrados){this.mCuadrados=mCuadrados;}
    public String getCantDisponible(){return cantDisponible;} 
    public void setCantDisponible(String cantDisponible){this.cantDisponible=cantDisponible;}
    public String getCantVendidos(){return cantVendidos;} 
    public void setCantVendidos(String cantVendidos){this.cantVendidos=cantVendidos;}
    public String getCategoria(){return categoria;}
    public void setCategoria(String categoria){this.categoria=categoria;}
    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado=estado;}

 }