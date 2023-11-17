import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilanios;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico() {
    }

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca,
                            int vidaUtilanios, String sitioFabricacion, double voltajeAlimentacion,
                            String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilanios = vidaUtilanios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public double intervaloMantenimiento(){
        double intervalo = vidaUtilanios/5;
        return intervalo;
    }

    @Override
    public String toString(){
        return "El electrodomestico "+this.nombre+" es de marca "+this.marca;
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

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
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
        System.out.println("Ingrese el voltaje del producto del producto: ");
        this.voltajeAlimentacion = sc.nextDouble();
        System.out.println("Ingrese la garantia del producto: ");
        this.garantia = sc.next();

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
        System.out.println("El voltaje del producto es: "+this.voltajeAlimentacion);
        System.out.println("La garantia del producto es: "+this.garantia);

    }

}
