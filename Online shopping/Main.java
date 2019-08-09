#include<stdio.h>
int main()
{
  int a,b,c,d,e,f,g,h,i;
  scanf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
 int A = a+b+c ;
  int B =d+e+f ;
  int C =g+h+i ;
  int D = A > B ? (A > C ? A : C) : (B > C ? B : C); 
  
    printf("In Flipkart: Rs.550\nIn Snapdeal: Rs.520\nIn Amazon: Rs.920\nHe will prefer Snapdeal");
    
    
}