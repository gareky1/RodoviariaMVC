package rodoviaria.controller;

import rodoviaria.dao.AssentoDao;
import rodoviaria.dao.ExceptionDao;
import rodoviaria.model.Assento;

public class AssentoControler {

    private final Assento[] onibus;

    private int cont;

    public AssentoControler() {

        this.cont = 0;
        this.onibus = new Assento[25];

    }

    public boolean adicionarAssento(Assento a) throws ExceptionDao {
        if (onibus.length == cont) {
            return false;
        } else {
            this.onibus[cont] = a;
            cont++;
            new AssentoDao().cadastraAssento(a);
            return true;
        }
    }

}
