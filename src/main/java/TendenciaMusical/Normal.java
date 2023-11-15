package TendenciaMusical;


public  class Normal implements Popularidad{
    private Cancion temaMusical;
    private Icono normal;
    private String popular;





    @Override
    public void RatesUp() {
        temaMusical.setPopularidad(new enAuge());
    }

    @Override
    public void RatesDown() {

    }

    @Override
    public void setPopularidad(Cancion temaMusical) {
        this.temaMusical = temaMusical ;

    }

    @Override
    public void getPopularidad() {
        Icono nota = new Icono(new int[]{0xD83C, 0xDFB5});
        System.out.println(temaMusical.toString() + "Su popularidad es Normal " + nota.texto());

    }





}