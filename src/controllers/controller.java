package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controller {
    @GetMapping("/lookup")
    public String lookup() {

        return "/dictionary";
    }

    @GetMapping("/search")
    public String search(@RequestParam String word, Model model) {
        DictionaryData data = new DictionaryData();
        String result = data.getWord(word);
        model.addAttribute("result", result);
        model.addAttribute("word", word);
        return "/dictionary";
    }

    @GetMapping("/addNew")
    public String add(@RequestParam String newWord, String vietnamWord, Model model) {
        DictionaryData data = new DictionaryData();
        String resultAdd="";
        model.addAttribute("newWord", newWord);
        model.addAttribute("vietnamWord", vietnamWord);
        if (data.addNewWord(newWord, vietnamWord)) {
            resultAdd = "OK";
        } else {
            resultAdd = "That word existed";
        }
        model.addAttribute("resultAdd", resultAdd);
        return "/dictionary";
    }

}
