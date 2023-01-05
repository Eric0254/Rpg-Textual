/**
 *
 * @author Eric
 */
package rpg;

import java.util.Scanner;
public class Menu {
    int Garrafa = 0, KitM = 5, erro = 0;; 
    int escolha_menu;
    String personagem;
    String name = null;
    Scanner sc = new Scanner(System.in);
    
    
    //=========================================================== parte inicial ======================================================================
    public void main(){
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=  𝐒𝐄𝐉𝐀 𝐁𝐄𝐌 𝐕𝐈𝐍𝐃𝐎  =-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=       𝐀𝐎         =-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=  𝐋𝐎𝐒𝐓 𝐈𝐍 𝐖𝐎𝐑𝐋𝐃  =-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
		do {
			System.out.println("\nVocê está pronto para conhecer o incrível mundo de Lost in World?");
                        System.out.println("===================================================================");
			System.out.println("\n[1] - Sim  \n[2] - Com certeza!  \n[3] - Não estou preparado...\n");
                        System.out.println("===================================================================");
			escolha_menu = sc.nextInt();

			if (escolha_menu == 1 || escolha_menu == 2) {
				System.out.print("\n Perfeito, fique sabendo que é um caminho sem volta!");
				menu();
			} else if (escolha_menu == 3) {
				System.out.print("\n Não se engane, você não tem muita escolha... Abrace o destino!");
				menu();
			} else {
				System.out.print("Escolha uma opção valída!");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3);
    
    
    }
    //============================================================== menu ==============================================================================
    public void menu(){
    Scanner entrada = new Scanner(System.in);

		
		do {
			System.out.println("\n\n..:: 𝗟𝗢𝗦𝗧 𝗜𝗡 𝗪𝗢𝗥𝗟𝗗 ::.. \n\n1 - Jogar \n2 - Instruções\n3 - Créditos \n4 - Sair"
					);
			System.out.println();

			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				instrucoes();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.out.println("Você saiu do jogo!");
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
    }
    
    //============================================================== Instrucoes ===========================================================================
    public void instrucoes(){
    System.out.println("\n Lost in World se trata de um RPG Textual, uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atráves de uma pergunta respondida e/ou ação realizada.\r\n\n A cada pergunta respondida o jogo dará opções de caminhos para explorar.\r\n\n Ou seja, Mantenha total atenção na hora de responder.\r\n"
				+ "  ");
    System.out.println("Em alguns momentos, pressione enter para dar continuidade aos textos");
		System.out.println("\n Alguns desafios requerem que o usuário insira determinada frase, ou escolha entre caminho 1 ou 2."
				+ "\n Boa sorte!"
				+ "  ");
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = sc.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 2);
    }
    
   //================================================================ ESCOLHA PERSONAGEM =========================================================================== 
    public void jogo(){
         Scanner sc = new Scanner(System.in);
   do {
            System.out.println("**--Escolha o seu personagem--**");
            System.out.println("[1] Simon Riley");
            System.out.println("[2] Alloy Smith");
            personagem = sc.next();
            switch (personagem) {
                case "1":
                case "Simon Riley":
                case "simon riley":
                case "SIMON RILEY":
                    Personagens.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha_menu = sc.nextInt();
                    if (escolha_menu == 1) {
                        name = "Simon Riley";
                        break;
                    } else if (escolha_menu == 2) {
                        jogo();
                        break;
                    }
                    break;
                    case "2":
                case "Alloy Smith":
                case "alloy smith   ":
                case "ALLOY SMIYH":
                    Personagens.apresentacao2();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha_menu = sc.nextInt();
                    if (escolha_menu == 1) {
                        name = "Alloy Smith";
                        break;
                    } else if (escolha_menu == 2) {
                        jogo();
                        break;
                    }
                    break;
                    
                    
   }
   }while(escolha_menu != 1 && escolha_menu != 2);
   
  //==================================================================== CAPITULO  1 ========================================================================
  sc.nextLine();
            System.out.println("=====================================================================================================================================");
            System.out.println(" É uma bela manhã, o sol radiante por entre as nuvens, a brisa do vento bate em seus cabelos, \n"
                     + " você aprecia o silêncio do início do dia, um cenário perfeito, os únicos problemas são que, \n"
                     + " o sol atinge apena algumas partes da superfície pois nuvens radioativas se formaram por toda atmosfera, \n"
                     + " o vento carrega poeira e sujeira para todo canto, e claro, o silêncio é devido ao fato de você ser o provável único ser humano vivo da região.");
            System.out.println("=====================================================================================================================================");
           sc.nextLine();     System.out.println(name + " se encontra naquilo que um dia já foi um supermercado, em busca de recursos para sobreviver e torcendo para não dar de frente \n"
                        + " com nenhuma daquelas coisas, você verifica as estantes da parte central e não encontra nada, então diz em voz alta para si mesmo: \n");
        
    sc.nextLine();
          System.out.println(name+"- É, a sorte não tem andado muito ao meu lado, mas não tem muito o que eu fazer por aqui então vamos em frente. \n");
          System.out.println("Você se depara com duas portas, uma dando acesso a um corredor a direita e outro a esquerda, para onde quer ir? \n"
                  + "1 - Esquerda \n"
                  + "2 - Direita");  
          do{
          escolha_menu = sc.nextInt();

          if(escolha_menu == 1){
              System.out.println("Você decide ir para a esquerda, dando de cara com um corredor totalmente vazio, siga em frente.");
              System.out.println("\n=====================================================================================================================================");
          }   
          else if(escolha_menu == 2){
              System.out.println("Você decide ir para a direita, dando de cara com um corredor completamente vazio, opa! Parece que tem algo ali! \n"
                      + "Encontrou uma Garrafa d’agua");
                           Garrafa = 1;
              System.out.println("\n=====================================================================================================================================");

                           System.out.println("\n Voce coletou uma garrafa d’agua e guardou em sua mochila!!! \n");
                           System.out.println("[" + name + "]" + " -Isso vai ser muito útil futuramente!");
          }else{
              System.out.println("Escolha incorreta! Digite novamente!");
              System.out.println("\n=====================================================================================================================================");
          }

            }while(escolha_menu != 1 && escolha_menu != 2);
       sc.nextLine();

            System.out.println("\n O corredor dá nos fundos do mercado, que está completamente vazio para variar, porém tem uma porta que nos possibilita sair. \n");
            System.out.println(name + " abre a porta e caminha para a região de fora, ele(a) segue caminhando pela estrada, sempre seguindo pelos cantos e tentando chamar \n"
                    + " o menos de atenção possível, imagina dar de cara com uma daquelas aberrações. \n");
      sc.nextLine();
            System.out.println("\n Após um tempo andando," + name + " chega em um vilarejo aparentemente abandonado, porém ele(a) percebe que algumas pessoas estavam ali \n "
                    + "há algumas horas atras, pois um saco de dormir estava aberto no chão, e uma fogueira fora recém apagada, o que é um ótimo sinal, recursos podem \n"
                    + " ter sido deixados para trás. [" +name+ "]" + " avista uma casa e decide ir checar o local \n");
           sc.nextLine();
            
                    Caixa();
                    System.out.println("\n=====================================================================================================================================");
                   
            sc.nextLine();

         

            System.out.println("Ao chegar no que parece ser o pátio daquele vilarejo, você se sente observado, é então que duas pessoas saem de trás de alguns \n"
                    + " arbustos e começam a apontar armas para você. \n");
            System.out.println("Estranho – Procurando algo? Acho bom não se mexer – diz o homem encapuzado. \n");
            System.out.println("[" + name + "]" + " – Calma calma, não precisamos de violência, eu só estou aqui de passagem, não quero problema. \n");
sc.nextLine();
            
             System.out.println("Estranha – Eu vi você vasculhando as coisas por aqui, acha que pode sair mexendo nas coisas dos outros? Esse lugar um dia já nos pertenceu. \n");
             System.out.println("Você tem duas opções nessa situação:");
             System.out.println("1 – Oferecer garrafa d’agua a eles (Caso possua) \n"
                              + "2 – Conversar com eles para sair dessa situação.");
             do{
             escolha_menu = sc.nextInt();

             switch(escolha_menu){

                 case 1:
                     if(Garrafa == 0){
                         System.out.println("Você não possui este item. \n");
                         System.out.println("\n=====================================================================================================================================");
                     }
                     else{
                         System.out.println("[" +name+ "]" + " – Olha, eu posso oferecer uma garrafa com um pouco de água para vocês, em troca daquilo que peguei, e cada um de nós segue seu caminho. \n");
                         System.out.println("Estranho – Hm, parece uma troca justa, o que acha? \n");
                         System.out.println("Estranha – Parece bom para mim, dá isso aqui logo. \n");
                         System.out.println("Você entrega a garrafa.");
                         Garrafa = 0;
                         System.out.println("\n=====================================================================================================================================");
                         
                     } break;
                 case 2:
                     System.out.println("[" +name+ "]" + " – Com todas as ameaças que têm afora, vocês querem mesmo ameaçar a própria espécie? Vocês me matam, eaí? \n"
                             + " O que muda? Acredito que possui uma maneira de nos ajudarmos. \n");
                     System.out.println("Estranho – Acha que esse discursinho vai colar? Não temos nada a perder! E como alguém como você pode nos ajudar? \n"
                             + " Nada nem ninguém pode nos ajudar, fomos deixados aqui para morrer, Deus nos deixou!!! \n");
                     System.out.println("\n=====================================================================================================================================");
                     break;
             }

            }while(escolha_menu != 1 && escolha_menu != 2);
             sc.nextLine();

   System.out.println("Mesmo após isso eles continuam insistindo, você pode decidir se pronunciar ou só ficar em silêncio");
   sc.nextLine();
            
                System.out.println("1 – Eu devolvo o que peguei de vocês então, estou numa situação em que não posso fazer muita coisa \n"
                                 + "2 – Permanecer em silêncio");
                do{
                escolha_menu = sc.nextInt();

                switch(escolha_menu){

                    case 1:
                        System.out.println("Estranha – Isso aí, entrega logo o que é nosso. \n");
                        System.out.println("\n=====================================================================================================================================");
                        break;

                    case 2:
                        System.out.println("Estranho – O QUE VOCÊ VAI FAZER? VAI LOGO, EU VOU TE MATAR \n");
                        System.out.println("\n=====================================================================================================================================");
                        break;
                }

            }while(escolha_menu != 1 && escolha_menu != 2);
                sc.nextLine();

            System.out.println("Eis então que você escuta um barulho, e tem total noção do que se trata, um deles está por perto. \n");
            System.out.println("[" +name+ "]"+  " -Vocês ouviram isso? \n");
            System.out.println("Estranho – Ouvimos o que? Quem você está querendo enganar? Não tem porra nenhuma aqui. \n");
            System.out.println("Quando de repente um tigre mutante de aproximadamente 2,5m pula em direção a mulher e a mata com uma mordida só. \n");
            System.out.println("Estranho – MEU AMOR, MEU AMOR!!!! \n");
            sc.nextLine();

            
                System.out.println("O estranho começa a atirar na criatura, que não sente nada e começa a caminhar lentamente em direção ao homem, de olho em sua presa. \n");
                System.out.println("Você tem duas opções \n");
                System.out.println("1 – Tentar ajudar o homem. \n"
                                 + "2 – CORRER. \n");
                do{
                escolha_menu = sc.nextInt();

                if(escolha_menu == 1){
                    System.out.println("Você sabe que isso não é possível e corre, enquanto houve os disparos e gritos.");
                    System.out.println("\n=====================================================================================================================================");
                }if(escolha_menu==2){
                    System.out.println("Você corre, enquanto houve os disparos e gritos.");
                    System.out.println("\n=====================================================================================================================================");
                }

            }while(escolha_menu != 1 && escolha_menu != 2);
            if (Garrafa==1){ 
                System.out.println("A garrafa cai de seu bolso enquanto você corre");
            }  sc.nextLine();
  //=============================================================== DUELO RAPOSA ===========================================================================
       System.out.println("\n=====================================================================================================================================");
       System.out.println("É então que durante a noite, você acorda com um barulho do lado de fora da caverna, vai aumentando e chegando cada vez mais próximo. Você se prepara para o pior. n/");
              sc.nextLine();
           
                System.out.println("Eis que surge uma raposa mutante, quase inteiramente nu, o que restou de seus pelos está espalhado por seu corpo. Ela te encara, com os dentes a mostra, pronta para atacar. ");
                System.out.println("1 – Correr");
                System.out.println("2 – Lutar");
                do{
                escolha_menu = sc.nextInt();
            }while(escolha_menu != 1 && escolha_menu != 2);
       if(escolha_menu == 1){
       System.out.println("Voce achou mesmo que poderia correr de mim !!");
       System.out.println("Tome uma mordida, -30 de vida nessa batalha");
       switch (name) {
        case "Simon Riley":
         DueloRaposa.DueloSimon(1220, 800);
        break;
        case "Alloy Smith":
         AlloyRapo.DueloAlloy(1170, 800);
        break;
        }
       }  if(escolha_menu == 2){
        switch (name) {
        case "Simon Riley":
         DueloRaposa.DueloSimon(1250, 800);
        break;
        case "Alloy Smith":
         AlloyRapo.DueloAlloy(1200, 800);
        break;
        }
       }
   //=============================================================== CAPITULO 2 ===========================================================================
       sc.nextLine();
       System.out.println("\n=====================================================================================================================================");
        System.out.println("Você procura algum abrigo enquanto caminha sob a luz do luar,\n"
                + " é então que encontra um posto de gasolina abandonado, e decide entrar no comércio para ver se encontra algum recurso. \n"
                + "Nada é encontrado, porém você ouve um barulho de passos vindo dos fundos, \n"
                + " fica receoso, mas decide ir lá checar, com suas armas em mão você se aproxima e dá de cara com uma garota, \n"
                + " que se assusta ao te ver e grita:");
        sc.nextLine();
        System.out.println("[ESTRANHA] – QUEM É VOCÊ? CALMA! ABAIXE ESSAS ARMAS EU IMPLORO!");
        System.out.println("["+ name +"]" + " – CALMA! Eu pensei que fosse uma daquelas coisas, eu não vou fazer nada com você,\n"
                + " só estou de passagem, vamos voltar para dentro, não quero correr o risco de ser visto.");
        System.out.println();sc.nextLine();
        System.out.println("Vocês voltam para dentro da loja e decidem esperar o amanhecer, durante conversas você descobre que ela se chama Ashe,\n"
                + " e que está procurando o seu grupo, segundo ela todos foram para um lugar que é conhecido como “Paraíso”,\n"
                + " uma estrutura protegida pelo que restou do governo, onde as pessoas podem viver sem a ameaça dos monstros.\n"
                + " Você decide se juntar a ela, afinal, o que tem a perder? Vocês descansam.\n" +
"No outro dia...");sc.nextLine();
         System.out.println("[ASHE] – Você anda sozinho por aí?");
         System.out.println("["+ name + "]" + "– Sim, eu já tive pessoas, mas todas elas se foram, sabe como é, um mundo perigoso.");
         System.out.println("[ASHE] – Eu lamento por isso.");
         System.out.println("["+ name +"]" + "– Obrigado, mas está tudo bem, é passado.");
         System.out.println();
         System.out.println("Antes de sair da loja vocês avistam uma porta que está escondida por uma prateleira.");
         System.out.println("["+ name +"]" + "– Ei, me ajuda aqui.");
     sc.nextLine();
                     Prateleira();

             System.out.println("[ASHE] - Temos que achar uma maneira de abrir este cadeado,\n"
                 + " veja que dois espaços da senha já estão preenchidos, só precisamos descobrir os dois últimos número.\n"
                 + " Pelo que vejo os números vão até 20.");
             do{
             escolha_menu = sc.nextInt();
             
             if(escolha_menu == 13){   
             }
             
             if(escolha_menu !=  13){
                 erro++;
             if (erro==1){
                 System.out.println("Vamos, não desista, você consegue!!!");
                 
             } if (erro==2){
                 System.out.println("Eu acredito em você");}
             if (erro==3){
                 System.out.println("Eu tô quase tentando por você");
             }
             if (erro ==4){
                 System.out.println("["+ name +"]"+ " – Quer saber, eu me cansei dessa merda");
                 System.out.println();
                 System.out.println("Você acerta o cadeado com o machado, o quebrando e assim liberando a porta.");
                 System.out.println("["+ name +"]" +"– Viu, é assim que se faz.");
                 escolha_menu = 13;
                      
                 
             }
             
         }}while(escolha_menu != 13);
         
         System.out.println();
         System.out.println("Vocês se deparam com uma sala cheia de coisas inúteis,\n"
                 + " e comida, o que deixa Ashe muito feliz,\n"
                 + " mas o que te chama atenção é um rifle que se encontra em cima da mesa,\n"
                 + " e munição, muita munição!");
         
         System.out.println("[" + name +"]" +"– Agora estamos prontos para sair daqui, vamos.");
           sc.nextLine();
         System.out.println("Vocês seguem caminho adiante, eis que Ashe sugere um caminho a ser seguido");
         System.out.println("[ASHE] - Eu conheço um lugar que podemos nos abrigar, ele está abandonado há muito tempo, podemos ficar uns dias por lá");
         sc.nextLine();
          System.out.println("Você fica com o pé atrás em relação a ideia, mas decide aceitar");
           System.out.println("["+name+"] "+ "Bem, vamos lá, me mostre o caminho");
           System.out.println("Vocês decidem ir até o local");
           sc.nextLine();
         System.out.println("["+name+"] "+ "O QUE É AQUILO GIGANTE ALI?");
         System.out.println("[ASHE] - É o nosso abrigo ué, uma antiga usina da região, e relaxa\n"
                 + "a radiação de lá já se foi há muito tempo");
         System.out.println("[ASHE] - Para chegarmos lá temos que passar por um tunel subterrâneo\n"
                 + "me acompanhe");
         sc.nextLine();
         System.out.println("No corredor...");
         System.out.println("["+name+"] "+ "Esse lugar tem um cheiro horrível/\n"
                 + "vamos sair logo daqui");
         System.out.println("Eis que vocês escutam um barulho vindo do caminho de onde vieram\n"
                 + "algo parecido com patas em movimento, de forma muito rápida");
         sc.nextLine();
         System.out.println("["+name+"] "+ "Tem algo vindo aí, vamos nos esconder");
         System.out.println("Você se esconde de um lado, e Ashe de outro");
         System.out.println("O barulho vai aumentando, e finalmente vocês veem o que é\n"
                 + "uma manada de lobos mutantes, passando numa velocidade absurda\n"
                 + "quando eles estão quase indo embora, Ashe se movimenta e acaba fazendo barulho, sendo detectada por um deles\n"
                 + "Não resta opção para ela a não ser correr, e você sabe que não pode ajudar, se não só vai atrair mais deles\n"
                 + "Você a observa fugir, e após algum tempo não escuta mais nada, somente desejando que ela esteja bem");
          sc.nextLine();
           System.out.println("Após esperar por algumas horas você sai do tunel, e da de cara com a entrada da usina");
          //======================================================================   Treta Ladrão e falas =========================================================    
         sc.nextLine();
         System.out.println("\n=====================================================================================================================================");
        
        System.out.println(name +" decide entrar naquilo que um dia foi uma usina, é então que avista uma sombra correndo \n"
                + "pelas paredes, e se prepara. Um homem aparece em sua frente, com armas em mãos e diz para você:");
        System.out.println("\n[LADRÃO] – Vamos ver o que você tem para mim.");
          sc.nextLine();
          
        System.out.println("\n[" + name + "] - Meu deus tenho duas escolhas: \n"
                + "\n1 - Ficar e lutar para não perder seu loot \n"
                + "\n2 - Tentar fugir");
        do{
        escolha_menu = sc.nextInt();
        }while(escolha_menu != 1 && escolha_menu != 2);
        
        System.out.println("\n=====================================================================================================================================");     
   //============================================================== DUELO LADRÃO ===========================================================================         
             if(escolha_menu == 1){      
     switch (name) {
        case "Simon Riley":
         DueloLadrao.dueloGhostLd(1250, 800);
        break;
        case "Alloy Smith":
         AlloyLd.dueloAlloySimples(1200, 800);
        break;
        }
      }  
        if(escolha_menu == 2){
            
         System.out.println("[" + name + "] Droga não tem uma saída, vou ter que encarar ele");  
        
        
     switch (name) {
        case "Simon Riley":
         DueloLadrao.dueloGhostLd(1250, 800);
        break;
        case "Alloy Smith":
         AlloyLd.dueloAlloySimples(1200, 800);
        break;
        }
        } 
            
          System.out.println("Após derrotar o ladrão,"+ name + "parte adiante, tentando sair daquele lugar que mais parece um\n"
            + "labirinto. Indo mais afundo você consegue avistar uma saída e se alegra, vai correndo em sua\n"
            + "direção, mas é aí que uma figura monstruosa cai na sua frente, um Macaco Mutante que \n"
            + "estava pendurado entre os cabos do lugar.");
    System.out.println("=-=-=-=-=-=-=-==-=-=-==-=-=-=-==-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); sc.nextLine();
    
    System.out.println("[ASTAROTH] - Olha só quem temos por aqui na minha propiedade!!!\n");
    
    System.out.println("["  + name + "] Como assim você fala!!\n"
            + "Você é um macaco enorme\n");
    sc.nextLine();
    
    System.out.println("["  + name + "] preocupado tenta raciocinar uma forme de fugir desse lugar\n");
    
    System.out.println("[ASTAROTH] - Fique calmo hoje você será meu banquete");
    
    System.out.println("["  + name + "] Nunca nem que eu morra aqui eu vou batalhar e te mandar de volta\n"
            + "de onde você veio seu ser bizarro"); sc.nextLine();
    
    System.out.println("[ASTAROTH] - Vamos ver um ser tão pequeno com tanta astucia assim");
    System.out.println("A figura bizarra sai da escuridão e mostra sua real face\n");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣄⣀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⣰⡼⣯⣤⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢔⢕⢕⡪⡳⡻⣷⢧⡀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⢸⡼⣯⣟⡷⣯⣷⢿⢯⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⢲⢻⢸⡸⡪⡇⣏⢎⡇⡯⣻⣻⡄⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡯⣠⣯⣟⡷⣯⢿⡽⣾⢻⡸⣟⣶⢦⣀⣀⣀⡀⠀⠀⢀⣀⢠⣕⣇⢝⡼⢪⢣⢫⢪⢺⢸⡪⡎⡽⣃⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⡻⣽⡺⣳⡿⣝⢯⡿⣽⡪⣣⣿⣫⣿⢽⣻⡽⣿⢷⣶⣻⢿⣽⣻⣩⣮⣪⡪⣑⢏⢇⢗⡕⣇⢏⢮⠏⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡾⣿⣻⣯⢿⡿⣶⣞⣪⡳⡝⣜⣦⢿⣻⣞⣿⣞⣿⣺⢿⣽⣻⡽⣟⣾⡽⣟⣾⡽⣾⣟⣿⢿⣦⢣⢧⢳⢱⡱⣝⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⣿⢯⣟⣯⣷⣻⣟⣿⢽⣾⢕⠯⡟⣝⢜⢞⣿⣺⢷⣟⡾⣯⢿⡾⣷⣻⣯⣷⣿⢿⣷⢿⣯⣿⣻⣯⣟⣷⡵⣕⣣⡿⠋⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣖⣿⣺⢿⡽⣞⣷⣻⡾⣽⣻⢾⢇⠫⠧⣷⣏⢽⣷⣟⣯⡷⣟⣯⢿⣻⣿⣻⣽⣷⡿⣟⣿⣻⢷⣻⣯⣷⢿⣳⡟⠋⠉⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢶⣯⢷⣟⡾⣯⣟⣯⢿⣽⣾⣻⡽⣯⣟⣿⡛⣿⣿⡹⣽⢾⣳⣯⢿⡽⣯⢿⣽⣯⢿⣳⣯⠟⠋⠁⠉⠉⠉⠓⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⣠⢤⡼⣽⣟⡾⣯⢿⣽⣟⣾⣟⣿⣽⢾⣳⡿⣽⢾⣳⢯⢛⢫⡯⣟⣯⡿⣞⣿⣽⣻⣽⣾⢿⡯⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⢀⡴⣯⡟⣕⢵⡱⣝⣜⢽⢻⣾⢿⣽⢿⣷⣻⣿⣯⢿⣽⢯⣟⣿⣻⣽⣻⡽⣷⣻⣟⣾⣳⣿⣻⣾⣟⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⣽⢿⡿⡜⡼⡸⡸⡱⡓⣽⣼⣯⠟⠋⠀⠀⣿⣞⡿⣿⡾⣿⣻⣾⢿⣾⣟⣿⣟⣷⡿⣯⣿⣽⣿⡽⣞⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⣿⣟⢯⢪⣪⡣⡏⡞⣪⡷⠊⠀⠀⠀⠀⠀⠓⣯⡿⣽⣟⣿⡽⣾⣻⡽⣯⢿⣽⣻⣟⣿⣽⢷⣯⢿⣽⡁⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⢳⢏⢞⢜⣆⢏⢞⡚⠾⠀⠀⠀⠀⠀⠀⠀⠀⠘⣽⢷⣻⣞⣿⡽⣷⣻⣯⣟⣷⢯⣷⣻⣞⡿⣞⣯⣷⣿⣽⢶⣖⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠘⠵⠹⡜⡜⡝⡕⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡯⣿⣞⣷⣻⡽⣷⣻⡾⣽⣟⣾⡽⣾⣻⡽⣷⠇⠈⠊⠛⢯⣷⣟⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡽⣷⣻⡾⣽⡯⣟⣷⣻⢷⣻⣞⣿⡽⣷⣻⡽⣧⠀⠀⠀⠀⠈⠙⣷⣟⣖⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣳⡿⣽⢷⣻⣷⣻⣯⢷⣟⣯⢿⣞⣷⣻⡽⣷⣻⡽⣧⡀⠀⠀⠀⠀⠙⢽⣯⣟⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣻⣞⣿⣽⣻⣽⢾⡿⣾⣟⣿⣾⣻⣽⢾⣽⢯⣟⣷⣻⡽⣷⠀⠀⠀⠀⠀⠈⣷⢿⣺⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣟⣷⣻⣞⣷⣻⢾⣿⣻⠟⠈⠉⢫⣷⣟⡿⣞⣯⡿⣾⡽⣯⢿⡄⠀⠀⠀⠀⠀⢻⣿⢽⣥⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣟⣾⡽⣾⡽⣾⣿⣳⠟⠀⠀⠀⠀⢿⣽⡿⣽⢷⣻⢷⣻⣯⢿⣅⠀⠀⠀⠀⠀⢸⣯⡿⣽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⣷⣻⢷⣻⣯⣷⡇⠀⠀⠀⠀⠀⠘⢳⣿⢯⣿⢽⣯⢷⣻⣯⣿⠀⠀⠀⠀⠀⣼⡯⣿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣻⣽⢯⡿⣽⣯⣷⠀⠀⠀⠀⠀⠀⠈⣽⡿⣞⣯⡿⣽⢷⣻⣾⠆⠀⠀⣀⣾⢯⡿⠝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢯⡿⣞⣿⡽⣿⣽⢾⠀⠀⠀⠀⠀⠀⠀⢹⡿⣯⡷⣟⣯⢿⣳⣿⡃⠀⢐⣾⢿⣽⡻⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡿⣽⣞⡿⡿⣞⠅⠀⠀⠀⠀⠀⠀⠀⢸⣿⣻⣽⢯⣟⣿⣻⣽⣧⠀⠀⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢖⢣⢫⠻⣺⡹⡹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣯⡿⣯⢿⡾⣟⣿⡖⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣮⢣⢫⢪⢞⡼⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡾⣟⣯⡿⣽⡯⣟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠙⠿⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣜⢻⢿⣳⣟⣷⣻⣯⣷⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣘⢜⢎⠻⢼⢻⢪⢫⢚⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠕⢹⢸⢪⢪⢺⡔⡝⣣⡳⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⣗⠃⣵⡽⠙⡜⡇⠀⠀⠀⠀⠀⠀⠀⠀\n");

    System.out.println("=-=-=-=-=-=-=-==-=-=-==-=-=-=-==-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");   
    sc.nextLine();
  //================================================================ BATALHA DO MACACO ====================================================================
    switch (name) {
            case "Simon Riley":
                DueloMacaco.dueloGhostFinal(1250, 1100);
                break;
            case "Alloy Smith":
                Alloy.dueloAlloyFinal(1200, 1100);
                break;
   } sc.nextLine();
    System.out.println("\nApós uma longa batalha, você derrota o monstro, e pode enfim sair daquele lugar.\n");
     
     System.out.println(name +"sabe que muito ainda vem pela frente, porém essa experiência te fortaleceu, se sente\n"
             + "pronto para enfrentar o que tem mundo afora.\n");
     
     System.out.println("OBRIGADO POR JOGAR!!\n"
             + "CONTINUA!!!!");
     System.exit(0);
}
    //================================================================= CREDITOS ===========================================================================
    public void creditos(){
    System.out.println("\n\n</> Desenvolvedores </>\n\n-> Eric da Silva Vieira \n-> Gabriel Barbosa Maia \n-> Gabriel de Miranda Siqueira \n-> Wenderson Andrade Batista "
				);

		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = sc.nextInt();
			if (escolha_menu == 2) {
				menu();
                               
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 2);
   }
    public void Caixa(){
    String Abrir = "Abrir caixa";
    String Abrir1;
    int cont = 0;
   
    
            System.out.println("Você decide ir para a casa, chegando lá começa a vasculhar os armários, cômodos e gavetas, até que encontra uma caixa dentro de um guarda-roupa\n"
                    + "Você pensa em utilizar o seu machado (sim, você possui um machado) para abrir a caixa, mas teme em danificar o que há lá dentro");

                System.out.println("Para abrir a caixa, digite “Abrir caixa” ");
             
               while(cont != 1){  
                   Abrir1 = sc.nextLine();

              if(Abrir1.equalsIgnoreCase(Abrir)){
                  System.out.println(name + " abre a caixa e tem uma grande surpresa, um revólver em bom estado, e com as 6 balas já carregadas");
                  System.out.println("\n Você vasculha o resto da casa, mas não encontra nada, então segue adiante. \n");
                  cont = 1;
              }
             
          
    }
    }
    public void Prateleira(){
        String Empurrar = "Empurrar";
        String Empurrar1;
        int cont = 0;
        
        
        System.out.println("Para empurrar a prateleira para o lado, digite “Empurrar”");
        
        do{
            Empurrar1 = sc.next();
            
            if(Empurrar1.equalsIgnoreCase(Empurrar)){
                System.out.println("Vocês conseguem liberar o caminho para a porta, mas percebem que ela está trancada. ");
                System.out.println();
                cont=1;
            }
            else{
                System.out.println("Vocês tentam empurrar e não conseguem, tentem novamente");
                
            }
        
    }while(cont != 1);
        
    }
    
    
}
    

