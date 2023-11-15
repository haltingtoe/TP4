package MostrarPopularidad;


import TendenciaMusical.*;
import org.junit.Test;

public class mostrarPopularidad {
    @Test
    public void popularidadNormal(){

        //instanciar cancion
        Cancion theScientist = new Cancion("The  Scientist" , "Coldplay" , "A Rush of Blood to the head" , "2002"   );




    }
    @Test
    public void popularidadEnAuge(){
         boolean likes = true;
         boolean dislikes = false;
         boolean reproducciones = true;
        Cancion theScientist = new Cancion("The  Scientist" , "Coldplay" , "A Rush of Blood to the head" , "2002"   );
        System.out.println("Tiene Reproducciones y likes suficientes como para que ");
        theScientist.decidir(likes,reproducciones , dislikes);
        theScientist.getPopularidad() ;

    }
    @Test
    public void popularidadDeAugeANormal(){
        boolean likes = true;
        boolean dislikes = false;
        boolean reproducciones = true;
        Cancion theScientist = new Cancion("The  Scientist" , "Coldplay" , "A Rush of Blood to the head" , "2002"   );
        System.out.println("Tiene Reproducciones y likes suficientes como para que ");
        theScientist.decidir(likes,reproducciones , dislikes);
        theScientist.getPopularidad() ;
         likes = false;
         dislikes = true;
         reproducciones = false;

        System.out.println("Esta cancion solo tiene dislikes ");
        theScientist.decidir(likes,reproducciones , dislikes);
        theScientist.getPopularidad() ;

    }
    @Test
    public void popularidadEnTendencia(){

    }
    @Test
    public void popularidadDeTendenciaANormal(){

    }

}
