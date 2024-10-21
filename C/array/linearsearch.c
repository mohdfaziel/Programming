#include<stdio.h>
void linearSearch(int arr[],int size,int element){
    int index;
    for(int i = 0; i<size; i++){
        if(arr[i]==element){
            index = i;
            break;
        }else{
            index = -1;
        }
    }
    if(index != -1){
            printf("Element %d is present on the index %d",element,index);
        }else{
            printf("Entered element isn't present in this array\n");
        }
    }
    void main(){
       int arr1[] = {1,4,5,3,4,5,76,45,34,87,97,56,45,32,45,76,89,76};
       int size = sizeof(arr1)/sizeof(int);
        linearSearch(arr1,size,89);
    }