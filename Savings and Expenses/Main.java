#include<stdio.h>
int main()
{
  int a,b,c,d,e;
	scanf("%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e);
	if(a>(b+d+e+c))
       printf("He can save the money");
    else
       printf("He has to work hard");
}