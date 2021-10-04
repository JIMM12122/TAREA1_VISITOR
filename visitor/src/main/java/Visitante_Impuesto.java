import java.text.DecimalFormat;

public class Visitante_Impuesto implements Visitante {
 DecimalFormat fd = new DecimalFormat("########");
    public Visitante_Impuesto() {
    }

    @Override
    public double visita(Canasta_basica producto) {
        System.out.println("El precio del articulo con el iva para la canasta basica ");
        return Double.parseDouble(fd.format((producto.getPrecio()*.01)+producto.getPrecio()));

    }

    @Override
    public double visita(Cigarros producto) {
        System.out.println("El precio del articulo con el iva para  el tabaco ");
        return Double.parseDouble(fd.format((producto.getPrecio()*.30)+producto.getPrecio()));
    }

    @Override
    public double visita(Abarrotes_comunes producto) {
        System.out.println("El precio del articulo con el iva para la Abarrotes comunes");
        return Double.parseDouble(fd.format((producto.getPrecio()*.13)+producto.getPrecio()));
    }
}
