/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar datos de apartamentos
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
public class SpaceUVG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Bienvenid@ al programa SpaceUVG");
        do {
            System.out.println("----Menú----"+
                                "\n1. Buscar espacioUVG por ID"+
                                "\n2. Listar espacio por categoría"+
                                "\n3. Listar espacio por estado"+
                                "\n4. Salir");
            try {
                int opcion = scan.nextInt();
                scan.nextLine();
                switch (opcion) {
                    case 1:
                        // LecturaEspacio.buscarID
                        break;
                    case 2:
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
                                    // LeerEspacio.listar(Apartamento);
                                    break;
                                case 2:
                                    // LeerEspacio.listar(Oficina);
                                    break;
                                case 3:
                                    // LeerEspacio.listar(Amenidades);
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
                                    // LeerEspacio.estado(Apartamento);
                                    break;
                                case 2:
                                    // LeerEspacio.estado(Oficina);
                                    break;
                                case 3:
                                    // LeerEspacio.estado(Amenidades);
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
