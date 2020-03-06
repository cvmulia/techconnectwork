import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesisChecker {
    /*
    PSEUDO CODE

    make an empty stack of Chars - {

    loop through the string
        if we find an opening bracket at the element we are on
        push that bracket to the stack

        if we find a closing bracket at the element we are on
             if the stack is empty
                return false - INVALID
            else
                 pop a bracket from the stack

    if stack is empty, return true - VALID
    if stack isn't empty, return false - INVALID


     */

    private Stack<Character> unmatchedCharacters;

    public ParenthesisChecker(){
        unmatchedCharacters = new Stack<>(); //
    }

    public boolean checkParentheses(String testString) {

        List<Character> openingCharacters = Arrays.asList('(', '{', '[', '<');
        List<Character> closingCharacters = Arrays.asList(')', '}', ']', '>');

        char[] brokenString = testString.toCharArray(); // breaking String to character

        for (Character character : brokenString){

            if (openingCharacters.contains(character)){
                unmatchedCharacters.push(character);
            }
            else if (closingCharacters.contains(character)){

                int indexToCheck = closingCharacters.indexOf(character); // finding the corresponding character, not dealing with the stack

                char correspondingOpeningCharacter = openingCharacters.get(indexToCheck); // finding character in the list

                if (unmatchedCharacters.isEmpty() || !unmatchedCharacters.peek().equals(correspondingOpeningCharacter)) {
                    return false;
                }
                else {
                    unmatchedCharacters.pop();
                }
            }
        }

        return unmatchedCharacters.isEmpty();
    }




}
