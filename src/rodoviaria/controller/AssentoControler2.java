package rodoviaria.controller;

import rodoviaria.model.Assento2;

public class AssentoControler2 {

    private final Assento2[] onibus;

    private int cont;

    public AssentoControler2() {

        this.cont = 0;
        this.onibus = new Assento2[25];

    }

    public boolean adicionarAssento(Assento2 a) {
        if (onibus.length == cont) {
            return false;
        } else {
            this.onibus[cont] = a;
            cont++;
            return true;
        }
    }

}
