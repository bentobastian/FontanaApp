import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.omg.PortableInterceptor.ACTIVE;

/**
 * FontanaApp eh um app criado para estudar objetos e rotinas em Java para aula de Fundamentos de Programcao.
 * Consiste em um programa que le um catalogo de aves e faz anotacoes para a ornitologia (estudo das aves).
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author vicente.ferreira@edu.pucrs.br
 * @author thales.dias@edu.pucrs.br
 * @author 
 * 
 * @version 20220626
 */

public class FontanaApp {
    public static final Scanner sc = new Scanner(System.in);
    public static Bird[] createCatalog() throws IOException {
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
    public static void mainMenu(Bird[] catalog){
        System.out.println("Opcoes disponiveis\n1: Consultar aves no catalogo\n2: Fazer uma anotacao\n3: Consultar anotacoes\n4: sair");
        int op = sc.nextInt();

        switch(op){
            case 1:
                birdQueryMenu(catalog);
                break;
            case 2:
                createNote(catalog);
                break;
            case 3:
                noteQuery(catalog);
                break;
            case 4:
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("Voce escolheu uma opcao invalida");
                mainMenu(catalog);
        }
    }
    public static void noteQuery(Bird[] catalog) {
    }
    public static void initiateNotes(){
        String path = "Notes.txt";
        File notes = new File (path);
        
        try{
        if (!notes.exists()) {
            notes.createNewFile();
            System.out.println("Arquivo criado: " + notes.getName());
        }
        else System.out.println("Notes ja existe.");
        }
        catch(IOException e){
        }
    
    }
    public static void createNote(Bird[] catalog){
        int id, day, month, year;
        String local = new String();

        System.out.println("Identifique a Ave com o ID");
        id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o Local");
        local = sc.nextLine();
        
        System.out.println("Digite a Data");
        System.out.println("Dia");
        day = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Mes");
        month = sc.nextInt();
        sc.nextLine();

        System.out.println("Ano");
        year = sc.nextInt();
    
        Note note  = new Note(catalog[id-1], local, day, month, year);

        addNote(note, catalog);
    }
    public static void addNote(Note note, Bird[] catalog){
        String path = "Notes.txt";

        try{
        File add = new File(path);
        FileWriter fw = new FileWriter(add, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        pw.printf(note.toString());
        pw.close();
        bw.close();
        fw.close();
        
        }
        catch(IOException e){
        }
        mainMenu(catalog);
    }
    public static void birdQueryMenu(Bird[] catalog) {
        System.out.println("Voce quer buscar uma ave por qual parametro?\n1: Nome cientifico\n2: Nome em portugues\n3: Nome em ingles\n4: Familia\n5: Tamanho em cm\n6: Habitat\n0: Voltar para o menu principal");
        int op = sc.nextInt();

        if(op < 0 || op > 6 ){
            System.out.println("Voce escolheu uma opcao invalida");
            birdQueryMenu(catalog);
        }
        switch (op){
            case 0: mainMenu(catalog);
            case 1: sciNameFinder(catalog);
            case 2: ptNameFinder(catalog);
            case 3: enNameFinder(catalog);
            case 4: familyFinder(catalog);
            case 5: sizeFinder(catalog);
            case 6: habitatFinder(catalog);
        }
    }
    public static void sizeFinder(Bird[] catalog) {
        int size;
        System.out.println("Entre com o tamanho medio do passaro que voce quer pesquisar:\n(Aparecera passaros num raio de 2 cm do valor que voce escolher)");
        size = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < catalog.length; i++){
            if (Math.abs(catalog[i].size - size) <= 2)
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void familyFinder(Bird[] catalog) {
        String s = new String();
        System.out.println("Entre com o nome da familia do passaro que voce quer pesquisar:");
        s = sc.next();
        System.out.println("");
        for (int i = 0; i < catalog.length; i++){
            String s1 = catalog[i].family.toUpperCase();
            String s2 = s.toUpperCase();
            if (s1.contains(s2))
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void enNameFinder(Bird[] catalog) {
        String s = new String();
        System.out.println("Entre com o nome em ingles do passaro que voce quer pesquisar:");
        s = sc.next();
        System.out.println("");
        for (int i = 0; i < catalog.length; i++){
            String s1 = catalog[i].enName.toUpperCase();
            String s2 = s.toUpperCase();
            if (s1.contains(s2))
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void ptNameFinder(Bird[] catalog) {
        String s = new String();
        System.out.println("Entre com o nome em portugues do passaro que voce quer pesquisar:");
        s = sc.next();
        System.out.println("");
        for (int i = 0; i < catalog.length; i++){
            String s1 = catalog[i].ptName.toUpperCase();
            String s2 = s.toUpperCase();
            if (s1.contains(s2))
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void habitatFinder(Bird[] catalog) {
        System.out.println("voce quer buscar as aves de qual habitat?\n1: campo seco baixo;\n2: campo seco alto, campo “sujo”;\n3: campo alagado, campo umido, varzeas alagadas;\n4: campo com arores, arbustos ou arvoretas;\n5: banhado com espelho dagua;\n6: banhado com vegetacao alta, em geral palha ou gravata, sem espelho dagua;\n0: voltar ao menu principal");
        int op = sc.nextInt();
        
        switch (op){
            case 0:
                mainMenu(catalog);
                break;
            case 1:
                birdsHabitat1(catalog);
                break;
            case 2:
                birdsHabitat2(catalog);
                break;
            case 3:
                birdsHabitat3(catalog);
                break;
            case 4:
                birdsHabitat4(catalog);
                break;
            case 5:
                birdsHabitat5(catalog);
                break;
            case 6:
                birdsHabitat6(catalog);
                break;
            default:
                System.out.println("voce selecionou uma opcao invalida");
                habitatFinder(catalog);
        }
    }
    public static void birdsHabitat6(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[5])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void birdsHabitat5(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[4])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void birdsHabitat4(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[0])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void birdsHabitat3(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[0])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void birdsHabitat2(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[1])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void birdsHabitat1(Bird[] catalog) {
        for(int i = 0; i < catalog.length; i++){
            if(catalog[i].habitats[0])
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void sciNameFinder(Bird[] catalog) {
        String s = new String();
        System.out.println("Entre com o nome cientifico do passaro que voce quer pesquisar:");
        s = sc.next();
        System.out.println("");
        for (int i = 0; i < catalog.length; i++){
            String s1 = catalog[i].sciName.toUpperCase();
            String s2 = s.toUpperCase();
            if (s1.contains(s2))
                System.out.println(catalog[i].toString());
        }
        mainMenu(catalog);
    }
    public static void main(String[] args) throws IOException{
        Bird[] catalog = createCatalog();
        initiateNotes();
        System.out.println("Bem vindo ao FontanaApp\nPressione o numero correspondente a funcao desejada");
        
        mainMenu(catalog);
    }
    }