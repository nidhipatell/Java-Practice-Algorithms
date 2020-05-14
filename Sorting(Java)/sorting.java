import java.util.*;


public class sorting 
{
    public int[] array;

    void sort(int arr[])
    {
        array = arr;
        
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            int j = i -1;
            while(j >= 0 && array[j] > num)
            {
                array[j+1] = arr[j];
                j--;
            }
            arr[j+1] = num;
        }
    }

    public void printArray()
    {
        for(Integer i : array)
        {
            System.out.println(i + "");
        }
    }
    

}