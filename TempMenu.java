import java.util.Scanner;

/*
 * NAO TA COMPLETO AINDA
 */
public class TempMenu{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int searchMethod = 0;
        int birdDesc = 0;
        int characteristic = 0;
        int page, line, column = 0;
        int name, color, habitat = 0;
        String note;
        
        do {          

            System.out.println("\n\t  Bem-vindo ao FontanaApp");
            System.out.println("\t---------------------------");
            System.out.println("\t1 - Consulta ao catálogo");
            System.out.println("\t2 - Adicionar anotacao");
            System.out.println("\t3 - Consultar anotacao");
            System.out.println("\t4 - Sair");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Consulta ao catalogo...");
                    System.out.println("\t1 - pelo nome, cor ou habitat da ave");
                    /*
                     * habitats: campo seco baixo (0), campo seco alto campo “sujo” (1), campo alagado, campo úmido, várzeas alagadas(2)
                     * campo com árores, arbustos ou arvoretas(3),banhado com espelho d’água(4), 
                     * banhado com vegetação alta, em geral palha ou gravatá, sem espelho d`água(5);
                    */
                    System.out.println("\t2 - pela pagina, linha e coluna");
                    searchMethod = sc.nextInt();

                    switch(searchMethod) {
                        case 1:
                            System.out.println("Nome (1), cor (2) ou habitat (3)?");
                            characteristic = sc.nextInt();
                            switch(characteristic) {
                                case 1:
                                    System.out.print("\tDigite o nome:");
                                    name = sc.nextInt();
                                    break;
                                case 2:
                                    System.out.print("\tDigite a cor:");
                                    color = sc.nextInt();
                                    break;
                                case 3:
                                    System.out.println("\tDigite o habitat:");
                                    System.out.println("\tCampo seco baixo (1)");
                                    System.out.println("\tCampo seco alto campo “sujo” (2)");
                                    System.out.println("\tCampo alagado, campo úmido, várzeas alagadas(3)");
                                    System.out.println("\tCampo com árores, arbustos ou arvoretas(4)");
                                    System.out.println("\tbanhado com espelho d’água(5)");
                                    System.out.println("\tbanhado com vegetação alta, em geral palha ou gravatá, sem espelho d`água(6)");

                                    habitat = sc.nextInt();
                                    break;
                            }
                        
                        case 2:
                            System.out.println("\tDigite a pagina:");
                            page = sc.nextInt();
                            System.out.println("\tDigite a linha:");
                            line = sc.nextInt();
                            System.out.println("\tDigite a coluna:");
                            column = sc.nextInt();
                            System.out.println();    //a linha do catálogo);

                            //Nao sei oq colocar para ler linhas do catalogo.
                            //Lembrando q o programa tem q ter essas 2 formas de pesquisa:
                            //- Informando a PAGINA, a LINHA e a COLUNA
                            //onde está cadastrada a ave no livro

                    }
                case 2:
                     System.out.println("Adicionar anotacao:");
                     
            }
        } while (op != 4);
        System.out.print("FIM");
    }
}
