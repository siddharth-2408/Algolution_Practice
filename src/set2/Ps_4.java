/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;

/**
 *
 * @author rajes
 */
public class Ps_4 
{
    public static boolean isPalindrome(String s) 
    {
        int rear = s.length()-1;
        int front = 0;
        while (front <= rear) 
        {
            while (front < rear && !Character.isLetterOrDigit(s.charAt(front))) {
                front++;
            }
            
            while (front < rear && !Character.isLetterOrDigit(s.charAt(rear))) {
                rear--;
            }

            char frontChar = Character.toLowerCase(s.charAt(front));
            char rearChar = Character.toLowerCase(s.charAt(rear));

            if (frontChar != rearChar) 
            {
                return false;
            }
            front++;
            rear--;
        }
        return true;
    }
    
    public static void main(String []args)
    {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("String is Palindrome:- "+isPalindrome(s));
    }
}
