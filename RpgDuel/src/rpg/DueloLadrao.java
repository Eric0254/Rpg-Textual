
package rpg;


public class DueloLadrao {
    static int dueloGhostLd(int hpSimon, int hpLadrao) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Simon Riley " + hpSimon);
        System.out.println("HP \n Ladrão " + hpLadrao);
        System.out.println("=-=-=-=-=-=\n");

        while (hpSimon > 0 && hpLadrao > 0) {

            switch (PersonagemSimples.GhostSimples()) {
                case 1:
                    System.out.println("[GHOST]\n Conseguiu acertar com seu machado e deixar o ladrão mutilado sem uma mão \n [LADRÃO]\n "
                            + "FILHO DA PUTA VOCÊ VAI PAGAR QUE DOR MALDITO!!");
                    hpLadrao -= 350;
                    break;
                    
                 case 2:
                    System.out.println("[GHOST]\n Acerta um tiro no tórax do ladrão \n [LADRÃO]\n "
                            + "PRA QUE TANTA VIOLÊNCIA, SÓ QUERIA ROUBAR SEUS SUPRIMENTOS!!");
                    hpLadrao -= 450;
                    break;   
                default:
                    System.out.println("Você errou irá tomar um dano do [LADRÃO] cuidado não irei ter pena de você HAHAHA!!");
                    break;
            }
            if ( hpLadrao > 0) {
                switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("[LADRÃO]\n fez um corte em você com seu canivete.");
                        hpSimon -= 100;
                        break;
                    case 2:
                        System.out.println("[LADRÃO] Finca o seu canivete em sua perna.");
                        hpSimon -= 150;
                        break;
                }
            } else {
                System.out.println("LADRÃO DERROTADO!!!\n"
                        + "BOA SORTE EM SUA JORNADA OBSCURA!!\n"
                        + "SURPRESAS IRÃO TE ESPERAR.\n");
                System.out.println("\n[LADRÃO] - Perdão senhor não queria te ferir eu buscava apenas suprimentos!!!");
            System.out.println("*-- Após o ladrão cair de lado morto  --*");
            System.out.println("[GHOST] - Eu não mandei você querer me roubar agora morra");
            System.out.println("*-- GHOST AINDA PREOCUPADO COM O QUE PODE TER A FRENTE SEGUE EM ALERTA --*");
            System.out.println("*-- Passa um tempo ghost começa a ouvir suspiros e uma voz mais ali pro fundo do local --*");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nSimon Riley " + hpSimon);
            System.out.println("Hp \nLadrão " + hpLadrao);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpSimon;
    }

}

 class AlloyLd{
     
 static int dueloAlloySimples(int hpAlloy, int hpLadrao) {
     
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Alloy Smith " + hpAlloy);
        System.out.println("HP \n Ladrão " + hpLadrao);
        System.out.println("=-=-=-=-=-=\n");

        while (hpAlloy > 0 && hpLadrao > 0) {

            switch (AlloySimples.habilidadesSimples()) {
                case 1:
                    System.out.println("[ALLOY]\n Conseguiu acertar um golpe eficaz com seu machado no \n [LADRÃO]\n "
                            + "AII COMO VOCÊ PODE FAZER ISSO!!");
                    hpLadrao -= 350;
                    break;
                case 2:
                    System.out.println("[ALLOY]\n Causa um dano e consegue abrir um buraco no peito do \n [LADRÃO]\n"
                            + "Eu só queria seu suprimento!!");
                     hpLadrao -= 450;
                    break;
                

                default:
                    System.out.println("Você errou irá tomar um dano do [ASTAROTH] da próxima vez preste atenção!!");
                    break;
            }
            if ( hpLadrao > 0) {
                switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("[LADRÃO]\n fez um corte em você com seu canivete.");
                        hpAlloy -= 100;
                        break;
                    case 2:
                        System.out.println("[LADRÃO] Finca o seu canivete em sua perna.\n"
                                + "[ALLOY] - Cara você irá pagar pelo rasgo que fez na minha perna");
                        hpAlloy -= 150;
                        break;
                }
            } else {
                System.out.println("LADRÃO DERROTADO!!!\n"
                        + "BOA SORTE EM SUA JORNADA OBSCURA!!\n"
                        + "SURPRESAS IRÃO TE ESPERAR.\n");
                System.out.println("\n[LADRÃO] - Perdão senhora não queria te ferir eu buscava apenas suprimentos!!!");
            System.out.println("*-- Após o ladrão cair de lado morto  --*");
            System.out.println("[ALLOY] - Eu não mandei você querer me roubar agora morra");
            System.out.println("*-- ALLOY AINDA PREOCUPADO COM O QUE PODE TER A FRENTE SEGUE EM ALERTA --*");
            System.out.println("*-- Passa um tempo ghost começa a ouvir suspiros e uma voz mais ali pro fundo do local --*");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nAlloy Smith " + hpAlloy);
            System.out.println("Hp \nLadrão " + hpLadrao);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
       
        return hpAlloy;
    }
}
