import java.util.*;

class Queue
{
    public singlelinkedlist merge;

    public Queue()
    {
        merge = new singlelinkedlist();
    }

    public int size()
    {
        return merge.size();
    }
    public boolean isEmpty()
    {

        if(merge.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int first()
    {
        Object c;
        c = merge.getFirst();
        return (int)c;
    }
    public Object front()
    {
        if(isEmpty())
        {
            System.out.println("The list is empty");
            return ""; 
        }
        else 
        {
            return (int)merge.head.getElement();
        }
    }
    public void Enqueue(int x)
    {
        merge.addFirst(x);
    }
    public int dequeue()
    {
        return (int)merge.removeFirst();
    }
    public void print()
    {
        System.out.println("The list is" + merge);
    }
}

public class mergelist
    {
        public static void main(String[] args)
        {
            List<Integer> list1 = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();

            Scanner sc = new Scanner(System.in);
            int i = 0;
            int j = 0;
            Queue q1 = new Queue();
            Queue q2 = new Queue();
            Queue q3 = new Queue();
            int n;
            int p;
            int total;

            System.out.println("enter numbers for list one:");
            while(i >= 0)
            {
                i = sc.nextInt();
                list1.add(i);
            }
            list1.remove(list1.size() - 1);
            
            System.out.println("enter numbers for list two:");
            while(j >= 0)
            {
                j = sc.nextInt();
                list2.add(j);
            }
            list2.remove(list2.size() - 1);

            list1.sort(null);
            list2.sort(null);

            for(int z = 0; z < list1.size(); z++)
            {
                q1.Enqueue(list1.get(z));
            }
            for(int u = 0; u < list2.size(); u++)
            {
                q2.Enqueue(list2.get(u));
            }
            
            while(q1.size() != 0 && q2.size() != 0)
            {
                n = q1.first();
                p = q2.first();

                if(n > p)
                {
                    q3.Enqueue(p);
                    p = (int)q2.dequeue();
                    
                }
                else
                {
                    q3.Enqueue(n);
                    n = (int)q1.dequeue();
                }
            }

            while(q1.size() != 0)
            {
                n = (int)q1.dequeue();
                q3.Enqueue(n);
            }
            while(q2.size() != 0)
            {
                p =(int)q2.dequeue();
                q3.Enqueue(p);
            }
            q3.print();
    
        }
    }