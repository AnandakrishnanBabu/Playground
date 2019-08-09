#include <stdio.h>
#include <math.h>
 
int main()
{
    float ch,ch2,ch3;
    int a;
    scanf("%f",&ch);
	a = floor(ch);
  	ch2=floor(ch);
    ch3 =ceil(ch);
    printf("%d\n%.1f\n%0.1f",a,ch3,ch2);
    return 0;
}