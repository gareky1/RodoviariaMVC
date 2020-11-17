package rodoviaria.model;

import rodoviaria.dao.AssentoDao;
import rodoviaria.dao.ExceptionDao;

public class Assento {

    private String lugar;

    public Assento(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void resevarAssento(Assento assento2) throws ExceptionDao {
        new AssentoDao().cadastraAssento(assento2);
    }
}
