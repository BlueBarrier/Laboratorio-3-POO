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

    /**
     * función para enlistar los espacios por categoría
     * 
     * @param categoria
     * @param data
     */
    public static void listar(String categoria, ArrayList<Espacio> data){
        switch (categoria) {
            case "Apartamento":
            System.out.println("\nApartamentos: ");
                for (Espacio espacio : data) {
                    if (espacio instanceof Apartamento) {
                        Apartamento apartamento = (Apartamento) espacio;
                        System.out.println("-Código: "+apartamento.getID()+" metros cuadrados: "+apartamento.getMCuadrados()+
                                            "\n estado: "+apartamento.getEstado()+" línea blanca: "+apartamento.getLineaBlanca()+
                                            "\n habitaciones: "+apartamento.getHabitaciones());
                    }
                }
                break;
            case "Oficina":
            System.out.println("\n Oficinas: ");
                for (Espacio espacio : data) {
                    if (espacio instanceof Oficina) {
                        Oficina oficina = (Oficina) espacio;
                        System.out.println("-Código: "+oficina.getID()+" metros cuadrados: "+oficina.getMCuadrados()+
                                            "\n estado: "+oficina.getEstado()+" total parqueos: "+oficina.getTotalParqueos()+
                                            "\n mantenimiento: "+oficina.getMantenimiento());
                    }
                }
                break;
            case "Amenidades":
                System.out.println("\n Amenidades: ");
                for (Espacio espacio : data) {
                    if (espacio instanceof Amenidades) {
                        Amenidades amenidad = (Amenidades) espacio;
                        System.out.println("-Código: "+amenidad.getID()+" metros cuadrados: "+amenidad.getMCuadrados()+
                                            "\n estado: "+amenidad.getEstado()+" total parqueos: "+amenidad.getTipoAmenidad()+
                                            "\n mantenimiento: "+amenidad.getCapacidad());
                    }
                }
                break;
            default:
                break;
        }
    }

    /**
     * función para mostrar por categorías 
     * 
     * @param categoria
     * @param data
     */
    public static void estado(String categoria, ArrayList<Espacio> data){
        ArrayList<Espacio> disponibles = new ArrayList<>();
        ArrayList<Espacio> reservados = new ArrayList<>();
        ArrayList<Espacio> vendidos = new ArrayList<>();
        switch (categoria) {
            case "Apartamento":
                for (Espacio espacio : data) {
                    if (espacio instanceof Apartamento) {
                        if (espacio.getEstado().equals("disponible")) {
                            disponibles.add(espacio);
                        }else if (espacio.getEstado().equals("reservado")) {
                            reservados.add(espacio);
                        }else if (espacio.getEstado().equals("vendido")) {
                            vendidos.add(espacio);
                        }
                    }
                }
                System.out.println("\n Disponibles: ");
                for (Espacio disponible : disponibles) {
                    Apartamento apartamento = (Apartamento) disponible;
                    System.out.println("-Código: "+apartamento.getID()+" metros cuadrados: "+apartamento.getMCuadrados()+
                                            "\n estado: "+apartamento.getEstado()+" línea blanca: "+apartamento.getLineaBlanca()+
                                            "\n habitaciones: "+apartamento.getHabitaciones());
                }
                System.out.println("\n Reservados: ");
                for (Espacio reservado : reservados) {
                    Apartamento apartamento = (Apartamento) reservado;
                    System.out.println("-Código: "+apartamento.getID()+" metros cuadrados: "+apartamento.getMCuadrados()+
                                            "\n estado: "+apartamento.getEstado()+" línea blanca: "+apartamento.getLineaBlanca()+
                                            "\n habitaciones: "+apartamento.getHabitaciones());
                }
                System.out.println("\n Vendidos: ");
                for (Espacio vendido : vendidos) {
                    Apartamento apartamento = (Apartamento) vendido;
                    System.out.println("-Código: "+apartamento.getID()+" metros cuadrados: "+apartamento.getMCuadrados()+
                                            "\n estado: "+apartamento.getEstado()+" línea blanca: "+apartamento.getLineaBlanca()+
                                            "\n habitaciones: "+apartamento.getHabitaciones());
                }
                break;
            case "Oficina":
                for (Espacio espacio : data) {
                    if (espacio instanceof Oficina) {
                        if (espacio.getEstado().equals("disponible")) {
                            disponibles.add(espacio);
                        }else if (espacio.getEstado().equals("reservado")) {
                            reservados.add(espacio);
                        }else if (espacio.getEstado().equals("vendido")) {
                            vendidos.add(espacio);
                        }
                    }
                }
                System.out.println("\n Disponibles: ");
                for (Espacio disponible : disponibles) {
                    Oficina oficina = (Oficina) disponible;
                     System.out.println("-Código: "+oficina.getID()+" metros cuadrados: "+oficina.getMCuadrados()+
                                            "\n estado: "+oficina.getEstado()+" total parqueos: "+oficina.getTotalParqueos()+
                                            "\n mantenimiento: "+oficina.getMantenimiento());
                }
                System.out.println("\n Reservados: ");
                for (Espacio reservado : reservados) {
                    Oficina oficina = (Oficina) reservado;
                     System.out.println("-Código: "+oficina.getID()+" metros cuadrados: "+oficina.getMCuadrados()+
                                            "\n estado: "+oficina.getEstado()+" total parqueos: "+oficina.getTotalParqueos()+
                                            "\n mantenimiento: "+oficina.getMantenimiento());
                }
                System.out.println("\n Vendidos: ");
                for (Espacio vendido : vendidos) {
                    Oficina oficina = (Oficina) vendido;
                     System.out.println("-Código: "+oficina.getID()+" metros cuadrados: "+oficina.getMCuadrados()+
                                            "\n estado: "+oficina.getEstado()+" total parqueos: "+oficina.getTotalParqueos()+
                                            "\n mantenimiento: "+oficina.getMantenimiento());
                }
                break;
            case "Amenidades":
                for (Espacio espacio : data) {
                    if (espacio instanceof Amenidades) {
                        if (espacio.getEstado().equals("disponible")) {
                            disponibles.add(espacio);
                        }else if (espacio.getEstado().equals("reservado")) {
                            reservados.add(espacio);
                        }else if (espacio.getEstado().equals("vendido")) {
                            vendidos.add(espacio);
                        }
                    }
                }
                System.out.println("\n Disponibles: ");
                for (Espacio disponible : disponibles) {
                    Amenidades amenidad = (Amenidades) disponible;
                    System.out.println("-Código: "+amenidad.getID()+" metros cuadrados: "+amenidad.getMCuadrados()+
                                            "\n estado: "+amenidad.getEstado()+" total parqueos: "+amenidad.getTipoAmenidad()+
                                            "\n mantenimiento: "+amenidad.getCapacidad());
                }
                System.out.println("\n Reservados: ");
                for (Espacio reservado : reservados) {
                    Amenidades amenidad = (Amenidades) reservado;
                    System.out.println("-Código: "+amenidad.getID()+" metros cuadrados: "+amenidad.getMCuadrados()+
                                            "\n estado: "+amenidad.getEstado()+" total parqueos: "+amenidad.getTipoAmenidad()+
                                            "\n mantenimiento: "+amenidad.getCapacidad());
                }
                System.out.println("\n Vendidos: ");
                for (Espacio vendido : vendidos) {
                    Amenidades amenidad = (Amenidades) vendido;
                   System.out.println("-Código: "+amenidad.getID()+" metros cuadrados: "+amenidad.getMCuadrados()+
                                            "\n estado: "+amenidad.getEstado()+" total parqueos: "+amenidad.getTipoAmenidad()+
                                            "\n mantenimiento: "+amenidad.getCapacidad());
                }
                break;
            default:
                break;
        }
    }


}

