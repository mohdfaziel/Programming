#include<stdio.h>
void checking_If_File_Is_Present_Or_Not();
void action_of_wMODE_if_file_isnt_created();
void creating_and_closing_file();
void main()
{
    creating_and_closing_file();
    checking_If_File_Is_Present_Or_Not();
    action_of_wMODE_if_file_isnt_created();
}
void checking_If_File_Is_Present_Or_Not()
{
    FILE *fptr;
    fptr = fopen("world.c","r"); // world.c doesn't exists so NULL will be stored in fptr 
    if(fptr==NULL)
    {
        printf("FIle doesn't exists\n");
    }
    else
    {
        fclose(fptr); // if file exists then fptr != NULL, hence we have to close the file
    }
}
void action_of_wMODE_if_file_isnt_created()
{
    FILE *fptr;
    fptr = fopen("world.txt","w"); // world.txt doesn't exists so, w mode will create a world.txt file 
    if(fptr==NULL)
    {
        printf("FIle doesn't exists\n"); //here fptr will not store NULL  because w(mode) has created that file
    }
    else
    {
        fclose(fptr); // if file exists then fptr != NULL, hence we have to close the file
        printf("file exists and now it has been closed\n");
    }
}
void creating_and_closing_file()
{
    
    FILE *fptr; // creating a file pointer to access a file
    fptr = fopen("hello.txt","r"); // opening file hello.txt for reading
    fclose(fptr); // closing the file
    
}
