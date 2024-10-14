/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;

import java.util.ArrayList;

/**
 *
 * @author rajes
 */
public class Ps_3 
{
    public static int findMax(int a[],int start,int end)
    {
        int max = 0;
        for(int i=start;i<=end;i++)
        {
            if(max<a[i])
                max = a[i];
        }
        return max;
    }
    public ArrayList<Integer> listMax(int []a,int window)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=0;i<a.length-window+1;i++)
        {
            l1.add(findMax(a,i,i+window-1));
        }
        return l1;
    }
    public static void main(String args[])
    {
        int nums[] = {20,10,30};
        int k = 1;
        Ps_3 obj = new Ps_3();
        ArrayList<Integer> l1 = obj.listMax(nums,k);
        System.out.println(l1.toString());
    }
}
