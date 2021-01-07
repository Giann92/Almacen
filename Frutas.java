public class Frutas extends Productos {

    private String unidad;

    public Frutas(String nombreProduc, int precio, String unidad) {
        super(nombreProduc, precio);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: " + super.getNombreProduc() + "///" + "Precio: $" + super.getPrecio() + "///" + "Unidad de venta: " + unidad);
    }

}
