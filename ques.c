#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int size(int n){
    int x=1;
    for(int i=0;i<n-1;i++){
        x+=2;
    }
    return x;
}

int main() 
{

    int n;
    scanf("%d", &n);
    int s=size(n);
    int arr[s][s];
    int x=n;
        for(int i=0;i<n;i++){
            for(int j=i;j<s-i;j++){
                arr[i][j]=x;
                arr[j][i]=x;
                arr[j][s-i-1]=x;
                arr[s-i-1][j]=x;
            }
            x--;
        }
    for(int q = 0; q<s; q++)
        {
            for(int w = 0; w<s; w++)
            {
                printf("%d ",arr[q][w]);
            }
            printf("\n");
        }
    
    
    return 0;
}

