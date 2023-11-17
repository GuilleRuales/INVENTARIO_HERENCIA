import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends Producto {

    private List<Producto> listaProductos = new ArrayList<>();
    public void imprimirMenu() {

        int opcion = 0;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("=========================================================");
            System.out.println("ALIMENTO (1)");
            System.out.println("ELECTRODOMESTICO (2)");
            System.out.println("TECNOLOGIA(3)");
            System.out.println("VER INFORMACIÓN IMPORTANTE DE TODOS LOS PRODUCTOS(4)");
            System.out.println("SALIR (0)");
            System.out.println("=========================================================");

            do {

                System.out.println("\nINGRESE UNA OPCIÓN");
                opcion = sc.nextInt();
                Inventario inventario= new Inventario();

                switch (opcion) {
                    case 1:

                        Alimento a1 =  new Alimento();
                        a1.ingresarProducto();
                        listaProductos.add(a1);

                        break;
                    case 2:

                        Electrodomestico e1 = new Electrodomestico();
                        e1.ingresarProducto();
                        listaProductos.add(e1);

                        break;
                    case 3:

                        Tecnologia t1 = new Tecnologia();
                        t1.ingresarProducto();
                        listaProductos.add(t1);

                        break;

                    case 4:

                        Producto p1 = new Producto();
                        p1.imprimirTodosProductos(listaProductos);

                        break;

                    case 0:

                        System.out.println("GRACIAS POR PREFERIRNOS");

                        break;

                    default:

                        System.out.println("OPCION NO VALIDA");

                        break;
                }
            } while ((opcion < 0) || (opcion > 4));

        }while (opcion != 0);
    }
}

