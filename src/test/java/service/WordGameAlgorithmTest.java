package service;

import org.junit.Test;
import org.mockito.Mockito;
import org.test.service.WordGameAlgorithm;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class WordGameAlgorithmTest {

    @Test
    public void findWordTestOne(){

        List<String> wordList = new ArrayList<>();
        wordList.add("fish");
        wordList.add("horse");
        wordList.add("egg");
        wordList.add("goose");
        wordList.add("eagle");

        WordGameAlgorithm wordGameAlgorithm = new WordGameAlgorithm();
        WordGameAlgorithm mockWordGameAlgorithm = mock(WordGameAlgorithm.class);

        List<String> wordReturn = wordGameAlgorithm.findWord(wordList);

        Mockito.when(mockWordGameAlgorithm.findWord(wordList)).thenReturn(wordList);
        assertEquals(mockWordGameAlgorithm.findWord(wordList).toString(), wordReturn.toString());
    }

    @Test
    public void findWordTestTwo(){

        List<String> wordList = new ArrayList<>();
        wordList.add("fish");
        wordList.add("horse");
        wordList.add("snake");
        wordList.add("goose");
        wordList.add("eagle");

        WordGameAlgorithm wordGameAlgorithm = new WordGameAlgorithm();
        WordGameAlgorithm mockWordGameAlgorithm = mock(WordGameAlgorithm.class);

        List<String> wordReturn = new ArrayList<String>();
        wordReturn.add("fish");
        wordReturn.add("horse");

        Mockito.when(mockWordGameAlgorithm.findWord(wordList)).thenReturn(wordReturn);
        assertEquals(mockWordGameAlgorithm.findWord(wordList).toString(),
                wordGameAlgorithm.findWord(wordList).toString());
    }

    @Test
    public void findWordTestThree(){

        List<String> wordList = new ArrayList<>();
        wordList.add("fish");
        wordList.add("horse");
        wordList.add("");
        wordList.add("goose");
        wordList.add("eagle");

        WordGameAlgorithm wordGameAlgorithm = new WordGameAlgorithm();
        WordGameAlgorithm mockWordGameAlgorithm = mock(WordGameAlgorithm.class);

        List<String> wordReturn = new ArrayList<String>();
        wordReturn.add("fish");
        wordReturn.add("horse");

        Mockito.when(mockWordGameAlgorithm.findWord(wordList)).thenReturn(wordReturn);
        assertEquals(mockWordGameAlgorithm.findWord(wordList).toString(),
                wordGameAlgorithm.findWord(wordList).toString());
    }

    @Test
    public void findWordTestFour(){

        List<String> wordList = new ArrayList<>();
        wordList.add("");
        wordList.add("horse");
        wordList.add("");
        wordList.add("goose");
        wordList.add("eagle");

        WordGameAlgorithm wordGameAlgorithm = new WordGameAlgorithm();
        WordGameAlgorithm mockWordGameAlgorithm = mock(WordGameAlgorithm.class);

        List<String> wordReturn = new ArrayList<String>();

        Mockito.when(mockWordGameAlgorithm.findWord(wordList)).thenReturn(wordReturn);
        assertEquals(mockWordGameAlgorithm.findWord(wordList).toString(),
                wordGameAlgorithm.findWord(wordList).toString());

    }
}
