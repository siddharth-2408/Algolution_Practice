/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;
import java.util.Stack;

/**
 *
 * @author rajes
 */
public class Ps_4 
{
    public boolean isValid(String s)
    {
        if(s.length()<= 1||s.length()%2!=0) 
            return false;
        else if(s.charAt(0)==')')
            return false;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++) 
        {
            char current = s.charAt(i);
            if(current=='(') 
            {
                stack.push(current);
            } 
            else if(current==')') 
            {
                if(stack.isEmpty()) 
                {
                    return false;                  
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []args)
    {
        Ps_4 obj = new Ps_4();
        String s ="()(())()";
        System.out.println(obj.isValid(s));
    }
}
