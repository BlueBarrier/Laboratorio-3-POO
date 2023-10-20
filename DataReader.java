/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para realizar las funciones del programa, relacionadas con la lectura de base de datos
 * 
 * @author: Erick Barrera - 231238, Juan Ignacio Figueroa - 23092
 * @version: 1.0.0
 * @date: 20/10/23
 * @lastUpdate: 20/10/23
 * 
 * Changes: --
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {

    /**
     * @return allData
     */
    public static ArrayList<Espacio> LeerData() {
        String csvFilePath = "UVGespaceDataBase.csv";
        ArrayList<Espacio> allData= new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String espacio;
            allData = new ArrayList<>();

            while ((espacio = br.readLine()) != null) {
                String[] atributos = espacio.split(",");
                switch(atributos[4]){
                    case "apartamento":
                        Apartamento apartamento = new Apartamento(atributos[0],atributos[1],atributos[2],atributos[3],atributos[4],atributos[5],atributos[6],atributos[7]);
                        allData.add(apartamento);
                        break;

                    case "oficina":
                        Oficina oficina = new Oficina(atributos[0],atributos[1],atributos[2],atributos[3],atributos[4],atributos[5],atributos[6],atributos[7]);
                        allData.add(oficina);
                        break;

                    case "amenidad":
                        Amenidades amenidad = new Amenidades(atributos[0],atributos[1],atributos[2],atributos[3],atributos[4],atributos[5],atributos[6],atributos[7]);
                        allData.add(amenidad);
                        break;
                }
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return allData;
    }

    /**
     * @param allData
     */
    public static void informe(ArrayList<Espacio> allData){
        int countApartamento=0;
        int countOficina=0;
        int countAmenidad=0;
        for (Espacio espacio : allData) {
            if(espacio.getCategoria().equals("apartamento")){
                countApartamento++;
            }
            if(espacio.getCategoria().equals("oficina")){
                countOficina++;
            }
            if(espacio.getCategoria().equals("amenidad")){
                countAmenidad++;
            }
        }
        System.out.println("Apartamentos:"+countApartamento);
        System.out.println("Oficinas:"+countOficina);
        System.out.println("Amenidades:"+countAmenidad);
    }

    /**
     * @param allData
     * @param ID
     * @return espacioID
     */
    public static Espacio buscarID(ArrayList<Espacio> allData, String ID){
        Espacio espacioID = new Espacio("-","-","-","-","-","-");
        for (Espacio espacio : allData) {
            if(espacio.getID().equals(ID)){
                espacioID=espacio;
            }
    }
    return espacioID;
    }

    
}

