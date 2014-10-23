package boletin6.pkg14;

public class Tenda {

    private String codigo;
    private float prezo;

    public Tenda(String c, float p) {
        codigo = c;
        prezo = p;
    }

    @Override
    public String toString() {
        return "codigo:" + codigo + "\t" + "prezo:" + prezo + "€";

    }

    Tenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrezo() {
        return prezo;
    }

}
