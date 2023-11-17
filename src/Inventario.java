import java.util.List;
import java.util.Scanner;

public class Inventario {

    public void agregarProducto(List<Producto> listaProductos){

        String opcion ;
        Scanner sc = new Scanner(System.in);

        do {

            Producto producto = new Producto();
            producto.ingresarProducto();
            listaProductos.add(producto);
            System.out.println("Producto "+producto.getNombre()+" ingresado");
            System.out.println("==================================================================");
            System.out.println("¿Desea agregar otro producto? (si/no)");
            opcion=sc.next().toLowerCase();

        }while(opcion.equals("si"));
    }

}
