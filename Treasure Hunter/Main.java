#include<stdio.h>
#include<math.h>
int main()
{ float q,w,e;
 scanf("%f\n%f\n%f",&q,&w,&e);
 float f = (q/100)*w;
 float s= ((q - f)/100)*e;
 float t = (q -(f+s))/3 ;
 f = floor(f);
 printf("%0.0f\n%0.0f\n%0.0f",f,s,t);
 
}