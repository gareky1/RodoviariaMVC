package rodoviaria.model;

import rodoviaria.dao.AssentoDao2;
import rodoviaria.dao.ExceptionDao2;

public class Assento2 {

    private String lugar;

    public Assento2(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void resevarAssento(Assento2 assento2) throws ExceptionDao2 {
        new AssentoDao2().cadastraAssento(assento2);
    }
}
