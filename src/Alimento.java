import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{

    private String fechaElaboracion;
    private String fechaExpiracion;
    private String codigo;
    private List<String> inggredientes = new ArrayList<>();

    public Alimento() {
    }

    public Alimento(String nombre, double precio, String codigo, int cantidad,
                    String marca, String fechaElaboracion, String fechaExpiracion,
                    List<String> inggredientes) {
        super(nombre, precio, codigo, cantidad, marca);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
        this.inggredientes = inggredientes;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public List<String> getInggredientes() {
        return inggredientes;
    }

    public void setInggredientes(List<String> inggredientes) {
        this.inggredientes = inggredientes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
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
        System.out.println("Ingrese marca del producto: ");
        this.marca = sc.next();
        System.out.println("Ingrese fecha de elaboracion del producto: ");
        this.fechaElaboracion = sc.next();
        System.out.println("Ingrese fecha de expiracion del producto: ");
        this.fechaExpiracion = sc.next();

    }

    @Override
    public void imprimirProducto(){

        System.out.println("El nombre del producto es: "+this.nombre);
        System.out.println("El precio del producto es: "+this.precio);
        System.out.println("El codigo del producto es: "+this.codigo);
        System.out.println("La cantidad del producto es: "+this.cantidad);
        System.out.println("La marca del producto es: "+this.marca);
        System.out.println("Fecha de elaboracion del producto es: "+this.fechaElaboracion);
        System.out.println("Fecha de expiracion es: "+this.fechaExpiracion);

    }

}
