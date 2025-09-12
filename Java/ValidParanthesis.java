package Java;
import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        
        String braces = "({[()]})()";
        Stack<Character> stack = new Stack<>();

        boolean ans = isValid(braces,stack);

        System.out.println(ans);
    }

    public static boolean isValid(String braces,Stack<Character> stack){

        for(char ch : braces.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char ele = stack.pop();

                if((ele == '(' && ch != ')') || (ele == '{' && ch != '}') || (ele == '[' && ch != ']')){
                    return false;
                }
            }
        }

        return stack.isEmpty() == true;


    }
}
