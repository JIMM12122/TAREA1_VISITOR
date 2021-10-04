public class Cigarros implements Visitable {

      private double precio;

      Cigarros(double articulo){

          precio = articulo;
      }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double aceptar(Visitante visitante) {
        return visitante.visita(this);
    }
}
