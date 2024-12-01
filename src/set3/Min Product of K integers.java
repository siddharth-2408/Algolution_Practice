/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author rajes
 * 
 */
public class Ps_10 
{
    public int minProduct(int []nums,int k) 
    {
        int result = 1;
        for(int i=0;i<k;i++)
        {
            result *= nums[i];
        }
        return result;
    }
    public static void main(String args[])
    {
        Ps_10 obj = new Ps_10();
        int nums[] = {11,8,5,7,5,100};
        Arrays.sort(nums);
        System.out.println(obj.minProduct(nums,4));
    }
}
