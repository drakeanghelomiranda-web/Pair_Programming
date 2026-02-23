void main(){

    // Armas //
        eArma aG1 = new eArma("Espada", 25, tipoDaño.FISICO);
        eArma aG2 = new eArma("Maza", 17, tipoDaño.FUEGO);
        eArma aG3 = new eArma("Lanza", 13, tipoDaño.VENENO);
        eArma aG4 = new eArma("Hacha", 20, tipoDaño.HIELO);

        eArma aM1 = new eArma("Pocion de daño", 30, tipoDaño.FISICO);
        eArma aM2 = new eArma("Bola de fuego", 20, tipoDaño.FUEGO);
        eArma aM3 = new eArma("Humo venenoso", 15, tipoDaño.VENENO);
        eArma aM4 = new eArma("Varita helada", 24, tipoDaño.HIELO);

        eArma aA1 = new eArma("Arco", 20, tipoDaño.FISICO);
        eArma aA2 = new eArma("Pistola", 15, tipoDaño.FUEGO);
        eArma aA3 = new eArma("Cerbatana", 11, tipoDaño.VENENO);
        eArma aA4 = new eArma("Lanzabolas de nieve", 17, tipoDaño.HIELO);
    // Armadura //
        eArmadura eAD1 = new eArmadura("Armadura de Cuero", 10);
        eArmadura eAD2 = new eArmadura("Armadura de Cobre", 20);
        eArmadura eAD3 = new eArmadura("Armadura de Hierro", 35);
        eArmadura eAD4 = new eArmadura("Armadura de Oro", 25);
        eArmadura eAD5 = new eArmadura("Armadura de Diamante", 50);
    // GUERRERO
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
}