#include <stdio.h>
void main()
{
    int i,j;
    
    for(i=5;i>0;i--)
    {
        for(j=0;j<i;j++)
        {
            printf(" ");
        }
        for(int k=0;k<5;k++)
        {
            printf("*");
        }
        
         printf("\n");
    }
}
