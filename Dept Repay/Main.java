#include<stdio.h>
int main()
{
  float p,r,t,i,a,d,s;
  scanf("%f\n%f\n%f\n",&p,&r,&t);
   i = (p*r*t)/100;
   a = p+i;
   d = 0.02*i;
   s = a - d;
  printf("%0.2f\n%0.2f\n%0.2f\n%0.2f\n",i,a,d,s);
  
}