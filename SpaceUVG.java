/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * Driver program
 * 
 * @author: Erick Barrera - 231238, Juan Ignacio Figueroa - 23092
 * @version: 1.0.0
 * @date: 16/10/23
 * @lastUpdate: 16/10/23
 * 
 * Changes: maquetación main
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class SpaceUVG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        ArrayList<Espacio> allData=DataReader.LeerData();
        System.out.println("Bienvenid@ al programa SpaceUVG");
        do {
            System.out.println("----Menú----"+
                                "\n1. Desplegar informe de espacios"+
                                "\n2. Buscar espacioUVG por ID"+
                                "\n3. Listar espacio por categoría"+
                                "\n4. Listar espacio por estado"+
                                "\n5. Salir");
            try {
                int opcion = scan.nextInt();
                scan.nextLine();
                switch (opcion) {
                    case 1: //Realizar informe sobre espacios de cada categoría
                        DataReader.informe(allData);
                        scan.nextLine();
                        break;

                    case 2: //Busca espacio a partir de un ID ingresado
                        System.out.println("Ingrese el ID del espacio buscado:");
                        String ID=scan.nextLine();
                        Espacio espacioID=DataReader.buscarID(allData, ID);
                        if(espacioID.getID().equals("-")){ //Si no existe ningún espacio con el ID regresa un mensaje
                            System.out.println("No existe ningún espacio con el ID ingresado");
                        }
                        else{
                            System.out.printf("\nMetros cuadrados: %s\nCategoría: %s\nEstado: %s",espacioID.getMCuadrados(),espacioID.getCategoria(),espacioID.getEstado());
                            switch(espacioID.getCategoria()){
                                case "apartamento":
                                    Apartamento apartamentoID = (Apartamento) espacioID;
                                    System.out.printf("\nLínea blanca: %s\nHabitaciones: %s",apartamentoID.getLineaBlanca(),apartamentoID.getHabitaciones());
                                    break;
                                case "oficina":
                                    Oficina oficinaID = (Oficina) espacioID;
                                    System.out.printf("\nTotal parqueos: %s\nMantenimiento: %s",oficinaID.getTotalParqueos(),oficinaID.getMantenimiento());
                                    break;
                                case "amenidad":
                                    Amenidades amenidadesID = (Amenidades) espacioID;
                                    System.out.printf("\nTipo: %s\nCapacidad: %s",amenidadesID.getTipoAmenidad(),amenidadesID.getCapacidad());
                                    break;
                            }
                            System.out.println(" ");
                        }
                        scan.nextLine();
                        break;
                    case 3:
                        System.out.println("Seleccione el número de la categoría"+
                                                "\n1. Apartamento"+
                                                "\n2. Oficina"+
                                                "\n3. Amenidades"+
                                                "\n4. Salir al menú");
                        try {
                            int categoria = scan.nextInt();
                            scan.nextLine();
                            switch (categoria) {
                                case 1:
                                    DataReader.listar("Apartamento", allData);
                                    break;
                                case 2:
                                    DataReader.listar("Oficina", allData);
                                    break;
                                case 3:
                                    DataReader.listar("Amenidades", allData);
                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú...");
                                    return;
                                default:
                                    System.out.println("Seleccione una opción válida!");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingreso inválido!!");
                        }
                        break;
                    case 4:
                        System.out.println("Seleccione el número de la categoría"+
                                                "\n1. Apartamento"+
                                                "\n2. Oficina"+
                                                "\n3. Amenidades"+
                                                "\n4. Salir al menú");
                        try {
                            int categoria = scan.nextInt();
                            scan.nextLine();
                            switch (categoria) {
                                case 1:
                                    DataReader.estado("Apartamento", allData);
                                    break;
                                case 2:
                                    DataReader.estado("Oficina", allData);
                                    break;
                                case 3:
                                    DataReader.estado("Amenidades", allData);
                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú...");
                                    return;
                                default:
                                    System.out.println("Seleccione una opción válida!");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Ingreso inválido!!");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese una opción válida");
            }
        } while (!salir);
        scan.close();
    }
}
