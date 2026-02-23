public class eArma {
    private String nombreArma = "";
    private int dañoBase = 0;
    private tipoDaño tipoDaño;

    public eArma(String nombreArma, int dañoBase, tipoDaño tipoDaño) {
        this.nombreArma = nombreArma;
        this.dañoBase = dañoBase;
        this.tipoDaño = tipoDaño;
    }
    public tipoDaño getTipoDaño() {
        return this.tipoDaño;
    }
    public int damage() {
        return this.dañoBase;
    }
}
//
