
package rpg;

/**
 *
 * @author Eric
 */
public class DueloMacaco {
    static int dueloGhostFinal(int hpSimon, int hpMacaco) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Simon Riley " + hpSimon);
        System.out.println("HP \n Astaroth " + hpMacaco);
        System.out.println("=-=-=-=-=-=\n");

        while (hpSimon > 0 && hpMacaco > 0) {

            switch (PersonagemFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("[GHOST]\n conseguiu acertar uma facada no \n [ASTAROTH]\n "
                            + "PAARA ISSO ME CAUSA CÓCEGAS!!");
                    hpMacaco -= 120;
                    break;
                case 2:
                    System.out.println("[GHOST]\n Acerta um tiro muito eficaz contra \n [ASTAROTH]\n"
                            + "AI QUE DOR SEU VERME VOCÊ IRÁ PAGAR CARO POR ISSO!!");
                     hpMacaco -= 130;
                    break;
                case 3:
                    System.out.println("[GHOST]\n Usou a sua habilidade especial e derruba o grande \n [ASTAROTH]\n"
                            + "APÓS ANOS SEM UM VERME HUMANO VIR INTERVIR EM MINHA SUB DESUMANIZAÇÃO VOCÊ VEM COM ESSE LIXO DE ARMA!!");
                     hpMacaco -= 150;
                    break;
                default:
                    System.out.println("Você errou irá tomar um dano do [ASTAROTH] da próxima vez preste atenção!!");
                    break;
            }
            if ( hpMacaco > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpSimon -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH]\n utilizou o PENTAGRAMA INFERNAL");
                        System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpSimon -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nSimon Riley " + hpSimon);
            System.out.println("Hp \nAstaroth " + hpMacaco);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpSimon > 0 && hpMacaco < 0) {
            System.out.println("\n[ASTAROTH] - NÃO COMO VOCÊ OUSA DERROTAR O GRÃ - DUQUE - INFERNAL, SOU O SER MAIS PODEROSO QUE JÁ PISOU NA TERRA!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Ghost levanta e ri da cara do grande ASTAROTH --*");
            System.out.println("\n [GHOST] - Simples um ser tolo que acha que porquê ficou anos sem um oponente digno achou mesmo que um ser além deu sua capacidade não poderia te derrotar HAHAHAHA ");
            System.out.println("*-- GHOST SAI RINDO DO LOCAL MAS NÃO CONTA NO QUE PODE ESPERAR ELE LOGO MAIS A FRENTE --*");
            System.out.println("*-- Passa um tempo GHOST retorna ao mercado onde tudo começou com uma grande tontura sem saber o que realmente aconteceu --*");
            System.out.println("\n [ASTAROTH] - Enquanto houver um último suspiro o ser acima de mim vai surgir!!");
        } else if (hpSimon < 0 && hpMacaco > 0) {
            System.out.println("\n [ASTAROTH] - VERME ACHOU MESMO QUE ERA CAPAZ DE ME DERROTAR!!");
        }

        return hpSimon;
    }

}

 class Alloy{
     
 static int dueloAlloyFinal(int hpAlloy, int hpMacaco) {
     
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Alloy Smith " + hpAlloy);
        System.out.println("HP \n Astaroth " + hpMacaco);
        System.out.println("=-=-=-=-=-=\n");

        while (hpAlloy > 0 && hpMacaco > 0) {

            switch (AlloyS.habilidadesFinal()) {
                case 1:
                    System.out.println("[ALLOY]\n Conseguiu acertar um golpe eficaz com seu machado no \n [ASTAROTH]\n "
                            + "PAARA ISSO ME CAUSA CÓCEGAS!!");
                    hpMacaco -= 120;
                    break;
                case 2:
                    System.out.println("[ALLOY]\n Causa um dano e consegue abrir um buraco no peito do \n [ASTAROTH]\n"
                            + "AI QUE DOR SEU VERME VOCÊ IRÁ PAGAR CARO POR ISSO!!");
                     hpMacaco -= 130;
                    break;
                case 3:
                    
                        System.out.println("[Alloy]\n Usou a sua habilidade especial e consegue recuperar sua vida e causar um grande dano a \n [ASTAROTH]\n"
                                + "APÓS ANOS SEM UM VERME HUMANO VIR INTERVIR EM MINHA SUB DESUMANIZAÇÃO VOCÊ VEM COM ESSE LIXO DE ARMA!!");
                        hpMacaco -= 100;
                        hpAlloy += 50;
                        
                    
                    break;

                default:
                    System.out.println("Você errou irá tomar um dano do [ASTAROTH] da próxima vez preste atenção!!");
                    break;
            }
            if ( hpMacaco > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpAlloy -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH]\n utilizou o PENTAGRAMA INFERNAL");
                        System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpAlloy -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nAlloy Smith " + hpAlloy);
            System.out.println("Hp \nAstaroth " + hpMacaco);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpAlloy > 0 && hpMacaco < 0) {
            System.out.println("\n[ASTAROTH] - NÃO COMO VOCÊ OUSA DERROTAR O GRÃ - DUQUE - INFERNAL, SOU O SER MAIS PODEROSO QUE JÁ PISOU NA TERRA!!!");
            System.out.println("*-- Após derrotar ASTAROTH, ghost levanta e ri da cara do grande ASTAROTH --*");
            System.out.println("\n [ALLOY] - Simples um ser tolo que acha que porquê ficou anos sem um oponente digno achou mesmo que um ser além deu sua capacidade não poderia te derrotar HAHAHAHA ");
            System.out.println("*-- ALLOY SAI RINDO DO LOCAL MAS NÃO CONTA NO QUE PODE ESPERAR ELE LOGO MAIS A FRENTE --*");
            System.out.println("*-- Passa um tempo ALLOY retorna ao mercado onde tudo começou com uma grande tontura sem saber o que realmente aconteceu --*");
            System.out.println("\n [ASTAROTH] - Enquanto houver um último suspiro o ser acima de mim vai surgir!!");
        } else if (hpAlloy < 0 && hpMacaco > 0) {
            System.out.println("\n [ASTAROTH] - VERME ACHOU MESMO QUE ERA CAPAZ DE ME DERROTAR!!");
        }

        return hpAlloy;
    }
 
 }
