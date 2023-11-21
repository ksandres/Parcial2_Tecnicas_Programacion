import java.text.NumberFormat;
import java.util.Locale;
public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;




    public Producto(String nombre, String descripcion, int precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        NumberFormat pesoCo = NumberFormat.getCurrencyInstance(new Locale("es","CO"));
        return pesoCo.format(this.precio);
    }

    public void mostrarInfo(){
        System.out.println("Nombre" + nombre);
        System.out.println("Descripcion" + descripcion);
        System.out.println("Precio" + getPrecio());
        System.out.println("Cantidad Disponible" + cantidad);
    }
}
