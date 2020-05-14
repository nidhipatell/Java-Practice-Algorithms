import java.util.*;

public class Quicksort
{
    public int [] arr;


    public void inPlaceQuicksort(int [] S, int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int pivot = S[end];
        int left = start;
        int right = end - 1; 

        while(left <= right)
        {
            while(left <= right && S[left] <= pivot)
            {
                left = left + 1;
            }

            while(left <= right && S[right] >= pivot)
            {
                right = right - 1;
            }

            if(left < right)
            {
                int temp = S[left];
                S[left] = S[right];
                S[right] = temp;
            }
        }
        int temp2 = S[left];
        S[left] = pivot;
        S[end] = temp2;
        inPlaceQuicksort(S, start, left - 1);
        inPlaceQuicksort(S, left + 1, end);
        arr = S;
        
    }
    
    public void printArr()
    {
        for(Integer i: arr)
        {
            System.out.println(i + "");
        }
    }

}