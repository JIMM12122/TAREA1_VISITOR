public class Abarrotes_comunes implements Visitable {

    private double precio;

    Abarrotes_comunes(double articulo){

        precio = articulo;
    }

    public double getPrecio() {
        return precio;
    }



    public double aceptar(Visitante visitante) {
        return visitante.visita(this);
    }


}
