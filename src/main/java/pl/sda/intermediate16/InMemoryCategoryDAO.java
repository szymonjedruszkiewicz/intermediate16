package pl.sda.intermediate16;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InMemoryCategoryDAO {

    private void loadCategoriesFromFile(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        URI uri = null;
        try {
            uri = classLoader.getResource("kategorie.txt").toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
