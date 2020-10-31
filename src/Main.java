import DTBconeccion.DTBconeccion;

public class Main {
    public  static void main(String[] args){
        System.out.println("Keloke bro' ,  mete mano!");
        DTBconeccion coneccion = new DTBconeccion();
        coneccion.connectar();

        // ese es el get de la coneccion , asi accedes a ella.
        // coneccion.getConeccion();
    }
}
