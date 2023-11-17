import java.util.List;
import java.util.Scanner;

public class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad;
    String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Producto() {
    }

    public Producto(String nombre, double precio, String codigo, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public void ingresarProducto(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el codigo del producto: ");
        this.codigo = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();

    }

    public void imprimirProducto(){

        System.out.println("El nombre del producto es: "+this.nombre);
        System.out.println("El precio del producto es: "+this.precio);
        System.out.println("El codigo del producto es: "+this.codigo);
        System.out.println("La cantidad del producto es: "+this.cantidad);
        System.out.println("La marca del producto es: "+this.marca);
    }

    public void imprimirTodosProductos(List<Producto> listaProductos){

        for (Producto producto : listaProductos) {
            System.out.println("*************************************************");
            System.out.println("Producto: "+producto.getNombre());
            System.out.println("Codigo: "+producto.getCodigo());
            System.out.println("Precio: "+producto.getPrecio());
            System.out.println("Stock: "+producto.getCantidad());
            System.out.println("Proveedor: "+producto.getMarca());
            System.out.println("*************************************************");
        }
    }

}
