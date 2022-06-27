
/**
 * Classe cria um objeto Note, com parametros desejados pelo ornitologo como a ave em questao, local e data
 * 
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

    /**
     * 
     */
    public Note (Bird bird, String local, int day,int month,int year){
        this.bird = bird;
        this.local = local;
        this.month = month;
        this.year = year;
        this.day = day;
    }

    
    /**
     * 
     */
    public String toString(){
        return String.format("%sLocal: %s\nData: %d/%d/%d\n\n", bird.toString(), local, day, month, year);
    }
}