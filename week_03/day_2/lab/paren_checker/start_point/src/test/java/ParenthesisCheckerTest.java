import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesisCheckerTest {

    private ParenthesisChecker checker;

    @Before
    public void before(){

        checker = new ParenthesisChecker();
    }


    // MVP TESTS

    @Test
    public void passesForEmptyString(){
        String testString = "";
        assertTrue(checker.checkParentheses(testString));
    }
    @Test
    public void justWords(){
        String testString = "Heyyyy";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test
    public void passesWithOnePair(){
        String testString = "()";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOnlyOpening(){
        String testString = "(";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOnlyClosing(){
        String testString = ")";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void passesIfNested(){
        String testString = "(())";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOnePairLeftOpen(){
        String testString = "(()";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOnePairNotOpened(){
        String testString = "())";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void passesForMatchedParenthesesInText(){
        String testString = "test (for parentheses)";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfNoClosingBracketInText(){
        String testString = "test (for unclosed parentheses ";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfNoOpeningBracketInText(){
        String testString = "test for unopened parenthesis)";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void passesForMultipleParenthesesInText(){
        String testString = "test (for multiple) opening (and closing) brackets";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOneBracketLeftOpen(){
        String testString = "test (for multiple) opening (and closing brackets";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void failsIfOneBracketNotOpened(){
        String testString = "test (for multiple) opening and closing) brackets";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test
    public void passesForNestedBracketsInText(){
        String testString = "test for (lots of (nested)) brackets";
        assertTrue(checker.checkParentheses(testString));
    }


    // EXTENSION TESTS

    @Test

    public void passesForBraces(){
        String testString = "test {braces}";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleOpeningBrace(){
        String testString = "test {braces";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleClosingBrace(){
        String testString = "test braces}";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void passesForMultipleBraces(){
        String testString = "test {multiple} {braces}";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForNestedBraces(){
        String testString = "test { nested {braces}}";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForBrackets(){
        String testString = "test [brackets]";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleOpeningBracket(){
        String testString = "test [brackets";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleClosingBracket(){
        String testString = "test brackets}";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void passesForMultipleBrackets(){
        String testString = "test [multiple] [brackets]";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForNestedBrackets(){
        String testString = "test [ nested [braces]]";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForAngleBrackets(){
        String testString = "test <angle brackets>";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleAngleBracket(){
        String testString = "test <angle brackets";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void failsForSingleClosingAngleBracket(){
        String testString = "test angle brackets>";
        assertFalse(checker.checkParentheses(testString));
    }

    @Test

    public void passesForMultipleAngleBrackets(){
        String testString = "test <multiple> <angle brackets>";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForNestedAngleBrackets(){
        String testString = "test < nested <angle brackets>>";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void passesForCheckNestedMixedBrackets(){
        String testString = "(nested {mixture})";
        assertTrue(checker.checkParentheses(testString));
    }

    @Test

    public void failsForWronglyOrderedMixedBrackets(){
        String testString = "(nested {mixture)}";
        assertFalse(checker.checkParentheses(testString));
    }


    // WEIRD AND WONDERFUL COMBINATIONS - MAKE SURE THESE WORK TOO!

    @Test

    public void basicBraceMismatchMedium(){
        String basicBrace = "}{{}}{{}{}}{";
        assertFalse(checker.checkParentheses(basicBrace));
    }

    @Test

    public void basicRoundMismatchMedium(){
        String basicRound = ")(())(()())(";
        assertFalse(checker.checkParentheses(basicRound));
    }

    @Test

    public void basicBraceMismatchLarge(){
        String basicBrace = "}ajkkjad{awd{awd}ad}--{{}jjvv8{aw}awd}awd{awd";
        assertFalse(checker.checkParentheses(basicBrace));
    }

    @Test

    public void basicRoundMismatchLarge(){
        String basicRound = ")ajkkjad(awd(awd)ad)--(()jjvv8(aw)awd)awd(awd";
        assertFalse(checker.checkParentheses(basicRound));
    }

    @Test

    public void basicRoundMatchLarge(){
        String basicRound = ")ajkkjad(awd(awd)ad)--(()jjvv8(aw)awd)awd(awd)";
        assertFalse(checker.checkParentheses(basicRound));
    }

    @Test

    public void basicBraceMatchLarge(){
        String basicBrace = "}ajkkjad{awd{awd}ad}--{{}jjvv8{aw}awd}awd{awd}";
        assertFalse(checker.checkParentheses(basicBrace));
    }

    @Test

    public void comboRoundBraceMatch(){
        String comboRoundBrace = "({})";
        assertTrue(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void comboRoundBraceMismatch(){
        String comboRoundBrace = "({}{)";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void comboRandomMismatch(){
        String comboRoundBrace = "(awdawd{----}..'{awdawdawd)";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void comboRandomMatchSmall(){
        String comboRoundBrace = "({)}";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void comboRandomTryingToBreak(){
        String comboRoundBrace = "(({{))}}";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void comboRoundMatchBraceDoesnt(){
        String comboRoundBrace = "(}(}{))";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void simpleComboBraceRound(){
        String comboRoundBrace = "(}";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }

    @Test

    public void simpleComboBraceRoundMultiple(){
        String comboRoundBrace = "(}(}(}(}";
        assertFalse(checker.checkParentheses(comboRoundBrace));
    }




}
