import java.util.*;

public class Queue
{
    int t;
    int[] arr;

    public Queue()
    {
        arr = new int[100];
        t = 0;
    }

    public void enque(int n)
    {
        arr[t] = n;
        t = t + 1;
    }

    public int deque()
    {
        int itemReturn = arr[0];
        for(int i = 0; i < t; i++)
        {
            arr[i] = arr[i+1];
        }
        t--;
        
        return itemReturn;
    }
    public int size()
    {
        return t;
    }
    public int front()
    
    {
        return arr[0];
    }
    public boolean isEmpty()
    {
        return(t==0) ? true : false;
    }

    public void see()
    {
        System.out.println("The Queue is:");
        for(int i=0; i <t; i++)
        {
            System.out.println(arr[i]);
        }
    }
}