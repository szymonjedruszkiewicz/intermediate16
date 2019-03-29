package pl.sda.intermediate16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OnlyOneController { //ta klasa pozwala kontaktować się przeglądarce z naszą aplikacją

    CategorySearchService categorySearchService = new CategorySearchService();


    @ResponseBody
    @RequestMapping("/")
    public String ok (){
        return "OK:*";
    }

    @RequestMapping("/categories") //pod takim urlem dostępna jest strona z kategoriami
    public String categories(String searchText, Model model){
        model.addAttribute("catsdata", categorySearchService.filterCategories(searchText));
        return "catspage";
    }
}