import java.util.Scanner;

public class Tecnologia extends Producto{

    private int vidaUtilanios;
    private String sitioFabricacion;
    private String garantia;
    private int anioFabricacion;

    public Tecnologia() {
    }

    public Tecnologia(int vidaUtilanios, String sitioFabricacion, String garantia, int anioFabricacion) {
        this.vidaUtilanios = vidaUtilanios;
        this.sitioFabricacion = sitioFabricacion;
        this.garantia = garantia;
        this.anioFabricacion = anioFabricacion;
    }

    public int getVidaUtilanios() {
        return vidaUtilanios;
    }

    public void setVidaUtilanios(int vidaUtilanios) {
        this.vidaUtilanios = vidaUtilanios;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
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
        System.out.println("Ingrese la vida util en años del producto: ");
        this.vidaUtilanios = sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion del producto: ");
        this.sitioFabricacion= sc.next();
        System.out.println("Ingrese la garantia del producto: ");
        this.garantia = sc.next();
        System.out.println("Ingrese el año de fabricación del producto: ");
        this.vidaUtilanios = sc.nextInt();
    }

    @Override
    public void imprimirProducto(){

        System.out.println("El nombre del producto es: "+this.nombre);
        System.out.println("El precio del producto es: "+this.precio);
        System.out.println("El codigo del producto es: "+this.codigo);
        System.out.println("La cantidad del producto es: "+this.cantidad);
        System.out.println("La marca del producto es: "+this.marca);
        System.out.println("La vida util del producto es: "+this.vidaUtilanios);
        System.out.println("El sitio de fabricacion del producto es: "+this.sitioFabricacion);
        System.out.println("La garantia del producto es: "+this.garantia);
        System.out.println("El anio de fabricacion del producto es: "+this.anioFabricacion);

    }

}


