void main(){

    // Armas //
        eArma eA1 = new eArma("Espada", 25, tipoDaño.FISICO);
        eArma eA2 = new eArma("Arco de Fuego", 15 , tipoDaño.FUEGO);
        eArma eA3 = new eArma("Varita de hielo", 10, tipoDaño.HIELO);
        eArma eA4 = new eArma("Pocion Arrojadiza Veneno III", 5, tipoDaño.VENENO);
    // Armadura //
        eArmadura eAD1 = new eArmadura("Armadura de Cuero", 10);
        eArmadura eAD2 = new eArmadura("Armadura de Cobre", 20);
        eArmadura eAD3 = new eArmadura("Armadura de Hierro", 35);
        eArmadura eAD4 = new eArmadura("Armadura de Oro", 25);
        eArmadura eAD5 = new eArmadura("Armadura de Diamante", 50);
    // GUERRERO
        pGuerrero pG1 = new pGuerrero("Guillem Alfonso XVII", 100, 100);
        pGuerrero pG2 = new pGuerrero("Javier de Moncola Santos", 150, 100);
        pGuerrero pG3 = new pGuerrero("Alfonso TomaCulo XVI", 100, 100);

    // Magos
        pMago pm1 = new pMago("Gandalf el Gris", 100, 120);
        pMago pm2 = new pMago("Merlín", 100, 150);
        pMago pm3 = new pMago("Morgana", 100, 130);

    // Arqueros
        pArquero pa1 = new pArquero("Legolas", 100, 110);
        pArquero pa2 = new pArquero("Robin Hood", 100, 100);
        pArquero pa3 = new pArquero("Katniss Everdeen", 100, 105);
}