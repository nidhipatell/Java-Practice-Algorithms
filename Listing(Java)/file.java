public class file
{
    public static singlyLinkedList mylist;

    public static void main(String[] args)
    {
        mylist = new singlyLinkedList();

        Object t = mylist.removeFirst();
        System.out.println(t);

        Object r = mylist.removeLast();
        System.out.println(r);

        Object g = mylist.getFirst();
        System.out.println(g);

        Object k = mylist.getLast();
        System.out.println(k);

        System.out.println(mylist.size());

        mylist.addFirst(5);
        mylist.addFirst(4);
        mylist.addFirst(3);
        mylist.addFirst(2);
        mylist.addFirst(1);
        mylist.addLast(6);


        System.out.println("The mylist is :\t"+ mylist);
        //mylist.callrecur();

        Object c = mylist.removeFirst();
        System.out.println(c);

        Object d = mylist.removeFirst();
        System.out.println(d);

        System.out.println("The mylist is:\t" + mylist);

        Object a = mylist.removeLast();
        System.out.println(a);

        System.out.println("The mylist is:\t" + mylist);

        mylist.addLast(69);

        System.out.println("The mylist is:\t" + mylist);

        mylist.addFirst(420);

        System.out.println("The mylist is:\t" + mylist);

        System.out.println(mylist.getFirst());

        System.out.println("The mylist is:\t" + mylist);

        mylist.addLast(42069);

        System.out.println("The mylist is:\t" + mylist);

        Object i = mylist.getLast();

        System.out.println(i);

        System.out.println("The list is:\t" + mylist);

        System.out.println(mylist.size());
    }
}