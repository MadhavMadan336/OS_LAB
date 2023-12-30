#include <stdio.h>
int count; 
int s ; 

void wait()
{
     while(s<=0);
     s--;
}

void signal()
{
     s++;
}


void pr1()
{
    wait();
     count++; 
      printf("pr 1 is : %d \n",count);

   //  pr2();
     signal();
}

void pr2()
{
    wait();
     count--;
      printf("pr 2 is :%d \n",count);
     signal();
}

void main()
{
    count=0 ; 
    s=1;
     pr1();
   
     pr2();
    
     pr1();
      
}
