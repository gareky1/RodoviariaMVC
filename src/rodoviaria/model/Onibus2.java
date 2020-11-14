package rodoviaria.model;

import rodoviaria.dao.ExceptionDao2;
import rodoviaria.dao.OnibusDao2;

public class Onibus2 {

    private String Rota;
    private Onibus2[] onibus2 = new Onibus2[2000];

    public Onibus2(String Rota) {
        this.Rota = Rota;
    }

    public String getRota() {
        return Rota;
    }

    public Onibus2[] getOnibus() {
        return onibus2;
    }

    public void setRota(String Rota) {
        this.Rota = Rota;
    }

    public void setOnibus(Onibus2[] onibus) {
        this.onibus2 = onibus;
    }

    public void cadastrarOnibus2(Onibus2 onibus) throws ExceptionDao2 {
        new OnibusDao2().cadastrarOnibus(onibus);
    }

}
