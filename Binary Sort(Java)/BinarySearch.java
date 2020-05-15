import java.util.*;

class BinarySearch
{
    class Node
    {
        int key;
        Node left, right;

        public Node(final int item) 
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearch() 
    {
        root = null;
    }

     
    void insert(final int ket) 
    {
        root = insertRec(root, key);
    }
    Node insertRec(Node root, final int key)
    {
        if(root == null)
        {
            root = new Node(key);

            return root;
        }
        if(key < root.key)
        {
            root.left = insertRec(root.left, key);
        }
        else if(key > root.key)
        {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

public static Node search(Node root, int key)
{ // Base Cases: root is null or key is present at root
    if (root==null || root.key==key)
    {
        return root;
    }
    // val is greater than root's key
    if (root.key > key)
    {
        return search(root.left, key);
    } // val is less than root's key
    
    return search(root.right, key);
}// This method mainly calls deleteRec()
void deleteKey(int key)
{
    root = deleteRec(root, key);
}
Node deleteRec(Node root, int key)
{
    if(root == null)
    {
        return root;
    }
    if(key < root.key)
    {
        root.left = deleteRec(root.left, key);
    }
    else if(key > root.key)
    {
        root.right = deleteRec(root.right, key);
    }
    else
    {
        if(root.left == null)
        {
            return root.right;
        }
        else if(root.right == null)
        {
            return root.left;
        }
        root.key = minValue(root.right);
        root.right = deleteRec(root.right, root.key);
    }
    return root;
}
int minValue(Node root)
{
    int minv = root.key;
    while(root.left != null)
    {
        minv = root.left.key;       
        root = root.left; 
    }
    return minv;
}
void inorder()
{
    inorderRec(root);
}

  



   

    
  
    

}