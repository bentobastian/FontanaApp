import java.util.Arrays;
import javax.naming.SizeLimitExceededException;

/**
 * Classe Bird cria o objeto Bird com propriedades descritas no Livro para execucao do programa.
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author vicente.ferreira@edu.pucrs.br
 * @author thales.dias@edu.pucrs.br
 * @author 
 * 
 * @version 20220626
 * 
 * boolean[] habitats representas os habitates que os passaros frequentam, sendo eles: 
 * habitats[0] = campo seco baixo;
 * habitats[1] = campo seco alto, campo “sujo”;
 * habitats[2] = campo alagado, campo umido, varzeas alagadas;
 * habitats[3] = campo com arores, arbustos ou arvoretas;
 * habitats[4] = banhado com espelho dagua;
 * habitats[5] = banhado com vegetacao alta, em geral palha ou gravata, sem espelho dagua;
 */

public class Bird {
    private int id;
    private String sciName;
    private String ptName;
    private String enName;
    private String family;
    private int size;
    boolean[] habitats;

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
        return String.format("ID: %d\nNome cientifico: %s\nNome em portugues: %s\nNome em ingles: %s\nPertence a Familia %s\nPossui tamanho: %d cm\n", id, sciName, ptName, enName, family, size);
    }
}