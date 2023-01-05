
package rpg;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PersonagemFinal {
      

    static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Mutilar: Ghost empunha um facão com 12% de dano corpo a corpo. Ast -120 Dano");
        System.out.println("2 - Precisão em mira: Ghost tem 25% de precisão em seus disparos com armas de fogo. Ast -130 Dano");
        System.out.println("3 - Caçador: Possui um ataque especial com um maior range de disparo. Ast -150 Dano");
        return input.nextInt();
    }
    
    }

class AlloyS {

    public static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Kill Axe: Golpe corpo a corpo causando dano em seu oponente.  Ast -70\n");
        System.out.println("2 - Dead Space: Golpe com rifle de precisão usado para drenar vida de seu inimigo. Ast -150\n");
        System.out.println("3 - Renascer:Drena vida do inimigo e recupera uma parte da sua vida máxima");
        return input.nextInt();
    }
   
}

class Astaroth{
    public static int habilidades(){
        Random gera = new Random();
        return gera.nextInt(2)+1;
    }
}

