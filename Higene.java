
/**
 *
 * @author LENOVO
 */
public class Higene extends Productos {

    private int contenido;

    public Higene(String nombreProduc, int precio, int contenido) {
        super(nombreProduc, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: " + super.getNombreProduc() + "///" + "contenido: " + contenido + "ml" + "/// " + "Precio: $" + super.getPrecio());
    }
}
