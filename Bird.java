
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
 * sciName = nome cientifico da ave;
 * ptName = nome em portugues da ave
 * enName = nome em ingles da ave;
 * family = nome da familia da ave;
 * size = tamanho em cm medio da ave;
 * boolean[] habitats = os habitates que os passaros frequentam, sendo eles: 
 * habitats[0] = campo seco baixo;
 * habitats[1] = campo seco alto, campo sujo;
 * habitats[2] = campo alagado, campo umido, varzeas alagadas;
 * habitats[3] = campo com arvores, arbustos ou arvoretas;
 * habitats[4] = banhado com espelho dagua;
 * habitats[5] = banhado com vegetacao alta, em geral palha ou gravata, sem espelho dagua;
 */

public class Bird {
    int id;
    String sciName;
    String ptName;
    String enName;
    String family;
    int size;
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
        String s = String.format("ID: %d\nNome cientifico: %s\nNome em portugues: %s\nNome em ingles: %s\nPertence a Familia %s\nTamanho medio: %d cm\nHabitates:\n", id, sciName, ptName, enName, family, size);
        if (habitats[0])
            s = s +"campo seco baixo\n";
        if (habitats[1])
            s +="campo seco alto, campo sujo\n";
        if (habitats[2])
            s += "campo alagado, campo umido, varzeas alagadas\n";
        if (habitats[3])
            s +="campo com arvores, arbustos ou arvoretas\n";
        if (habitats[4])
            s += "banhado com espelho dagua\n";
        if (habitats[5])
            s += "banhado com vegetacao alta, em geral palha ou gravata, sem espelho dagua\n";
        return s;
    }
}