/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;

/**
 *
 * @author rajes
 */
public class Ps_6 
{
    public int canBePalindrome(String s,int count)
    {
        if(isPalindrome(s))
            return 0;
        else
        {
            boolean b;
            char front = s.charAt(0);
            char rear = s.charAt(s.length()-1);
            if(isPalindrome(rear + s.substring(0, s.length()-1)))
                return count+1;
            else
            {
                if(isPalindrome(s.substring(1, s.length())+front))
                    return count+1;
            }
        }
        return -1;
    }
    public boolean isPalindrome(String s)
    {
        int front=0;
        int rear=s.length()-1;
        while(front<=rear)
        {
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
    public static void main(String args[])
    {
        String s = "baaabbb";
        Ps_6 obj = new Ps_6();
        System.out.println(obj.canBePalindrome(s,0));
    }
}
