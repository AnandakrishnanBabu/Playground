#include<stdio.h>
int main()
{
  int a,b,d;
  int c;
 scanf("%d\n%d\n%d",&c,&a,&b);
 d = ((c*a)-b);
  if(d>0)
  	printf("Can reach");
  else if(d<0)
  	printf("Cannot reach");
    
}