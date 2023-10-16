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
 public class Espacio{
    protected String ID;
    protected String mCuadrados;
    protected int cantDisponible;
    protected int cantVendidos;
    protected String categoria;
    protected String estado;

public Espacio(String ID, String mCuadrados, int cantDisponible, int cantVendidos, String categoria, String estado){
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
public int getCantDisponible(){return cantDisponible;} 
public void setCantDisponible(int cantDisponible){this.cantDisponible=cantDisponible;}
public int getCantVendidos(){return cantVendidos;} 
public void setCantVendidos(int cantVendidos){this.cantVendidos=cantVendidos;}
public String getCategoria(){return categoria;}
public void setCategoria(String categoria){this.categoria=categoria;}
public String getEstado(){return estado;}
public void setEstado(String estado){this.estado=estado;}

 }