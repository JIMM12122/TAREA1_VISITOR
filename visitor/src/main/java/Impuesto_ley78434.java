import java.text.DecimalFormat;

public class Impuesto_ley78434 implements Visitante {

    DecimalFormat fd = new DecimalFormat("########");
    public Impuesto_ley78434() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public double visita(Canasta_basica producto) {
        System.out.println("El precio del articulo con el iva para la canasta basica ");
        return Double.parseDouble(fd.format((producto.getPrecio()*.13)+producto.getPrecio()));

    }

    @Override
    public double visita(Cigarros producto) {
        System.out.println("El precio del articulo con el iva para  el tabaco ");
        return Double.parseDouble(fd.format((producto.getPrecio()*.50)+producto.getPrecio()));
    }

    @Override
    public double visita(Abarrotes_comunes producto) {
        System.out.println("El precio del articulo con el iva para la Abarrotes comunes");
        return Double.parseDouble(fd.format((producto.getPrecio()*.20)+producto.getPrecio()));
    }


}
