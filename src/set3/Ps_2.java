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
public class Ps_2 
{
    public int Or(int nums[])
    {
        int result = 0,fresult=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                result = nums[i];
                for(int j=i;j<nums.length;j++)
                {
                    result = result|nums[j];
                    fresult = fresult|result;
                }
            }
            else
            {
                result = nums[i];
                for(int j=i+1;j<nums.length;j++)
                {
                    result = result|nums[j];
                    fresult = fresult|result;
                }
            }
        }
        return fresult;
    }
    public static void main(String args[])
    {
        int nums[] = {1,4,6};
        Ps_2 obj = new Ps_2();
        System.out.println(obj.Or(nums));
    }
}
