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
public class Ps_6 
{
    public String sumPair(int []a,int sum)
    {
        int front=0,temp=0;
        int rear= a.length-1;
        while(front<=rear)
        {
            temp = a[front]+a[rear];
            if(temp == sum)
                return "Yes";
            else if(temp<sum)
                front++;
            else
                rear--;
        }
        return "No";
    }
    public static void main(String args[])
    {
        int nums[] = {1,2,4,5,7,11};
        int sum = 9;
        Ps_6 obj = new Ps_6();
        System.out.println(obj.sumPair(nums,sum));
    }
}
