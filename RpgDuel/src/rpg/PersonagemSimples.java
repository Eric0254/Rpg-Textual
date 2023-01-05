
package rpg;

import java.util.Random;
import java.util.Scanner;


public class PersonagemSimples {
    static int GhostSimples() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Mutilar: Ghost empunha seu machado para golpear corpo a corpo. Lad -350 Dano\n");
        System.out.println("2 - Dead Space: Usa sua arma de fogo para drenar vida de seu inimigo. Lad -450 Dano\n");
        return input.nextInt();
    }
    
    }

class AlloySimples {

    public static int habilidadesSimples() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Mutilar: Alloy empunha seu machado para golpear corpo a corpo. Lad -350 Dano\n");
        System.out.println("2 - Dead Space: Usa sua arma de fogo para drenar vida de seu inimigo. Lad -450 Dano\n");
        return input.nextInt();
    }
   
}

class Ladrao{
    public static int habilidades(){
        Random gera = new Random();
        return gera.nextInt(2)+1;
    }
}
class PersonaSimon{
    public static int GhostSimp() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADE ~~");
        System.out.println("1 - Mutilar: Ghost empunha seu machado para golpear corpo a corpo. 350 de Dano\n");
        return input.nextInt();
    }
}
    class AlloySimple{
    public static int AlloySimp() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADE ~~");
        System.out.println("1 - Mutilar: Alloy empunha seu machado para golpear corpo a corpo. 350 de Dano\n");
        return input.nextInt();
    }
    
    }