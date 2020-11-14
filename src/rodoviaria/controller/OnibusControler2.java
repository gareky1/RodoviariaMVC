package rodoviaria.controller;

import rodoviaria.model.Onibus2;

public class OnibusControler2 {

    private final Onibus2[] onibus2;
    private int cont;
    private boolean flag;

    public OnibusControler2() {

        this.cont = 0;
        this.onibus2 = new Onibus2[30];

    }

    public boolean adicionarOnibus(Onibus2 o) {
        if (o == null || onibus2.length == cont || procurarOnibus(o.getRota()) != -1) {
            return false;
        } else {
            this.onibus2[cont] = o;
            cont++;

        }
        return true;
    }

    private int procurarOnibus(String Onibusrotas) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.onibus2[i].getRota().equals(Onibusrotas)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.onibus2[meio].getRota().compareToIgnoreCase(Onibusrotas) == 0) {
                    return meio;
                } else if (Onibusrotas.compareToIgnoreCase(this.onibus2[meio].getRota()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }

    public boolean resevarAssento(Onibus2 o) {

        if (o == null || onibus2.length == cont || procurarOnibus(o.getRota()) != -1) {

            return true;
        } else {
            this.onibus2[cont] = o;

            return false;
        }

    }

}
