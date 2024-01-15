#include<stdio.h>
#include<stdlib.h>

struct DISTANCE{
    int feet;
    float inch;
};

void addDist (struct DISTANCE *d1, struct DISTANCE *d2, struct DISTANCE *result){
    result->feet=d1->feet+d2->feet;
    result->inch=d1->inch+d2->inch;
    if(result->inch>=12.0){
        result->feet+=(int)(result->inch/12.0);
        result->inch=result->inch-12.0*(int)(result->inch/12.0);
    }
}

int main(){

    struct DISTANCE *d1=(struct DISTANCE *)malloc(sizeof(struct DISTANCE));
    struct DISTANCE *d2=(struct DISTANCE *)malloc(sizeof(struct DISTANCE));
    struct DISTANCE *result=(struct DISTANCE *)malloc(sizeof(struct DISTANCE));

    d1->feet=6;
    d1->inch=11.0;
    d2->feet=5;
    d2->inch=8.0;

    addDist(d1, d2, result);
    printf("The result is %dft %.2fin", result->feet, result->inch);
    
    return 0;
}