import java.time.Clock;

public class main {



    public static void main(String [] args){
       Visitante_Impuesto calcular_impuesto = new Visitante_Impuesto();
        Impuesto_ley78434  calcular_nuevo_impuesto = new Impuesto_ley78434();
        Canasta_basica arroz =new Canasta_basica(1000);
        Canasta_basica frijoles = new Canasta_basica(1500);
        Cigarros Habanos = new Cigarros(3000);
    //impuesto comun
          System.out.println("PRECIOS ANTIGUA LEY DE HACIENDA");
           System.out.println(arroz.aceptar((Visitante) calcular_impuesto));
           System.out.println(Habanos.aceptar((Visitante) calcular_impuesto));
           System.out.println(frijoles.aceptar((Visitante) calcular_impuesto));
    // impuesto nueva ley
        System.out.println("NUEVOS PRECIOS\n");
        System.out.println(arroz.aceptar((Visitante) calcular_nuevo_impuesto));
        System.out.println(Habanos.aceptar((Visitante) calcular_nuevo_impuesto));
        System.out.println(frijoles.aceptar(calcular_nuevo_impuesto));
    }
}
