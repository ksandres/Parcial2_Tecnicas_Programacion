public class Telefono extends Producto {

    private String almacenamiento;
    private String descripcion;
    private String procesador;

    public Telefono(String nombre, String descripcion, int precio, int cantidad
        ,String almacenamiento, String marca ,String procesador) {
        super(nombre, descripcion, precio, cantidad);

        this.almacenamiento = almacenamiento;
        this.descripcion = marca;
        this.procesador= procesador;
    }


    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getPrecio(){

        return getPrecio();
    }
}



