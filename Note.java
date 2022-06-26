
/**
 * Write a description of class Note here.
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author vicente.ferreira@edu.pucrs.br
 * @author thales.dias@edu.pucrs.br
 * @author 
 * 
 * @version 20220626
 */

public class Note {
    Bird bird;
    String local;
    int month;
    int year;
    int day;
    
    public Note (Bird bird, String local, int day,int month,int year){
        this.bird = bird;
        this.local = local;
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public String toString(){
        return String.format("%sLocal: %s\nData: %d/%d/%d\n\n", bird.toString(), local, day, month, year);
    }
    
    // public static void initiateNotes(){
    //     String path = "Notes.txt";
    //     File notes = new File (path);
        
    //     try{
    //     if (!notes.exists()) {
    //     notes.createNewFile();
    //     System.out.println("Arquivo criado: " + notes.getName());
    //     } else {
    //     System.out.println("Notes ja existe.");
    //     }
    
    //     }
    //     catch(IOException e){
    //     }
    
    // }
    // public static void addNotes(){
    //     String path = "Notes.txt";
    //     File notes = new File ("Notes.txt");
    //     int addid;

    //     try{
    //     Scanner addsc = new Scanner(System.in);
    //     File add = new File(path);
    //     FileWriter fw = new FileWriter(add, true);
    //     BufferedWriter bw = new BufferedWriter(fw);
    //     PrintWriter pw = new PrintWriter(bw);
    //     System.out.println("Identifique a Ave com o ID");
    //     addid = addsc.nextInt();
    //     System.out.println("Digite o Local");
    //     local = addsc.nextLine();//ok
    //     System.out.println("Digite a Data");
    //     System.out.println("Dia");
    //     day = addsc.nextInt();
    //     System.out.println("Mes");
    //     month = addsc.nextInt();
    //     System.out.println("Ano");
    //     year = addsc.nextInt();
        
    //     pw.printf("Ave: %s%nLocal: %s%nData: %d/%d/%d. %n%n",catalog[addid].toString(),local,day,month,year);
    //     pw.close();
    //     bw.close();
    //     fw.close();
    //     addsc.close();
        
    //     }
    //     catch(IOException e){
    //     }
    // }
}