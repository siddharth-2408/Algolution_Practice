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
public class Ps_5 
{
    public int findTotal(int []a)
    {
        int sum =0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        return sum;
    }
    public int findEquiIndex(int []a,int total)
    {
        int leftsum=0;
        for(int i=0;i<a.length;i++)
        {
            total = total - a[i];
            if(leftsum == total)
                return i+1;
            leftsum += a[i];
        }
        return -1;
    }
    public static void main(String []args)
    {
        int nums[] = {1,2,3};
        Ps_5 obj = new Ps_5();
        int totalsum = obj.findTotal(nums);
        System.out.println("Equilibrium Index is:- "+obj.findEquiIndex(nums,totalsum));
    }
}
