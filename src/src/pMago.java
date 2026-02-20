public class pMago {

    private static int comptadorMagos = 0;

    private int idMago;

    private String nombre;
    private int puntosVida = 100;
    private int mana;

    private eArmadura armaduraEquipada;
    private eArma armaEquipada;

    public pMago(String nombre, int puntosVida, int mana) {

        comptadorMagos++;
        this.idMago = comptadorMagos;

        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.mana = mana;

    }

    public int getIdMago() {
        return idMago;
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