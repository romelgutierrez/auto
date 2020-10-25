

public class auto {  //clase principal Auto
    
    //solamente estot declarando variables
    String modelo;
    String peso;
    String tamano;
    String asientos;
    String color; // atributos, variables
    int ruedas;    // variables
    boolean encendido;     // variable logica, ESTADO DEL AUTO
    
    
    //un constructor lleva el mismo nombre de la CLASE
    //Ejmplo
    public auto(String mod){
      modelo = mod;
      encendido = true;
    }
    // este metodo nos sesta mostrando el modelo
    public String getmodelo(){
       
        return modelo;
    }

    public String getcolor(){
        return color;
    }

    public void encender(){ //es como declaro un METODO "encender"
        
        encendido = false;  //variable que toma una condicion
        
    }
    public void apagar(){ //es como declaro un METODO "apagar"
        
        encendido = true;
    }
    // estamso creando un metodo estado del auto

    // estado del auto
    public String EstadoAutoYaris(){
    /*    
       if (encendido == true)
       {
           return "encendido";
       }
       else
       {
           return "apagado";
       }
       */
        if(encendido == true)
        {
            return "encendido, Acelera";
        }
        else{
            return "apagado, Pon la llave";
        }
    
    }    
    public String EstadoAutoToyota(){
        /*    
           if (encendido == true)
           {
               return "encendido";
           }
           else
           {
               return "apagado";
           }*/
                  
            if(encendido == false)
            {
                return "encendido, Acelera";
  
            }
            else{
                return "apagado, Pon la llave ";
            } 
        }  
     
    // ruedas de carro
    public String getruedasYaris(){
         
        return "4 ruedas";

    }
    public String getruedasToyota(){
         
        return "6 ruedas";

    }
    // color del carro
    public String getcolorYaris(){
         
        return "Negro";

    }
    public String getcolorToyota(){
         
        return "AZUL";

    }

    // tamaño del auto

    public String gettamanoYaris(){
         
        return "pequeño";

    }
    public String gettamanoToyota(){
         
        return "grande";

    }
    
    // asientos del auto

    public String getasientosYaris(){
         
        return "4 asientos";

    }
    public String getasientosToyota(){
         
        return "6  asientos";

    }
     
    // peso del auto
    public String getpesoYaris(){
         
        return "900 kg";

    }
    public String getpesoToyota(){

        return "4000 kg ";

    }
    
    // t
    }
