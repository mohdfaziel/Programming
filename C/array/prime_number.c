#include<stdio.h>
void main(){
    int num,ans;
    printf("enter any positive integer\n");
    scanf("%d",&num);
    for(int i = 2; i<num; i++){
        if(num%i==0){
            ans = 1;
            break;
        }else
            {
                ans = 0;
            }
        }
        if(ans==1){
            printf("composite");
        }else{
            printf("Prime");
        } 
}
        
    