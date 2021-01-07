
public class Bebida extends Productos {

    private double litros;

    public Bebida() {

    }

    public Bebida(String nombreProduc, int precio, double litros) {
        super(nombreProduc, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public void mostrarDetalle() {
         System.out.println("Nombre : " + super.getNombreProduc()+"///" +   "Litros: " + litros +"///"+ "Precio: $" + super.getPrecio());
    }
    
}