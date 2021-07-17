package org.test.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.test.model.Words;

import java.util.ArrayList;
import java.util.List;

@Component
public class WordGameAlgorithm {

    private Gson gson = new Gson();

    public List<String> getArrayWords(String jsonWord){

        List<String> wordList = convertJson(jsonWord);
        List<String> listReturn = findWord(wordList);

        return listReturn;
    }

    public List<String> convertJson(String jsonWord){

        Words words = gson.fromJson(jsonWord, Words.class);
        List<String> wordList = new ArrayList<String>();
        wordList.add(words.getWord1());
        wordList.add(words.getWord2());
        wordList.add(words.getWord3());
        wordList.add(words.getWord4());
        wordList.add(words.getWord5());

        return wordList;
    }
    public List<String> findWord(List<String> wordList){

        List<String> listReturn = new ArrayList<String>();

        for(int i = 0; i < wordList.size(); i++){
            int j = i;
            String wordOne = wordList.get(j);
            if(wordOne.equals("")){
                break;
            }
            if(j == wordList.size()-1){
                listReturn.add(wordOne);
                break;
            }
            String wordTwo = wordList.get(++j);
            if(wordTwo.equals("") && j == 1){
                break;
            }
            if(wordTwo.equals("")){
                listReturn.add(wordOne);
                break;
            }

            char first = wordOne.charAt(wordOne.length()-1);
            char last = wordTwo.charAt(0);

            if(first == last){
                listReturn.add(wordOne);
            }else{
                listReturn.add(wordOne);
                break;
            }
        }
        return listReturn;
    }
}