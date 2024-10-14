/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.PriorityQueue;
/**
 *
 * @author rajes
 */
public class Ps_3 
{
    public int findKthLargest(int []nums,int k) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for(int num:nums) 
        {
            // Adding element
            minHeap.offer(num);//minHeap.add(num) bhi chalega;

            // If the heap size exceeds k, remove the smallest element (the root)
            if(minHeap.size()>k) 
            {
                minHeap.poll(); // //Smallest element ko remove kardo taaki heap ka size k se exceed na ho;
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) 
    {
        Ps_3 sol = new Ps_3();
        int[] a = {3, 2, 1, 5, 6, 4};
        int k = 10;
        if(k>a.length)
        {
            System.out.println("Kya yaar Element to "+a.length+" hi hai aur tere ko "+k+" largest chahiye");
            return;
        }    
        System.out.println("The "+k+" largest element is: "+sol.findKthLargest(a, k));
    }
}
