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
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=  ππππ πππ πππππ  =-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=       ππ         =-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=  ππππ ππ πππππ  =-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
		do {
			System.out.println("\nVocΓͺ estΓ‘ pronto para conhecer o incrΓ­vel mundo de Lost in World?");
                        System.out.println("===================================================================");
			System.out.println("\n[1] - Sim  \n[2] - Com certeza!  \n[3] - NΓ£o estou preparado...\n");
                        System.out.println("===================================================================");
			escolha_menu = sc.nextInt();

			if (escolha_menu == 1 || escolha_menu == 2) {
				System.out.print("\n Perfeito, fique sabendo que Γ© um caminho sem volta!");
				menu();
			} else if (escolha_menu == 3) {
				System.out.print("\n NΓ£o se engane, vocΓͺ nΓ£o tem muita escolha... Abrace o destino!");
				menu();
			} else {
				System.out.print("Escolha uma opΓ§Γ£o valΓ­da!");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3);
    
    
    }
    //============================================================== menu ==============================================================================
    public void menu(){
    Scanner entrada = new Scanner(System.in);

		
		do {
			System.out.println("\n\n..:: ππ’π¦π§ ππ‘ πͺπ’π₯ππ ::.. \n\n1 - Jogar \n2 - InstruΓ§Γ΅es\n3 - CrΓ©ditos \n4 - Sair"
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
				System.out.println("VocΓͺ saiu do jogo!");
				System.exit(0);
			} else {
				System.out.println("\nOpΓ§Γ£o invΓ‘lida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
    }
    
    //============================================================== Instrucoes ===========================================================================
    public void instrucoes(){
    System.out.println("\n Lost in World se trata de um RPG Textual, uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atrΓ‘ves de uma pergunta respondida e/ou aΓ§Γ£o realizada.\r\n\n A cada pergunta respondida o jogo darΓ‘ opΓ§Γ΅es de caminhos para explorar.\r\n\n Ou seja, Mantenha total atenΓ§Γ£o na hora de responder.\r\n"
				+ "  ");
    System.out.println("Em alguns momentos, pressione enter para dar continuidade aos textos");
		System.out.println("\n Alguns desafios requerem que o usuΓ‘rio insira determinada frase, ou escolha entre caminho 1 ou 2."
				+ "\n Boa sorte!"
				+ "  ");
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = sc.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOpΓ§Γ£o invΓ‘lida, digite novamente: ");
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
            System.out.println(" Γ uma bela manhΓ£, o sol radiante por entre as nuvens, a brisa do vento bate em seus cabelos, \n"
                     + " vocΓͺ aprecia o silΓͺncio do inΓ­cio do dia, um cenΓ‘rio perfeito, os ΓΊnicos problemas sΓ£o que, \n"
                     + " o sol atinge apena algumas partes da superfΓ­cie pois nuvens radioativas se formaram por toda atmosfera, \n"
                     + " o vento carrega poeira e sujeira para todo canto, e claro, o silΓͺncio Γ© devido ao fato de vocΓͺ ser o provΓ‘vel ΓΊnico ser humano vivo da regiΓ£o.");
            System.out.println("=====================================================================================================================================");
           sc.nextLine();     System.out.println(name + " se encontra naquilo que um dia jΓ‘ foi um supermercado, em busca de recursos para sobreviver e torcendo para nΓ£o dar de frente \n"
                        + " com nenhuma daquelas coisas, vocΓͺ verifica as estantes da parte central e nΓ£o encontra nada, entΓ£o diz em voz alta para si mesmo: \n");
        
    sc.nextLine();
          System.out.println(name+"- Γ, a sorte nΓ£o tem andado muito ao meu lado, mas nΓ£o tem muito o que eu fazer por aqui entΓ£o vamos em frente. \n");
          System.out.println("VocΓͺ se depara com duas portas, uma dando acesso a um corredor a direita e outro a esquerda, para onde quer ir? \n"
                  + "1 - Esquerda \n"
                  + "2 - Direita");  
          do{
          escolha_menu = sc.nextInt();

          if(escolha_menu == 1){
              System.out.println("VocΓͺ decide ir para a esquerda, dando de cara com um corredor totalmente vazio, siga em frente.");
              System.out.println("\n=====================================================================================================================================");
          }   
          else if(escolha_menu == 2){
              System.out.println("VocΓͺ decide ir para a direita, dando de cara com um corredor completamente vazio, opa! Parece que tem algo ali! \n"
                      + "Encontrou uma Garrafa dβagua");
                           Garrafa = 1;
              System.out.println("\n=====================================================================================================================================");

                           System.out.println("\n Voce coletou uma garrafa dβagua e guardou em sua mochila!!! \n");
                           System.out.println("[" + name + "]" + " -Isso vai ser muito ΓΊtil futuramente!");
          }else{
              System.out.println("Escolha incorreta! Digite novamente!");
              System.out.println("\n=====================================================================================================================================");
          }

            }while(escolha_menu != 1 && escolha_menu != 2);
       sc.nextLine();

            System.out.println("\n O corredor dΓ‘ nos fundos do mercado, que estΓ‘ completamente vazio para variar, porΓ©m tem uma porta que nos possibilita sair. \n");
            System.out.println(name + " abre a porta e caminha para a regiΓ£o de fora, ele(a) segue caminhando pela estrada, sempre seguindo pelos cantos e tentando chamar \n"
                    + " o menos de atenΓ§Γ£o possΓ­vel, imagina dar de cara com uma daquelas aberraΓ§Γ΅es. \n");
      sc.nextLine();
            System.out.println("\n ApΓ³s um tempo andando," + name + " chega em um vilarejo aparentemente abandonado, porΓ©m ele(a) percebe que algumas pessoas estavam ali \n "
                    + "hΓ‘ algumas horas atras, pois um saco de dormir estava aberto no chΓ£o, e uma fogueira fora recΓ©m apagada, o que Γ© um Γ³timo sinal, recursos podem \n"
                    + " ter sido deixados para trΓ‘s. [" +name+ "]" + " avista uma casa e decide ir checar o local \n");
           sc.nextLine();
            
                    Caixa();
                    System.out.println("\n=====================================================================================================================================");
                   
            sc.nextLine();

         

            System.out.println("Ao chegar no que parece ser o pΓ‘tio daquele vilarejo, vocΓͺ se sente observado, Γ© entΓ£o que duas pessoas saem de trΓ‘s de alguns \n"
                    + " arbustos e comeΓ§am a apontar armas para vocΓͺ. \n");
            System.out.println("Estranho β Procurando algo? Acho bom nΓ£o se mexer β diz o homem encapuzado. \n");
            System.out.println("[" + name + "]" + " β Calma calma, nΓ£o precisamos de violΓͺncia, eu sΓ³ estou aqui de passagem, nΓ£o quero problema. \n");
sc.nextLine();
            
             System.out.println("Estranha β Eu vi vocΓͺ vasculhando as coisas por aqui, acha que pode sair mexendo nas coisas dos outros? Esse lugar um dia jΓ‘ nos pertenceu. \n");
             System.out.println("VocΓͺ tem duas opΓ§Γ΅es nessa situaΓ§Γ£o:");
             System.out.println("1 β Oferecer garrafa dβagua a eles (Caso possua) \n"
                              + "2 β Conversar com eles para sair dessa situaΓ§Γ£o.");
             do{
             escolha_menu = sc.nextInt();

             switch(escolha_menu){

                 case 1:
                     if(Garrafa == 0){
                         System.out.println("VocΓͺ nΓ£o possui este item. \n");
                         System.out.println("\n=====================================================================================================================================");
                     }
                     else{
                         System.out.println("[" +name+ "]" + " β Olha, eu posso oferecer uma garrafa com um pouco de Γ‘gua para vocΓͺs, em troca daquilo que peguei, e cada um de nΓ³s segue seu caminho. \n");
                         System.out.println("Estranho β Hm, parece uma troca justa, o que acha? \n");
                         System.out.println("Estranha β Parece bom para mim, dΓ‘ isso aqui logo. \n");
                         System.out.println("VocΓͺ entrega a garrafa.");
                         Garrafa = 0;
                         System.out.println("\n=====================================================================================================================================");
                         
                     } break;
                 case 2:
                     System.out.println("[" +name+ "]" + " β Com todas as ameaΓ§as que tΓͺm afora, vocΓͺs querem mesmo ameaΓ§ar a prΓ³pria espΓ©cie? VocΓͺs me matam, eaΓ­? \n"
                             + " O que muda? Acredito que possui uma maneira de nos ajudarmos. \n");
                     System.out.println("Estranho β Acha que esse discursinho vai colar? NΓ£o temos nada a perder! E como alguΓ©m como vocΓͺ pode nos ajudar? \n"
                             + " Nada nem ninguΓ©m pode nos ajudar, fomos deixados aqui para morrer, Deus nos deixou!!! \n");
                     System.out.println("\n=====================================================================================================================================");
                     break;
             }

            }while(escolha_menu != 1 && escolha_menu != 2);
             sc.nextLine();

   System.out.println("Mesmo apΓ³s isso eles continuam insistindo, vocΓͺ pode decidir se pronunciar ou sΓ³ ficar em silΓͺncio");
   sc.nextLine();
            
                System.out.println("1 β Eu devolvo o que peguei de vocΓͺs entΓ£o, estou numa situaΓ§Γ£o em que nΓ£o posso fazer muita coisa \n"
                                 + "2 β Permanecer em silΓͺncio");
                do{
                escolha_menu = sc.nextInt();

                switch(escolha_menu){

                    case 1:
                        System.out.println("Estranha β Isso aΓ­, entrega logo o que Γ© nosso. \n");
                        System.out.println("\n=====================================================================================================================================");
                        break;

                    case 2:
                        System.out.println("Estranho β O QUE VOCΓ VAI FAZER? VAI LOGO, EU VOU TE MATAR \n");
                        System.out.println("\n=====================================================================================================================================");
                        break;
                }

            }while(escolha_menu != 1 && escolha_menu != 2);
                sc.nextLine();

            System.out.println("Eis entΓ£o que vocΓͺ escuta um barulho, e tem total noΓ§Γ£o do que se trata, um deles estΓ‘ por perto. \n");
            System.out.println("[" +name+ "]"+  " -VocΓͺs ouviram isso? \n");
            System.out.println("Estranho β Ouvimos o que? Quem vocΓͺ estΓ‘ querendo enganar? NΓ£o tem porra nenhuma aqui. \n");
            System.out.println("Quando de repente um tigre mutante de aproximadamente 2,5m pula em direΓ§Γ£o a mulher e a mata com uma mordida sΓ³. \n");
            System.out.println("Estranho β MEU AMOR, MEU AMOR!!!! \n");
            sc.nextLine();

            
                System.out.println("O estranho comeΓ§a a atirar na criatura, que nΓ£o sente nada e comeΓ§a a caminhar lentamente em direΓ§Γ£o ao homem, de olho em sua presa. \n");
                System.out.println("VocΓͺ tem duas opΓ§Γ΅es \n");
                System.out.println("1 β Tentar ajudar o homem. \n"
                                 + "2 β CORRER. \n");
                do{
                escolha_menu = sc.nextInt();

                if(escolha_menu == 1){
                    System.out.println("VocΓͺ sabe que isso nΓ£o Γ© possΓ­vel e corre, enquanto houve os disparos e gritos.");
                    System.out.println("\n=====================================================================================================================================");
                }if(escolha_menu==2){
                    System.out.println("VocΓͺ corre, enquanto houve os disparos e gritos.");
                    System.out.println("\n=====================================================================================================================================");
                }

            }while(escolha_menu != 1 && escolha_menu != 2);
            if (Garrafa==1){ 
                System.out.println("A garrafa cai de seu bolso enquanto vocΓͺ corre");
            }  sc.nextLine();
  //=============================================================== DUELO RAPOSA ===========================================================================
       System.out.println("\n=====================================================================================================================================");
       System.out.println("Γ entΓ£o que durante a noite, vocΓͺ acorda com um barulho do lado de fora da caverna, vai aumentando e chegando cada vez mais prΓ³ximo. VocΓͺ se prepara para o pior. n/");
              sc.nextLine();
           
                System.out.println("Eis que surge uma raposa mutante, quase inteiramente nu, o que restou de seus pelos estΓ‘ espalhado por seu corpo. Ela te encara, com os dentes a mostra, pronta para atacar. ");
                System.out.println("1 β Correr");
                System.out.println("2 β Lutar");
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
        System.out.println("VocΓͺ procura algum abrigo enquanto caminha sob a luz do luar,\n"
                + " Γ© entΓ£o que encontra um posto de gasolina abandonado, e decide entrar no comΓ©rcio para ver se encontra algum recurso. \n"
                + "Nada Γ© encontrado, porΓ©m vocΓͺ ouve um barulho de passos vindo dos fundos, \n"
                + " fica receoso, mas decide ir lΓ‘ checar, com suas armas em mΓ£o vocΓͺ se aproxima e dΓ‘ de cara com uma garota, \n"
                + " que se assusta ao te ver e grita:");
        sc.nextLine();
        System.out.println("[ESTRANHA] β QUEM Γ VOCΓ? CALMA! ABAIXE ESSAS ARMAS EU IMPLORO!");
        System.out.println("["+ name +"]" + " β CALMA! Eu pensei que fosse uma daquelas coisas, eu nΓ£o vou fazer nada com vocΓͺ,\n"
                + " sΓ³ estou de passagem, vamos voltar para dentro, nΓ£o quero correr o risco de ser visto.");
        System.out.println();sc.nextLine();
        System.out.println("VocΓͺs voltam para dentro da loja e decidem esperar o amanhecer, durante conversas vocΓͺ descobre que ela se chama Ashe,\n"
                + " e que estΓ‘ procurando o seu grupo, segundo ela todos foram para um lugar que Γ© conhecido como βParaΓ­soβ,\n"
                + " uma estrutura protegida pelo que restou do governo, onde as pessoas podem viver sem a ameaΓ§a dos monstros.\n"
                + " VocΓͺ decide se juntar a ela, afinal, o que tem a perder? VocΓͺs descansam.\n" +
"No outro dia...");sc.nextLine();
         System.out.println("[ASHE] β VocΓͺ anda sozinho por aΓ­?");
         System.out.println("["+ name + "]" + "β Sim, eu jΓ‘ tive pessoas, mas todas elas se foram, sabe como Γ©, um mundo perigoso.");
         System.out.println("[ASHE] β Eu lamento por isso.");
         System.out.println("["+ name +"]" + "β Obrigado, mas estΓ‘ tudo bem, Γ© passado.");
         System.out.println();
         System.out.println("Antes de sair da loja vocΓͺs avistam uma porta que estΓ‘ escondida por uma prateleira.");
         System.out.println("["+ name +"]" + "β Ei, me ajuda aqui.");
     sc.nextLine();
                     Prateleira();

             System.out.println("[ASHE] - Temos que achar uma maneira de abrir este cadeado,\n"
                 + " veja que dois espaΓ§os da senha jΓ‘ estΓ£o preenchidos, sΓ³ precisamos descobrir os dois ΓΊltimos nΓΊmero.\n"
                 + " Pelo que vejo os nΓΊmeros vΓ£o atΓ© 20.");
             do{
             escolha_menu = sc.nextInt();
             
             if(escolha_menu == 13){   
             }
             
             if(escolha_menu !=  13){
                 erro++;
             if (erro==1){
                 System.out.println("Vamos, nΓ£o desista, vocΓͺ consegue!!!");
                 
             } if (erro==2){
                 System.out.println("Eu acredito em vocΓͺ");}
             if (erro==3){
                 System.out.println("Eu tΓ΄ quase tentando por vocΓͺ");
             }
             if (erro ==4){
                 System.out.println("["+ name +"]"+ " β Quer saber, eu me cansei dessa merda");
                 System.out.println();
                 System.out.println("VocΓͺ acerta o cadeado com o machado, o quebrando e assim liberando a porta.");
                 System.out.println("["+ name +"]" +"β Viu, Γ© assim que se faz.");
                 escolha_menu = 13;
                      
                 
             }
             
         }}while(escolha_menu != 13);
         
         System.out.println();
         System.out.println("VocΓͺs se deparam com uma sala cheia de coisas inΓΊteis,\n"
                 + " e comida, o que deixa Ashe muito feliz,\n"
                 + " mas o que te chama atenΓ§Γ£o Γ© um rifle que se encontra em cima da mesa,\n"
                 + " e muniΓ§Γ£o, muita muniΓ§Γ£o!");
         
         System.out.println("[" + name +"]" +"β Agora estamos prontos para sair daqui, vamos.");
           sc.nextLine();
         System.out.println("VocΓͺs seguem caminho adiante, eis que Ashe sugere um caminho a ser seguido");
         System.out.println("[ASHE] - Eu conheΓ§o um lugar que podemos nos abrigar, ele estΓ‘ abandonado hΓ‘ muito tempo, podemos ficar uns dias por lΓ‘");
         sc.nextLine();
          System.out.println("VocΓͺ fica com o pΓ© atrΓ‘s em relaΓ§Γ£o a ideia, mas decide aceitar");
           System.out.println("["+name+"] "+ "Bem, vamos lΓ‘, me mostre o caminho");
           System.out.println("VocΓͺs decidem ir atΓ© o local");
           sc.nextLine();
         System.out.println("["+name+"] "+ "O QUE Γ AQUILO GIGANTE ALI?");
         System.out.println("[ASHE] - Γ o nosso abrigo uΓ©, uma antiga usina da regiΓ£o, e relaxa\n"
                 + "a radiaΓ§Γ£o de lΓ‘ jΓ‘ se foi hΓ‘ muito tempo");
         System.out.println("[ASHE] - Para chegarmos lΓ‘ temos que passar por um tunel subterrΓ’neo\n"
                 + "me acompanhe");
         sc.nextLine();
         System.out.println("No corredor...");
         System.out.println("["+name+"] "+ "Esse lugar tem um cheiro horrΓ­vel/\n"
                 + "vamos sair logo daqui");
         System.out.println("Eis que vocΓͺs escutam um barulho vindo do caminho de onde vieram\n"
                 + "algo parecido com patas em movimento, de forma muito rΓ‘pida");
         sc.nextLine();
         System.out.println("["+name+"] "+ "Tem algo vindo aΓ­, vamos nos esconder");
         System.out.println("VocΓͺ se esconde de um lado, e Ashe de outro");
         System.out.println("O barulho vai aumentando, e finalmente vocΓͺs veem o que Γ©\n"
                 + "uma manada de lobos mutantes, passando numa velocidade absurda\n"
                 + "quando eles estΓ£o quase indo embora, Ashe se movimenta e acaba fazendo barulho, sendo detectada por um deles\n"
                 + "NΓ£o resta opΓ§Γ£o para ela a nΓ£o ser correr, e vocΓͺ sabe que nΓ£o pode ajudar, se nΓ£o sΓ³ vai atrair mais deles\n"
                 + "VocΓͺ a observa fugir, e apΓ³s algum tempo nΓ£o escuta mais nada, somente desejando que ela esteja bem");
          sc.nextLine();
           System.out.println("ApΓ³s esperar por algumas horas vocΓͺ sai do tunel, e da de cara com a entrada da usina");
          //======================================================================   Treta LadrΓ£o e falas =========================================================    
         sc.nextLine();
         System.out.println("\n=====================================================================================================================================");
        
        System.out.println(name +" decide entrar naquilo que um dia foi uma usina, Γ© entΓ£o que avista uma sombra correndo \n"
                + "pelas paredes, e se prepara. Um homem aparece em sua frente, com armas em mΓ£os e diz para vocΓͺ:");
        System.out.println("\n[LADRΓO] β Vamos ver o que vocΓͺ tem para mim.");
          sc.nextLine();
          
        System.out.println("\n[" + name + "] - Meu deus tenho duas escolhas: \n"
                + "\n1 - Ficar e lutar para nΓ£o perder seu loot \n"
                + "\n2 - Tentar fugir");
        do{
        escolha_menu = sc.nextInt();
        }while(escolha_menu != 1 && escolha_menu != 2);
        
        System.out.println("\n=====================================================================================================================================");     
   //============================================================== DUELO LADRΓO ===========================================================================         
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
            
         System.out.println("[" + name + "] Droga nΓ£o tem uma saΓ­da, vou ter que encarar ele");  
        
        
     switch (name) {
        case "Simon Riley":
         DueloLadrao.dueloGhostLd(1250, 800);
        break;
        case "Alloy Smith":
         AlloyLd.dueloAlloySimples(1200, 800);
        break;
        }
        } 
            
          System.out.println("ApΓ³s derrotar o ladrΓ£o,"+ name + "parte adiante, tentando sair daquele lugar que mais parece um\n"
            + "labirinto. Indo mais afundo vocΓͺ consegue avistar uma saΓ­da e se alegra, vai correndo em sua\n"
            + "direΓ§Γ£o, mas Γ© aΓ­ que uma figura monstruosa cai na sua frente, um Macaco Mutante que \n"
            + "estava pendurado entre os cabos do lugar.");
    System.out.println("=-=-=-=-=-=-=-==-=-=-==-=-=-=-==-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); sc.nextLine();
    
    System.out.println("[ASTAROTH] - Olha sΓ³ quem temos por aqui na minha propiedade!!!\n");
    
    System.out.println("["  + name + "] Como assim vocΓͺ fala!!\n"
            + "VocΓͺ Γ© um macaco enorme\n");
    sc.nextLine();
    
    System.out.println("["  + name + "] preocupado tenta raciocinar uma forme de fugir desse lugar\n");
    
    System.out.println("[ASTAROTH] - Fique calmo hoje vocΓͺ serΓ‘ meu banquete");
    
    System.out.println("["  + name + "] Nunca nem que eu morra aqui eu vou batalhar e te mandar de volta\n"
            + "de onde vocΓͺ veio seu ser bizarro"); sc.nextLine();
    
    System.out.println("[ASTAROTH] - Vamos ver um ser tΓ£o pequeno com tanta astucia assim");
    System.out.println("A figura bizarra sai da escuridΓ£o e mostra sua real face\n");
    System.out.println("β β β β β β β β β β β β β β β β β β β β β β β β β β£ β β β β β β β β β β β β β β β β β β β β β β’β£ β£€β£β£β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β β β β’β’β£°β‘Όβ£―β£€β£β£β£β β β β β β β β β β β β β β β β’β’β’β’β‘ͺβ‘³β‘»β£·β’§β‘β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β’ β‘β β’Έβ‘Όβ£―β£β‘·β£―β£·β’Ώβ’―β£β‘β β β β β β β β β β β£β’²β’»β’Έβ‘Έβ‘ͺβ‘β£β’β‘β‘―β£»β£»β‘β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β β‘―β£ β£―β£β‘·β£―β’Ώβ‘½β£Ύβ’»β‘Έβ£β£Άβ’¦β£β£β£β‘β β β’β£β’ β£β£β’β‘Όβ’ͺβ’£β’«β’ͺβ’Ίβ’Έβ‘ͺβ‘β‘½β£β β \n" +
"β β β β β β β β β β β β β β β β β β β β’β£β‘β β‘»β£½β‘Ίβ£³β‘Ώβ£β’―β‘Ώβ£½β‘ͺβ££β£Ώβ£«β£Ώβ’½β£»β‘½β£Ώβ’·β£Άβ£»β’Ώβ£½β£»β£©β£?β£ͺβ‘ͺβ£β’β’β’β‘β£β’β’?β β β \n" +
"β β β β β β β β β β β β β β β β’β£€β‘Ύβ£Ώβ£»β£―β’Ώβ‘Ώβ£Άβ£β£ͺβ‘³β‘β£β£¦β’Ώβ£»β£β£Ώβ£β£Ώβ£Ίβ’Ώβ£½β£»β‘½β£β£Ύβ‘½β£β£Ύβ‘½β£Ύβ£β£Ώβ’Ώβ£¦β’£β’§β’³β’±β‘±β£β β β β \n" +
"β β β β β β β β β β β β β β β’΄β£Ώβ’―β£β£―β£·β£»β£β£Ώβ’½β£Ύβ’β ―β‘β£β’β’β£Ώβ£Ίβ’·β£β‘Ύβ£―β’Ώβ‘Ύβ£·β£»β£―β£·β£Ώβ’Ώβ£·β’Ώβ£―β£Ώβ£»β£―β£β£·β‘΅β£β££β‘Ώβ β β β β \n" +
"β β β β β β β β β β β β’β£€β£β£Ώβ£Ίβ’Ώβ‘½β£β£·β£»β‘Ύβ£½β£»β’Ύβ’β «β §β£·β£β’½β£·β£β£―β‘·β£β£―β’Ώβ£»β£Ώβ£»β£½β£·β‘Ώβ£β£Ώβ£»β’·β£»β£―β£·β’Ώβ£³β‘β β β β β β β β \n" +
"β β β β β β β β β β£ β’Άβ£―β’·β£β‘Ύβ£―β£β£―β’Ώβ£½β£Ύβ£»β‘½β£―β£β£Ώβ‘β£Ώβ£Ώβ‘Ήβ£½β’Ύβ£³β£―β’Ώβ‘½β£―β’Ώβ£½β£―β’Ώβ£³β£―β β β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β£ β’€β‘Όβ£½β£β‘Ύβ£―β’Ώβ£½β£β£Ύβ£β£Ώβ£½β’Ύβ£³β‘Ώβ£½β’Ύβ£³β’―β’β’«β‘―β£β£―β‘Ώβ£β£Ώβ£½β£»β£½β£Ύβ’Ώβ‘―β‘Ώβ β β β β β β β β β β β β β β β β β β β \n" +
"β β β β’β‘΄β£―β‘β£β’΅β‘±β£β£β’½β’»β£Ύβ’Ώβ£½β’Ώβ£·β£»β£Ώβ£―β’Ώβ£½β’―β£β£Ώβ£»β£½β£»β‘½β£·β£»β£β£Ύβ£³β£Ώβ£»β£Ύβ£β£Ώβ β β β β β β β β β β β β β β β β β β β β \n" +
"β β β β£½β’Ώβ‘Ώβ‘β‘Όβ‘Έβ‘Έβ‘±β‘β£½β£Όβ£―β β β β β£Ώβ£β‘Ώβ£Ώβ‘Ύβ£Ώβ£»β£Ύβ’Ώβ£Ύβ£β£Ώβ£β£·β‘Ώβ£―β£Ώβ£½β£Ώβ‘½β£β‘β β β β β β β β β β β β β β β β β β β β β \n" +
"β β β β£Ώβ£β’―β’ͺβ£ͺβ‘£β‘β‘β£ͺβ‘·β β β β β β β β£―β‘Ώβ£½β£β£Ώβ‘½β£Ύβ£»β‘½β£―β’Ώβ£½β£»β£β£Ώβ£½β’·β£―β’Ώβ£½β‘β£β β β β β β β β β β β β β β β β β β β β \n" +
"β β β β’³β’β’β’β£β’β’β‘β Ύβ β β β β β β β β β£½β’·β£»β£β£Ώβ‘½β£·β£»β£―β£β£·β’―β£·β£»β£β‘Ώβ£β£―β£·β£Ώβ£½β’Άβ£β£β‘β β β β β β β β β β β β β β β β \n" +
"β β β β β ΅β Ήβ‘β‘β‘β‘β β β β β β β β β β β β’Έβ‘―β£Ώβ£β£·β£»β‘½β£·β£»β‘Ύβ£½β£β£Ύβ‘½β£Ύβ£»β‘½β£·β β β β β’―β£·β£β£Άβ£β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β£Ύβ‘½β£·β£»β‘Ύβ£½β‘―β£β£·β£»β’·β£»β£β£Ώβ‘½β£·β£»β‘½β£§β β β β β β β£·β£β£β‘β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β£Ύβ£³β‘Ώβ£½β’·β£»β£·β£»β£―β’·β£β£―β’Ώβ£β£·β£»β‘½β£·β£»β‘½β£§β‘β β β β β β’½β£―β£β£¦β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β£Όβ£»β£β£Ώβ£½β£»β£½β’Ύβ‘Ώβ£Ύβ£β£Ώβ£Ύβ£»β£½β’Ύβ£½β’―β£β£·β£»β‘½β£·β β β β β β β£·β’Ώβ£Ίβ‘β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β’ β£β£·β£»β£β£·β£»β’Ύβ£Ώβ£»β β β β’«β£·β£β‘Ώβ£β£―β‘Ώβ£Ύβ‘½β£―β’Ώβ‘β β β β β β’»β£Ώβ’½β£₯β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β’Έβ£β£Ύβ‘½β£Ύβ‘½β£Ύβ£Ώβ£³β β β β β β’Ώβ£½β‘Ώβ£½β’·β£»β’·β£»β£―β’Ώβ£β β β β β β’Έβ£―β‘Ώβ£½β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β’Έβ‘Ώβ£·β£»β’·β£»β£―β£·β‘β β β β β β β’³β£Ώβ’―β£Ώβ’½β£―β’·β£»β£―β£Ώβ β β β β β£Όβ‘―β£Ώβ β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β’Έβ£Ώβ£»β£½β’―β‘Ώβ£½β£―β£·β β β β β β β β£½β‘Ώβ£β£―β‘Ώβ£½β’·β£»β£Ύβ β β β£β£Ύβ’―β‘Ώβ β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β’Έβ’―β‘Ώβ£β£Ώβ‘½β£Ώβ£½β’Ύβ β β β β β β β’Ήβ‘Ώβ£―β‘·β£β£―β’Ώβ£³β£Ώβ‘β β’β£Ύβ’Ώβ£½β‘»β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β£Ώβ‘Ώβ£½β£β‘Ώβ‘Ώβ£β β β β β β β β β’Έβ£Ώβ£»β£½β’―β£β£Ώβ£»β£½β£§β β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β’ β’β’£β’«β »β£Ίβ‘Ήβ‘Ήβ β β β β β β β β β β£Ώβ£―β‘Ώβ£―β’Ώβ‘Ύβ£β£Ώβ‘β‘β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β Έβ£?β’£β’«β’ͺβ’β‘Όβ β β β β β β β β β β β’Ώβ‘Ύβ£β£―β‘Ώβ£½β‘―β£β£Ώβ‘β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β Ώβ β β β β β β β β β β β β β β£β’»β’Ώβ£³β£β£·β£»β£―β£·β‘β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β’Έβ£β’β’β »β’Όβ’»β’ͺβ’«β’β’β β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β’Ήβ’Έβ’ͺβ’ͺβ’Ίβ‘β‘β££β‘³β‘β β β β β β β β β β β β β β β β \n" +
"β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β ¨β£β β£΅β‘½β β‘β‘β β β β β β β β \n");

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
    System.out.println("\nApΓ³s uma longa batalha, vocΓͺ derrota o monstro, e pode enfim sair daquele lugar.\n");
     
     System.out.println(name +"sabe que muito ainda vem pela frente, porΓ©m essa experiΓͺncia te fortaleceu, se sente\n"
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
				System.out.println("\nOpΓ§Γ£o invΓ‘lida, digite novamente: ");
			}
		} while (escolha_menu != 2);
   }
    public void Caixa(){
    String Abrir = "Abrir caixa";
    String Abrir1;
    int cont = 0;
   
    
            System.out.println("VocΓͺ decide ir para a casa, chegando lΓ‘ comeΓ§a a vasculhar os armΓ‘rios, cΓ΄modos e gavetas, atΓ© que encontra uma caixa dentro de um guarda-roupa\n"
                    + "VocΓͺ pensa em utilizar o seu machado (sim, vocΓͺ possui um machado) para abrir a caixa, mas teme em danificar o que hΓ‘ lΓ‘ dentro");

                System.out.println("Para abrir a caixa, digite βAbrir caixaβ ");
             
               while(cont != 1){  
                   Abrir1 = sc.nextLine();

              if(Abrir1.equalsIgnoreCase(Abrir)){
                  System.out.println(name + " abre a caixa e tem uma grande surpresa, um revΓ³lver em bom estado, e com as 6 balas jΓ‘ carregadas");
                  System.out.println("\n VocΓͺ vasculha o resto da casa, mas nΓ£o encontra nada, entΓ£o segue adiante. \n");
                  cont = 1;
              }
             
          
    }
    }
    public void Prateleira(){
        String Empurrar = "Empurrar";
        String Empurrar1;
        int cont = 0;
        
        
        System.out.println("Para empurrar a prateleira para o lado, digite βEmpurrarβ");
        
        do{
            Empurrar1 = sc.next();
            
            if(Empurrar1.equalsIgnoreCase(Empurrar)){
                System.out.println("VocΓͺs conseguem liberar o caminho para a porta, mas percebem que ela estΓ‘ trancada. ");
                System.out.println();
                cont=1;
            }
            else{
                System.out.println("VocΓͺs tentam empurrar e nΓ£o conseguem, tentem novamente");
                
            }
        
    }while(cont != 1);
        
    }
    
    
}
    

