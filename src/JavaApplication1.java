public class JavaApplication1 {

    //estamos agregando esto throws IOException, para manejar errores
    public static void main(String[] args) {

        
        
        auto objAuto1 = new auto("Yaris"); // esta linea crea un objeto ó instancia
        auto objAuto2 = new auto("Toyota");
/*
        if (objAuto1(EstadoAuto()) == false) {
            System.out.println(objAuto1.getmodelo()+":"+objAuto1.EstadoAuto());
        } else {
            System.out.println(objAuto2.getmodelo()+":"+objAuto2.EstadoAuto());
        }

        */

        System.out.println(objAuto1.getmodelo()+" Está "+objAuto1.EstadoAutoYaris()); //aqui jalamos el metodo creado
        System.out.println("-------sus atributos/ caracteristica--------");
        System.out.println( " color " + objAuto1.getcolorYaris() + " tamaño "+ objAuto1.gettamanoYaris()+" tiene "+ objAuto1.getruedasYaris()+ ", peso "+ objAuto1.getpesoYaris()+ " tiene " + objAuto1.getasientosYaris());
        System.out.println("");

        System.out.println(objAuto2.getmodelo()+" Está "+objAuto2.EstadoAutoToyota());
        System.out.println("-------sus atributos/ caracteristica--------");
        System.out.println( " color " + objAuto2.getcolorToyota()+ " tamaño " + objAuto2.gettamanoToyota()+ " tiene " + objAuto2.getruedasToyota()+", peso "+ objAuto2.getpesoToyota()+" tiene " + objAuto2.getasientosToyota());
               
       
}

}