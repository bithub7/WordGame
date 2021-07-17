package org.test.controllers;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.test.model.Words;
import org.test.service.WordGameAlgorithm;

import java.util.List;

@Controller
public class WordsController {

    @Autowired
    private WordGameAlgorithm wordGameAlgorithm;
    private Gson gson = new Gson();

    @GetMapping()
    public String wordsInput(Model model){
        model.addAttribute("words", new Words());
        return "words_input";
    }

    @PostMapping("/words_view")
    public String view(@ModelAttribute("words") Words words, Model model){
        String jsonWord = gson.toJson(words);
        List<String> arr = wordGameAlgorithm.getArrayWords(jsonWord);
        model.addAttribute("arrWords", arr);
        return "words_view";
    }
}
