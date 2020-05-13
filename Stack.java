import java.util.*;

public class Stack
{
    public static int t= 0; // global variables
    public static singlelinkedlist array;
    public static boolean end = false;

    public static void show()
    {
       System.out.println("the list is: "+ array);
    }
    public static int size() 
    {
        return array.size(); // size of the how many brackets there are
    }
    
    public static void push(char brackets) 
    // takes the type of bracket and puts it at location array[t]
    {
           array.addFirst(brackets); 
    }

    public static boolean isEmpty() 
    // checks if t is empty
    {
        if(array.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void top() 
    // checks if its empty and if it is then it prints empty other wise it returns the character 
    {
        if(isEmpty())
        {
            System.out.println("Empty");
        }
    }

    public static char pop()
    {
        // checks if its empty and if it is empty then it prints empty
        if(isEmpty())
        {
            System.out.println("Empty");
            return 0;
        }
        else
        { 
            Object c = array.removeFirst();
            return (char)c;
        }
    }

    public static void main(String[] args)
    {
        boolean flag2 = false; // flag is false
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your brackets");
        String brackets = sc.nextLine();
        
        array = new singlelinkedlist(); // an array
       
        
        for(int i = 0; i < brackets.length();i++) // for loop that if i is less than the lengths of the backets then
        {
            if(brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[')
            {
                // is charAt i == the different types of opening brackets then the pushes the function
                push(brackets.charAt(i));
                end = false;
            }
            else if(brackets.charAt(i) == ')' || brackets.charAt(i) == '}' || brackets.charAt(i) == ']') 
            // else if the brackets at charat equals the closing bracket then 
            {
                
                end = true; 
                char z; 

                if(isEmpty())
                {
                    System.out.println("it's Empty!");
                    return;
                }

                if(brackets.charAt(i) == ')')
                {
                    z = pop();
                    if(z == '(')
                    {
                        System.out.println("Matched");
                        flag2 = true;
                    }
                    else
                    {
                        System.out.println("not matched");
                        flag2 = false;
                        break;
                    }
                }
                if(brackets.charAt(i) == '}')
                {
                    z = pop();
                    if(z == '{')
                    {
                        System.out.println("matched");
                        flag2 = true;
                    }
                    else 
                    {
                        System.out.println("not matched");
                        flag2 = false;
                        break; 

                    }
                }
                if(brackets.charAt(i) == ']')
                {
                    z = pop();
                    if(z == '[')
                    {
                        System.out.println("matched");
                        flag2 = true;
                    }
                    else 
                    {
                        System.out.println("not matched");
                        flag2 = false;
                        break;
                    }
                }
                else
                {
                    continue;
                }
            }
        }

        if(flag2 && end) 
        {
            System.out.println("Correct.");
        }
        else
            System.out.println("Not Correct.");
    }
}