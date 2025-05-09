#include <stdio.h>

int main() {
    int n = 3;
    while(n-->0){
        int m;
        scanf("%d", &m);
        
        long long int a = 0;
        int b = 0;
        for(int i = 0;i<m;i++){
            long long int num;
            scanf("%lld", &num);
            a += num/1000;
            b += num%1000;
        }
        if(a>1000){
            printf("+\n");
        }
        else if(a<-1000){
            printf("-\n");
        }
        else if(a*1000+b>0){
            printf("+\n");
        }
        else if(a*1000+b<0){
            printf("-\n");
        }
        else{
            printf("0\n");
        }
    }
    return 0;
}