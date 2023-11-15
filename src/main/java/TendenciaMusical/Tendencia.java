package TendenciaMusical;



public  class Tendencia implements Popularidad{
    private Cancion temaMusical;

    @Override
    public void RatesUp() {

    }

    @Override
    public void RatesDown() {
        temaMusical.setPopularidad(new Normal());
    }

    @Override
    public void setPopularidad(Cancion temaMusical) {
        this.temaMusical = temaMusical ;

    }

    @Override
    public void getPopularidad() {
        Icono nota =  new Icono(new int[]{0xD83D, 0xDD25});
        System.out.println(temaMusical.toString() + "Su popularidad es Tendencia " + nota.texto());

    }


}
