public class pGuerrero {

    private static int comptadorGuerreros = 0;

    private int idGuerrero;

    private String nombre;
    private int puntosVida = 100;
    private int energia;

    private Object[] status;

    private eArmadura armaduraEquipada;
    private eArma armaEquipada;

    // Constructor SENSE id
    public pGuerrero(String nombre, int puntosVida, int energia) {

        // Generar ID automàtic
        comptadorGuerreros++;
        this.idGuerrero = comptadorGuerreros;

        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.energia = energia;
    }

    public int getIdGuerrero() {
        return idGuerrero;
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

    public void atacar(pGuerrero oponente){
        int fuerza = (int)(Math.random() * 6);
        if (fuerza == 6){ //Daño critico
            fuerza = 10;
        }
        int danyo = this.armaEquipada.damage() + fuerza;
    }
}