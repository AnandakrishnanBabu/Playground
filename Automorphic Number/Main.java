#include<stdio.h>
int main()
{
  int a,d;
  scanf("%d",&a);
  d = (a*a)%10;
  if(a!=d)
    printf("Not Automorphic Number");
  else if (a==d)
    printf("Automorphic Number");
}