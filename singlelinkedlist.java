import java.util.*;

/** singlelinkedlist list = new singlelinkedlist();
list.addFirst(5)
list.addFirst(6) */

public class singlelinkedlist
{
    Node head;
    Node tail;
    int counter = 0;
    int p; 

    public singlelinkedlist()
    {
        //do nothing
    }

    public void addFirst(Object data)
    {
        if(head == null)
        {
            //head = new Node(data)
            head = new Node();
            head.setElement(data);
        }
        else
        {
            Node temp = new Node();
            temp.setElement(data);
            head = temp;
        }
        counter = counter+1;
    }
    public Object removeFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return "";
        }
        else
        {
            Node t = head;
            head = head.getNext();
            t.setNext(null);
            counter--;
            return t.getElement();
        } 
    }
    public void addLast(Object data)
    {
        if(head == null)
        {
            //head = new Node(data)
            head = new Node();
            head.setElement(data);
        }
        else
        {
            Node n = new Node(data);
            Node p = head;
            if(p != null)
            {
                while(p.getNext() != null)
                {
                    p = p.getNext();
                } 
            p.setNext(n);        
            }
        }
        counter++;
    }
    public Object removeLast()
    {
        if(head == null)
        {
            System.out.println("List is empty!");
        }
        if(head.getNext() == null)
        {
            counter--;
            return head.getElement();
        }
        else
        {
            Node hold = head;
            while(hold.getNext().getNext() != null)
            {
                hold = hold.getNext();    
            }
            Node last = hold.getNext();
            hold.setNext(null);
            counter--;
            return last.getElement();
        }
    }

    public Object getFirst()

    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return "";
        }
        else
            return head.getElement();
    }

    public Object getLast()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return "";
        }
        else
        {
            Node hold = head;
            while(hold.getNext().getNext() != null)
                hold = hold.getNext();
            Node last = hold.getNext();
            return last.getElement();
        }
    }

    public int size()
    {
        return counter;
    }

    public String recursivePrint(Node node, String ans)
    {
        if(node.getNext() == null)
            return ans += node.getElement();
        return recursivePrint(node.getNext(), ans += node.getElement() + (node.getNext() == null ? "" : "->"));
    }

    public String toString()
    {
        String ans = "";
        Node temp = head;
        return (recursivePrint(temp, ans));
    }

    public class Node 
    {
        Object element;
        Node next;

        public Node()
        {
            this(null,null);
        }

        public Node(Object elementValue)
        {
            element = elementValue;
            next = null;
        }

        public Node(Object elementvalue, Node nextvalue)
        {
            element = elementvalue;
            next = nextvalue;
        }
        public Object getElement()
        {
            return element;
        }
        public Node getNext()
        {
            return next;
        }
        public void setElement(Object newElem)
        {
            element = newElem;
        }
        public void setNext(Node newNext)
        {
            next = newNext;
        }
    }
    
}
