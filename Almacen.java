
import java.util.LinkedList;
import java.util.List;

public class Almacen {

    private List<Productos> listaProductos;

    public Almacen() {
        this.listaProductos = new LinkedList<>();
    }

    public void agregarProducto(Productos p) {
        this.listaProductos.add(p);
    }

    public void listaProductos() {

        Bebida p1 = new Bebida("coca-cola Zero", 20, 1.5);
        Bebida p2 = new Bebida("coca-cola", 18, 1.5);
        Higene p3 = new Higene("Shampoo Sedal", 19, 500);
        Frutas p4 = new Frutas("Frutillas", 64, "kilo");

        this.agregarProducto(p1);
        this.agregarProducto(p2);
        this.agregarProducto(p3);
        this.agregarProducto(p4);
    }
	public void mostrarProductos() {
            listaProductos.forEach((producto) -> {
                producto.mostrarDetalle();
        });
		System.out.println("=============================");
	}
    public void productoMasCaro() {
        Productos max;
        max = this.listaProductos.get(0);
        for (Productos producto : listaProductos) {

            if (producto.compareTo(max)> 0) {
                max = producto;
            }
        }
        System.out.println("El producto mas caro :" + max.getNombreProduc());
    }

    public void productoMasBarato() {
        Productos min;
        min = this.listaProductos.get(0);
        for (Productos producto : listaProductos) {

            if (producto.compareTo(min) < 0) {
                min = producto;
            }
        }
        System.out.println("El producto mas barato :" + min.getNombreProduc());
    }
  

     

}
