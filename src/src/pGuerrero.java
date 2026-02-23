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
    public String getNombre() {
        return nombre;
    }

    public eArmadura getArmaduraEquipada() {
        return armaduraEquipada;
    }

    public eArma getArmaEquipada() {
        return armaEquipada;
    }
    
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

    public void setStatus(tipoDaño status, int turnos){
        if (status == tipoDaño.fisico){ //Hacer que el status sea físico lo marca como ninguno
            this.status[0] = "none";
            this.status[1] = 0;
            return;
        }
        this.status[0] = status;
        this.status[1] = turnos;
    }
    public Object getStatus(){ return this.status[0]; }

    public int getHP(){ return puntosVida; }
    public void setHP(int newHP){ this.puntosVida = newHP; }

    public void atacar(pArquero oponente){
        if (this.armaEquipada == null){
            System.out.println(this.nombre + " no tiene arma, así que no puede atacar");
            return;
        }
        int fuerza = (int)(Math.random() * 6);
        if (fuerza == 6){ //Daño critico
            fuerza = 10;
        }
        double reduccion = 1;
        if (oponente.getArmaduraEquipada() != null){
            reduccion = 1 - (oponente.getArmaduraEquipada().getDefensa() * 0.1);
        }
        int daño = (int)((this.armaEquipada.damage() + fuerza) * reduccion);
        System.out.println(this.nombre + " ha causado " + daño + " daño " + this.armaEquipada.getTipoDaño() + " a " + oponente.getNombre());
        oponente.setHP(oponente.getHP() - daño);
        if (this.armaEquipada.getTipoDaño() != tipoDaño.fisico && oponente.getStatus() != "none"){ //Añade un status si el arma atacante tiene y el oponente no tiene ningún status
            oponente.setStatus(this.armaEquipada.getTipoDaño(), 3);
        }
        System.out.println("A " + oponente.getNombre() + " le quedan " + oponente.getHP() + " HP!");
    }

    public void atacar(pMago oponente){
        if (this.armaEquipada == null){
            System.out.println(this.nombre + " no tiene arma, así que no puede atacar");
            return;
        }
        int fuerza = (int)(Math.random() * 6);
        if (fuerza == 6){ //Daño critico
            fuerza = 10;
        }
        double reduccion = 1;
        if (oponente.getArmaduraEquipada() != null){
            reduccion = 1 - (oponente.getArmaduraEquipada().getDefensa() * 0.1);
        }
        int daño = (int)((this.armaEquipada.damage() + fuerza) * reduccion);
        System.out.println(this.nombre + " ha causado " + daño + " daño " + this.armaEquipada.getTipoDaño() + " a " + oponente.getNombre());
        oponente.setHP(oponente.getHP() - daño);
        if (this.armaEquipada.getTipoDaño() != tipoDaño.fisico && oponente.getStatus() != "none"){ //Añade un status si el arma atacante tiene y el oponente no tiene ningún status
            oponente.setStatus(this.armaEquipada.getTipoDaño(), 3);
        }
        System.out.println("A " + oponente.getNombre() + " le quedan " + oponente.getHP() + " HP!");
    }

    public void atacar(pGuerrero oponente){
        if (this.armaEquipada == null){
            System.out.println(this.nombre + " no tiene arma, así que no puede atacar");
            return;
        }
        int fuerza = (int)(Math.random() * 6);
        if (fuerza == 6){ //Daño critico
            fuerza = 10;
        }
        double reduccion = 1;
        if (oponente.getArmaduraEquipada() != null){
            reduccion = 1 - (oponente.getArmaduraEquipada().getDefensa() * 0.1);
        }
        int daño = (int)((this.armaEquipada.damage() + fuerza) * reduccion);
        System.out.println(this.nombre + " ha causado " + daño + " daño " + this.armaEquipada.getTipoDaño() + " a " + oponente.getNombre());
        oponente.setHP(oponente.getHP() - daño);
        if (this.armaEquipada.getTipoDaño() != tipoDaño.fisico && oponente.getStatus() != "none"){ //Añade un status si el arma atacante tiene y el oponente no tiene ningún status
            oponente.setStatus(this.armaEquipada.getTipoDaño(), 3);
        }
        System.out.println("A " + oponente.getNombre() + " le quedan " + oponente.getHP() + " HP!");
    }
}