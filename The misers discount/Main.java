#include<stdio.h>
int main()
{ 
 float a,b,c = 0;
 scanf("%f\n%f\n%f",&a,&b,&c);
 float d = a + b ;
 float e = (d/100)*c ;
 float f = d - e ;
 printf("%0.2f\n%0.2f\n%0.2f",d,f,e);
}