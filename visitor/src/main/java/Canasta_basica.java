public class Canasta_basica implements Visitable {

        private double precio;

        Canasta_basica(double articulo){

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
