#include<stdio.h>
int main()
{
  float a,b,c,d,e,f,r1,r2;
  scanf("%f\n%f\n%f\n%f\n%f\n%f\n",&a,&b,&c,&d,&e,&f);
  r1 = (a+c+e)/3;
  r2 = (b+d+f)/3;
  printf("%0.1f\n%0.1f\n",r1,r2);
}

