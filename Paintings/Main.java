#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
	scanf("%d\n%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e,&f);
	if((a*b)>((c*d)+(e*f)))
       printf("Raj can fix both painting");
    else
       printf("Raj cannot fix both painting");
}