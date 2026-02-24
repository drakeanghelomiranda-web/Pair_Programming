void main(){
    gremio gremioRojo = new gremio();
    gremio gremioAzul = new gremio();

}

//Antes de empezar:
//      -Se asigna 3 personajes aleatorios a cada gremio
//      -Cada personaje tiene una armadura y arma aleatoria de su clase
//      -Justo antes de empezar combate se muestra cada personaje y su equipamiento
//
//Logica de combate:
//Al principio de turno, comprueba los status de cada personaje:
//      -Si el personaje tiene un status, pasa algo, y los turnos del status se reducen
//      -Si el status tiene 0 turnos, se pone el status como fisico con 0 turnos (estado default)
//En la fase de ataque, va personaje por personaje comprobando que:
//      -Esta vivo (vida > 0), por lo tanto ataca
//      -Si no esta vivo, se pasa su turno
//      -[IMPORTANTE] los perosonajes vivos no deberían de poder atacar a personajes muertos
//Al acabar la fase de combate, muestra la salud y energia de cada personaje
//Si el personaje está muerto simplemente muestra "muerto"
//Se debería añadir un scanner.nextLine al final del bucle para que el usuario pueda ir leyendo cada fase de combate comodamente
//La unica funcion del scanner es que el codigo se "detenga" y el usuario pueda leer

//Al acabar la batalla, se debe mostrar el gremio ganador y los supervivientes

public static void setRandomMember(gremio gremio){
        // Armas //
        // Guerrero //
        eArma aG1 = new eArma("Espada", 20, tipoDaño.fisico);
        eArma aG2 = new eArma("Maza", 14, tipoDaño.igneo);
        eArma aG3 = new eArma("Lanza", 10, tipoDaño.venenoso);
        eArma aG4 = new eArma("Hacha", 17, tipoDaño.cryogenico);

        // Mago //
        eArma aM1 = new eArma("Pocion de daño", 30, tipoDaño.fisico);
        eArma aM2 = new eArma("Bola de fuego", 20, tipoDaño.igneo);
        eArma aM3 = new eArma("Humo venenoso", 15, tipoDaño.venenoso);
        eArma aM4 = new eArma("Varita helada", 24, tipoDaño.cryogenico);

        // Arquero //
        eArma aA1 = new eArma("Arco", 25, tipoDaño.fisico);
        eArma aA2 = new eArma("Pistola", 17, tipoDaño.igneo);
        eArma aA3 = new eArma("Cerbatana", 13, tipoDaño.venenoso);
        eArma aA4 = new eArma("Lanzabolas de nieve", 20, tipoDaño.cryogenico);

        // Armadura //
        // Guerrero //
        eArmadura cG1 = new eArmadura("Armadura fundida", 15);
        eArmadura cG2 = new eArmadura("Armadura sagrada", 30);
        eArmadura cG3 = new eArmadura("Armadura de escarabajo", 45);

        // Mago //
        eArmadura cM1 = new eArmadura("Armadura de meteorito", 10);
        eArmadura cM2 = new eArmadura("Armadura tabú", 20);
        eArmadura cM3 = new eArmadura("Armadura espectral", 30);

        // Arquero //
        eArmadura cA1 = new eArmadura("Armadura necrótica", 25);
        eArmadura cA2 = new eArmadura("Armadura cryogenica", 32);
        eArmadura cA3 = new eArmadura("Armadura de shroomita", 40);

        // Guerreros
        pGuerrero pG1 = new pGuerrero("Guillem Alfonso XVII", 100, 140);
        pGuerrero pG2 = new pGuerrero("Javier de Moncloa Santos", 150, 100);
        pGuerrero pG3 = new pGuerrero("Bob", 120, 120);

        // Magos
        pMago pm1 = new pMago("Gandalf el Gris", 100, 120);
        pMago pm2 = new pMago("Merlín", 70, 150);
        pMago pm3 = new pMago("Morgana", 80, 130);

        // Arqueros
        pArquero pa1 = new pArquero("Legolas", 90, 30);
        pArquero pa2 = new pArquero("Robin Hood", 100, 20);
        pArquero pa3 = new pArquero("Katniss Everdeen", 110, 25);

        int randValue = (int)(Math.random() * 3 + 1); //Valor de 1 a 3
        switch (randValue){
                case 1: //El personaje es guerrero
                        randValue = (int)(Math.random() * 3 + 1);
                        switch (randValue){
                                case 1: //Guerrero 1
                                        randValue = (int)(Math.random() * 4 + 1); //Valor de 1 a 4
                                        switch (randValue){
                                                case 1: //arma 1
                                                        pG1.equiparArma(aG1);
                                                case 2: //arma 2
                                                        pG1.equiparArma(aG2);
                                                case 3: //arma 3
                                                        pG1.equiparArma(aG3);
                                                case 4: //arma 4
                                                        pG1.equiparArma(aG4);
                                        }
                                        randValue = (int)(Math.random() * 3 + 1); //Valor de 1 a 3
                                        switch (randValue){
                                                case 1: //armadura 1
                                                        pG1.equiparArmadura(cG1);
                                                case 2: //armadura 2
                                                        pG1.equiparArmadura(cG2);
                                                case 3: //armadura 3
                                                        pG1.equiparArmadura(cG3);
                                        }
                                        gremio.setMember(pG1);
                                case 2: //Guerrero 2
                                        randValue = (int)(Math.random() * 4 + 1); //Valor de 1 a 4
                                        switch (randValue){
                                                case 1: //arma 1
                                                        pG2.equiparArma(aG1);
                                                case 2: //arma 2
                                                        pG2.equiparArma(aG2);
                                                case 3: //arma 3
                                                        pG2.equiparArma(aG3);
                                                case 4: //arma 4
                                                        pG2.equiparArma(aG4);
                                        }
                                        randValue = (int)(Math.random() * 3 + 1); //Valor de 1 a 3
                                        switch (randValue){
                                                case 1: //armadura 1
                                                        pG2.equiparArmadura(cG1);
                                                case 2: //armadura 2
                                                        pG2.equiparArmadura(cG2);
                                                case 3: //armadura 3
                                                        pG2.equiparArmadura(cG3);
                                        }
                                        gremio.setMember(pG2);
                                case 3: //Guerrero 3
                                        randValue = (int)(Math.random() * 4 + 1); //Valor de 1 a 4
                                        switch (randValue){
                                                case 1: //arma 1
                                                        pG3.equiparArma(aG1);
                                                case 2: //arma 2
                                                        pG3.equiparArma(aG2);
                                                case 3: //arma 3
                                                        pG3.equiparArma(aG3);
                                                case 4: //arma 4
                                                        pG3.equiparArma(aG4);
                                        }
                                        randValue = (int)(Math.random() * 3 + 1); //Valor de 1 a 3
                                        switch (randValue){
                                                case 1: //armadura 1
                                                        pG3.equiparArmadura(cG1);
                                                case 2: //armadura 2
                                                        pG3.equiparArmadura(cG2);
                                                case 3: //armadura 3
                                                        pG3.equiparArmadura(cG3);
                                        }
                                        gremio.setMember(pG3);
                        }
                        //Repetir con mago y arquero
        }
}