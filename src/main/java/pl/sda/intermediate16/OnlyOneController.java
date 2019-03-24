package pl.sda.intermediate16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OnlyOneController {

    CategorySearchService categorySearchService = new CategorySearchService();

    @RequestMapping("/categories")
    public String categories(String searchText, Model model){
        model.addAttribute("catsdata", categorySearchService.filterCategories(searchText));
        return "catspage";
    }




}
