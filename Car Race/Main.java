#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d\n%d\n%d\n%d",&a,&b,&c,&d);
  if(b%d==0)
    printf("Car 1 goes into road B");
  else
 	printf("No path exist");
}