
public abstract class Productos implements Comparable<Productos> {

    private String nombreProduc;
    private int precio;

    public Productos() {

    }

    public Productos(String nombreProduc, int precio) {
        super();

        this.nombreProduc = nombreProduc;
        this.precio = precio;

    }

    public String getNombreProduc() {
        return nombreProduc;
    }

    public void setNombreProduc(String nombreProduc) {
        this.nombreProduc = nombreProduc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
@Override
    public int compareTo(Productos o) {
        if (getPrecio() < o.getPrecio()) {
            return -1;
        }
        if (getPrecio() > o.getPrecio()) {
            return 1;
        }
        return 0;

    }
    public abstract void mostrarDetalle();

    

    }


