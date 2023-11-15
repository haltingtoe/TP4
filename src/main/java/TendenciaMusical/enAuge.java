package TendenciaMusical;



public  class enAuge implements Popularidad{
    private Cancion temaMusical;

    @Override
    public void RatesUp() {
        temaMusical.setPopularidad(new Tendencia());

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
        Icono nota = new Icono(new int[]{0xD83D, 0xDE80});
        System.out.println(temaMusical.toString() + "Su Popularidad sea Auge " + nota.texto());

    }

}
