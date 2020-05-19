#include<stdio.h>
// #incl////ude<stdlib.h>


typedef struct ListNode
{
    int data; 
    struct ListNode *nextPtr;
}ListNode;

void addNode(ListNode ** q ,int data) 
{
 // In this function the node is being added at the end of the list, this function is also used for my problem 2  
    ListNode* new;  
    new = (ListNode*)malloc(sizeof(ListNode));
    new->data = data;
    new->nextPtr = NULL;
    new->nextPtr = (*q);
    *q = new;
}
void printList(ListNode *itsalist)
{
// another print function which is also used for my problem 2 which prints the list with a node *
    if(itsalist == NULL)
    {
        printf("*");
    }
    else
    {
        printf("%d\t", itsalist->data);
        printList(itsalist->nextPtr);
 // calls the function itself to print the nextptr until it doesnt equal NULL so it can add the *
    }
}
int sumList(ListNode* p)
{
   int sum = 0;
    while (p != NULL)
    {
// until p doesnt equal null it keeps adding and once its done it returns the output, learned this method from her in class
        sum += p->data;
        p = p->nextPtr;
      
    }

return sum;
}
double average(ListNode *p)
{
// another method which was also taught in one of the pervious classes where there was a code which we calculated the average too
double sum = 0; 
    while (p != NULL)
    {
        // ssame function as the null expect in this one it returns the output by dividing it
        sum += p->data;
        p = p->nextPtr;
    }
  double avg = sum/20;

return avg;
}

int main()
{
    ListNode * listnode = NULL;
    srand(time(NULL));

    for(int i = 0; i < 20; i++)
    {
        addNode(&listnode, rand()%100);
        // printList(listnode);  //UNCOMMENT THIS TO SEE HOW NODES ARE BEING ADDED ITS COOL
        //sleep(5);    //UNCOMMENT THIS IT JUST SLEEPS THE CODE FOR 5s SO YOURE CODE DOESNT PRINT EVERYTHING SUPER FAST
    }
    printf("The list is: \n");
    printList(listnode);    
    printf("\nSum is %d\n", sumList(listnode));
    printf("Average is %.2f\n", average(listnode));

}