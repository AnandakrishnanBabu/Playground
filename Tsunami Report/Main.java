#include<stdio.h>
int main()
{
  int a[3],i;
  for(i = 0 ; i<=2 ;i++)
  {
    scanf("%d",&a[i]);
  }
  printf("1)Dead : %d\n2)Injured : %d\n3)Safe : %d\nPlease help the people who are suffering!!!",a[0],a[1],a[2]);
return 0;  
}