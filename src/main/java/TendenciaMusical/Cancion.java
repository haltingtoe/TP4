package TendenciaMusical;



public class Cancion {
    private String nombre;
    private String artista;
    private String album;
    private String ano;


   private Popularidad estado ;


    public Cancion(String nombre, String artista , String album , String fecha  ) {

        this.nombre = nombre ;
        this.artista = artista ;
        this.album = album ;
        this.ano = fecha ;

        setPopularidad(new Normal());
        getPopularidad();
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", fecha='" + ano + '\'' +
                '}';
    }

    public void setPopularidad(Popularidad estado){
        this.estado = estado;
        this.estado.setPopularidad(this);
    }

   public void getPopularidad(){
        this.estado.getPopularidad();
   }

   public void decidir(boolean item1 , boolean item2 , boolean item3){
        if(item1 && item2 && !item3){
            this.estado.RatesUp();
        }
        if(!item1 && !item2 && item3 ){
            this.estado.RatesDown();
        }


   }
    public void RatesUp (){

        this.estado.RatesUp();

    }

    public void RatesDown () {
        this.estado.RatesDown();
    }

}

