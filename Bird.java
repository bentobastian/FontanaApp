
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        return String.format("%s %s", sciName, ptName);
    }
}