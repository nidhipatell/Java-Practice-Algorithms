import java.util.Scanner;

public class Merge
{
    public static Queue s1 = new Queue();
    public static void merge(Queue A, Queue B, Queue s1)
    {
       // Queue s1 = new Queue();

        while(!A.isEmpty() && (B.isEmpty() == false))
        {
            if(A.front() < B.front())
            {
                s1.enque(A.deque());
            }
            else
            {
                s1.enque(B.deque());
            }
        }
        while(!A.isEmpty())
        {
            s1.enque(A.deque());
        }
        
        while(!B.isEmpty())
        {
            s1.enque(B.deque());;
        }

    }
    public static void mergesort(Queue S)
    {
        int size = S.size();
        if(size > 1)
        {
            Queue left = new Queue();
            Queue right = new Queue();
            for(int i = 0; i < size/2; i++)
            {
                left.enque(S.deque());
            }
            for(int j = size/2+1; j < size; j++)
            {
                right.enque((S.deque()));
            }
            mergesort(left);
            mergesort(right);
            merge(left, right, S);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Queue q1 = new Queue();
        
        System.err.println("Enter number of numbers to imput:");
        int man_num = sc.nextInt();

        for(int i = 0; i<man_num; i++)
        { 
            /** best case and worst case is: nlogn  */
            q1.enque(sc.nextInt());
        }
        System.out.println("q1: " + man_num);
        q1.see();

        mergesort(q1);

        q1.see();
    }
}