
package rpg;

public class DueloRaposa {
    static int DueloSimon(int hpSimon, int hpRaposa){
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP Simon Riley " + hpSimon);
        System.out.println("HP  Raposa " + hpRaposa);
        System.out.println("=-=-=-=-=-=");

        while (hpSimon > 0 && hpRaposa > 0) {

            switch (PersonaSimon.GhostSimp()) {
                case 1:
                    System.out.println("Voce consegue acertar um golpe com o machado, causando um ferimento grave na Raposa!");
                    hpRaposa -= 400;
                    break;
                       
                default:
                    System.out.println("Você errou e irá tomar um dano da Raposa!!");
                    break;
            }
            if ( hpRaposa > 0) {
                switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Voce toma uma patada da Raposa, -100 de HP!");
                        hpSimon -= 100;
                        break;
                    case 2:
                        System.out.println("A Raposa lhe da uma mordida, resultando na perca de 150 de HP!");
                        hpSimon -= 150;
                        break;
                }
            } else {
                System.out.println("Voce conseguiu!!... Conseguiu derrotar a grande raposa, porem sua jornada ainda não acabou!!");
                System.out.println("Ao derrotar a fera, você sai caminhando durante a noite em direção a estrada, torcendo para não dar de cara com mais nenhum monstro.");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Simon Riley " + hpSimon);
            System.out.println("Hp Raposa " + hpRaposa);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpSimon;
    }

}
    
class AlloyRapo{
     
 static int DueloAlloy(int hpAlloy, int hpRaposa) {
     
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP Alloy Smith " + hpAlloy);
        System.out.println("HP Raposa " + hpRaposa);
        System.out.println("=-=-=-=-=-=");

        while (hpAlloy > 0 && hpRaposa > 0) {

            switch (AlloySimple.AlloySimp()) {
                case 1:
                    System.out.println("Voce consegue acertar um golpe com o machado, causando um ferimento grave na Raposa!");
                    hpRaposa -= 400;
                    break;
                       
                default: 
                    System.out.println("Você errou e irá tomar um dano da Raposa!!");
                    break;
            }
            if ( hpRaposa > 0) {
                switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Voce toma uma patada da Raposa, tirando 100 de hp!");
                        hpAlloy -= 100;
                        break;
                    case 2:
                        System.out.println("A Raposa lhe da uma mordida, resultando na perca de 150 de hp!");
                        hpAlloy -= 150;
                        break;
                }
            } else {
                System.out.println("Voce conseguiu!!... Conseguiu derrotar a grande raposa, porem sua jornada ainda não acabou!!");
                System.out.println("Ao derrotar a fera, você sai caminhando durante a noite em direção a estrada, torcendo para não dar de cara com mais nenhum monstro.");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Alloy Smith " + hpAlloy);
            System.out.println("Hp Raposa " + hpRaposa);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
       
        return hpAlloy;
    }
}
