import main.java.parsers.StringParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringParserTest {

    @Test
    public void getTextBetweenStringTest(){
        String testString = "abcOUTPUT_TEXTdef";
        Assertions.assertEquals(
                StringParser.getTextBetweenString(testString, "abc", "def"),
                        "OUTPUT_TEXT",
                        "Text between two string was found incorrectly");
    }

    @Test
    public void countNumberOfFirstSymbolInStringTest(){
        String testString = "1231231145";
        Assertions.assertEquals(
                StringParser.countNumberOfFirstSymbolInString(testString),
                4,
                "Occurrences number of first symbol in string was found incorrectly");
    }

    @Test
    public void removeFirstSymbolFromStringTest(){
        String testString = "qwerty";
        Assertions.assertEquals(StringParser.removeFirstSymbolFromString(testString),
                "werty",
                "First symbol from string was removed incorrectly");
    }
}
