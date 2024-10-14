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
public class Ps_1 
{
    public static int maxSum(int []a)
    {
        int sum=0,max_sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = a[i];
            for(int j=i+1;j<a.length;j++)
            {
                if(i!=j)
                {
                    sum += a[j];
                }
                if(max_sum<sum)
                    max_sum = sum;
            }
        }
        return max_sum;
    }
    public static void main(String args[])
    {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sum is:- "+maxSum(nums));
    }
}
