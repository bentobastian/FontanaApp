
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
    private Bird bird;
    private String local;
    private int day;
    private int month;
    private int year;
    
    public Note (Bird bird, String local, int day, int month, int year){
        this.bird = bird;
        this.local = local;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}