
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
    private int date;
    
    public Note (Bird bird, String local, int date){
        this.bird = bird;
        this.local = local;
        this.date = date;
    }
}