import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * FontanaApp eh um app criado para estudar objetos e rotinas em Java para aula de Fundamentos de Programcao.
 * Consiste em um programa que le um catalogo de aves e faz anotacoes para a ornitologia (estudo das aves).
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author vicente.ferreira@edu.pucrs.br
 * @author 
 * @author 
 * 
 * @version 20220626
 */

public class FontanaApp{
    public static Bird[] createCatalog() throws IOException{
    Bird[] catalog = new Bird[188];
    BufferedReader r = new BufferedReader(new FileReader("catalog.txt"));
    int i = 0;
    String line = r.readLine();
    while (line != null) {
        catalog[i] = createBird(line);
        line = r.readLine();
        i++;
            }
        r.close();
        return catalog;
    }
    public static Bird createBird(String line){
        String[] attributes = line.split(",");
        int id = Integer.parseInt(attributes[0]);
        int size = Integer.parseInt(attributes[5]);
        boolean[] habitats = new boolean[6];
        for(int i = 0; i < 6; i++)
        habitats[i] = attributes[i+6].equals( "1" )?  true : false;
        return new Bird(id, attributes[1], attributes[2], attributes[3], attributes[4], size, habitats);
    }
    public static void mainMenu(Scanner sc){
        System.out.println("Opcoes disponiveis\n1: Consultar aves no catalogo\n2: Fazer uma anotacao\n3: Consultar anotacoes\n4: Gravar anotacoes em um arquivo e sair");
        int op = sc.nextInt();
        
        if(op > 4 || op < 1){
            System.out.println("Voce escolheu uma opcao invalida");
            mainMenu(sc);
        }
        switch(op){
            case 1: birdQueryMenu(sc);
            case 2: createNote(sc);
            case 3: noteQuery(sc);
            case 4: exitAndSave(sc);
        }
    }
    private static void exitAndSave(Scanner sc) {
    }
    private static void noteQuery(Scanner sc) {
    }
    private static void createNote(Scanner sc) {
    }
    public static void birdQueryMenu(Scanner sc){
        System.out.println("Voce quer buscar uma ave por qual parametro?\n1: Nome cientifico\n2: Nome em portugues\n3: Nome em ingles\n4: Familia\n5: Tamanho em cm\n6: Habitat\n0: Voltar para o menu principal");
        int op = sc.nextInt();

        if(op < 0 || op > 6 ){
            System.out.println("Voce escolheu uma opcao invalida");
            birdQueryMenu(sc);
        }
        switch (op){
            case 0: mainMenu(sc);
            case 1: sciNameFinder(sc);
            case 2: ptNameFinder(sc);
            case 3: enNameFinder(sc);
            case 4: familyNameFinder(sc);
            case 5: sizeFinder(sc);
            case 6: habitatFinder(sc);
        }
    }
    private static void sciNameFinder(Scanner sc) {
        String name = new String();
        System.out.println("Entre com o nome cientifico do passaro que voce quer pesquisar:");
        name = sc.nextLine();

        for (int i = 0; i < catalog.length; i++){

        }
    }
    public static void main(String[] args) throws IOException{
        final Bird[] catalog = createCatalog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao FontanaApp\nPressione o numero correspondente a funcao desejada");
        
        mainMenu(sc);
        sc.close();
        }
    }