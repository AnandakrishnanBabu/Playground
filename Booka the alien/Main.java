#include<stdio.h>
int main()
{ int year,a,b,c;
  scanf("%d",&year);
    a = year / 365;
    b =(year - 365) / 7;
    c =(year - 365) % 7;
    printf ("%d\n%d\n%d",a,b,c);
 
}