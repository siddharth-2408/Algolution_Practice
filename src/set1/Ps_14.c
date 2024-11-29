#include <stdio.h>
void main()
{
  int i,j;
  for(i=1;i<=5;i++)
  {
      if(i%2!=0)
      {
          for(j=1;j<=5;j++)
                printf("%d",j);
      }
      else
      {
          for(j=5;j>=1;j--)
                printf("%d",j);
      }
      printf("\n");
  }
}
