public class pArquero {

    private static int comptadorArqueros = 0;

    private int idArquero;

    private String nombre;
    private int puntosVida = 100;
    private int flechas;

    private eArmadura armaduraEquipada;
    private eArma armaEquipada;

    public pArquero(String nombre, int puntosVida, int flechas){

        comptadorArqueros++;
        this.idArquero = comptadorArqueros;

        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.flechas = flechas;

    }

    public int getIdArquero() {
        return idArquero;
    }

    public eArmadura getArmaduraEquipada() {
        return armaduraEquipada;
    }

    public eArma getArmaEquipada() {
        return armaEquipada;
    }
    // Dentro de cada clase
    public void equiparArma(eArma arma) {
        if (arma != null) {
            this.armaEquipada = arma;
        } else {
            System.out.println(nombre + " no puede equipar un arma nula.");
        }
    }

    public void equiparArmadura(eArmadura armadura) {
        if (armadura != null) {
            this.armaduraEquipada = armadura;
        } else {
            System.out.println(nombre + " no puede equipar una armadura nula.");
        }
    }
}