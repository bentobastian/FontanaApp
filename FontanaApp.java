import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * FontanaApp eh um app criado para estudar objetos e rotinas em Java para aula de Fundamentos de Programcao.
 * Consiste em um programa que le um catalogo de aves e faz anotacoes para a ornitologia (estudo das aves).
 *
 * @author bento.bastian@edu.pucrs.br
 * @author lucas.sasada@edu.pucrs.br
 * @author 
 * @author 
 * @author 
 * 
 * @version 20220626
 */

public class FontanaApp{
    public static void main(String[] args) throws IOException{
        Bird[] catalog = createCatalog();
        for(int i = 0; i < 188; i++)
            if(catalog[i] != null) 
                System.out.println(catalog[i]);
    }
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
    public static void searchHabitat(String line){
        String[] habitatNum = line.split(",");
        
    }
}               