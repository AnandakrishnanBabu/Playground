#include<stdio.h>
int main()

{
    int a, b, c,d;
    scanf("%d%d%d", &a, &b, &c);
    d = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    printf ("%d", d);
    printf (" is greater");
    return 0;

}