#include<stdio.h>
#include<stdlib.h>

struct clientData 
{
    unsigned int acctNum; // account number
    char lastName[15]; // account last name
    char firstName[10]; // account first name
    double balance; // account balance
};
typedef struct clientData data;

void getdata(struct clientData data[], int size)
{
    for(int i =0; i < size; i++) // gets the users input for all of the requirements 
    {
        printf("\nEnter account number: "); 
        scanf("%d", &data[i].acctNum);
        printf("\nEnter  Last Name: ");
        scanf("%s", data[i].lastName);  
        printf("\nEnter First Name: ");
        scanf("%s", data[i].firstName);
        printf("\nEnter Account Balance: ");
        scanf("%lf", &data[i].balance);
    }
}

void PrintData(struct clientData data[], int size)
{
    for(int i = 0; i < size; i++) //prints the data onto the screen for the user to see
    {
       
        printf("\n Account number: %d", data[i].acctNum);
        printf("\n Last Name: %s", data[i].lastName);
        printf("\n First Name: %s", data[i].firstName);
        printf("\n Account Balance: $%.2f", data[i].balance);
    }
}

void SaveStdList(struct clientData data[], int size) // saves the input file( kindof like lab 8)
{

    FILE * inputfile = fopen("info.bin", "w"); // similar format as lab 8
    

    if(inputfile == NULL) // if input file is equal to nothing than print erroe message
    { 
        printf("Error opening output file.\n"); 
    }
    
    fprintf(inputfile,"Account num\tLastName\tFirstName\tBalance\n");
     for(int i =0; i <  size; i++)
     {
        
        //fwrite(&data[i], sizeof(struct clientData), 1, inputfile);
        fprintf(inputfile, "%d\t%s\t\t%s\t\t%f", data[i].acctNum, data[i].lastName, data[i].firstName, data[i].balance);
        
        if(i != size)
        fprintf(inputfile,"\n"); 
     }
    
fclose(inputfile);
}

int main()
{
    int size; 

    printf("Enter the number of clients:");
    scanf("%d", &size); // input for size

    struct clientData data[size]; // array
    // function calls 
    getdata(data, size);
    PrintData(data,size);
    SaveStdList(data, size);
}
