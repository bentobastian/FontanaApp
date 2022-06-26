import java.util.Arrays;

/**
 * Classe Bird cria o objeto Bird com propriedades descritas no Livro para execucao do programa.
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author vicente.ferreira@edu.pucrs.br
 * @author 
 * @author 
 * 
 * @version 20220626
 * 
 * boolean[] habitats representas os habitates que os passaros frequentam, sendo eles: 
 * habitats[0] = campo seco baixo;
 * habitats[1] = campo seco alto, campo “sujo”;
 * habitats[2] = campo seco alto;
 * habitats[1] = campo seco alto;
 * habitats[1] = campo seco alto;
 * habitats[1] = campo seco alto;
 */

public class Bird {
    private int id;
    private String sciName;
    private String ptName;
    private String enName;
    private String family;
    private int size;
    private boolean[] habitats;

    public Bird(int id, String sciName, String ptName, String enName, String family, int size, boolean[] habitats){
        this.id = id;
        this.sciName = sciName;
        this.ptName = ptName;
        this.enName = enName;
        this.family = family;
        this.size = size;
        this.habitats = habitats;
    }

    public String toString(){
        return String.format("%s %s %s", habitats, ptName, Arrays.toString(habitats));
    }
}