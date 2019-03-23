package pl.sda.intermediate16;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InMemoryCategoryDAO {

    private List<Category> categoryList = new ArrayList<>();

    private List<String> loadCategoriesFromFile() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URI uri = null;
        try {
            uri = classLoader.getResource("kategorie.txt").toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri));
            return lines;
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void initializeCategories() {
        List<String> categoriesFromFile = loadCategoriesFromFile();
        AtomicInteger counter = new AtomicInteger(1);
        List<Category> categories = categoriesFromFile.stream()
                .map(s -> {
                    Category category = new Category();
                    category.setCategoryName(s);
                    category.setId(counter.getAndIncrement());
                    return category;
                })
                .collect(Collectors.toList());
    }

}
