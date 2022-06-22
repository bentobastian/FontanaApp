import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class FontanaApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FontanaApp{
    public static void main(String[] args) throws IOException{
        Bird[] catalog = createCatalog();
        System.out.println(catalog[0]);
    }
    public static Bird[] createCatalog() throws IOException{
        Bird[] catalog = new Bird[188];
        BufferedReader r = new BufferedReader(new FileReader("catalog.txt"));
        int i = 0;
        String line = r.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                catalog[i] = createBird(attributes);
                line = r.readLine();
                i++;
            }
        r.close();
        return catalog;
    }
    public static Bird createBird(String[] attributes){
        int id = Integer.parseInt(attributes[0]);
        int size = Integer.parseInt(attributes[5]);
        Boolean[] habitats = new Boolean[6];
        for(int i = 0; i < 6; i++){
            if (attributes[i+6] == "1")
            habitats[i] = true;
            else habitats[i] = false;
        }
            //habitats[i] = attributes[i+6] == "1" ? habitats[i] = true : false;
        return new Bird(id, attributes[1], attributes[2], attributes[3], attributes[4], size, habitats);
    }
}               