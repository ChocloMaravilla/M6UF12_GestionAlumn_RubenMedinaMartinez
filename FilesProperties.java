import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FilesProperties {
    public void main(String[] args) {
        Properties propiedades = new Properties();
        InputStream inputt = null;
        try {
            inputt = new FileInputStream("credendiales.properties");
            propiedades.load(inputt);
            propiedades.getProperty("nombre");
            System.out.println(propiedades.getProperty("Name"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
