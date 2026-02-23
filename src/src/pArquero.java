public class pArquero {

    private static int comptadorArqueros = 0;

    private int idArquero;

    private String nombre;
    private int puntosVida = 100;
    private int municion;

    private Object[] status;

    private eArmadura armaduraEquipada;
    private eArma armaEquipada;

    public pArquero(String nombre, int puntosVida, int municion){

        comptadorArqueros++;
        this.idArquero = comptadorArqueros;

        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.municion = municion;
    }

    public int getIdArquero() {
        return idArquero;
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
        System.out.println("A " + oponente.getNombre() + " le quedan " + oponente.getHP() + " HP!");
    }
}
//