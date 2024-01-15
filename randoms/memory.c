#include<stdio.h>
#include<stdlib.h>

int main(){
    
    int i, *ptr_malloc, *ptr_calloc, *ptr_realloc;
    int size, size_realloc;

    printf("Enter the size: ");
    scanf("%d", &size);
    ptr_malloc=(int *)malloc(size*sizeof(int));

    if(ptr_malloc==NULL){
        printf("Memory allocation failed");
        exit(0);
    }
    for (i=0;i<size;i++){
        *(ptr_malloc+i)=i+1;
    }
    for(i=0;i<size;i++){
        printf("%d\t%p\n", *(ptr_malloc+i), (ptr_malloc+i));
    }
    printf("\n\n\n");
    ptr_calloc=(int*)calloc(size, sizeof(int));

    if(ptr_calloc==NULL){
        printf("Memory allocation failed");
        free(ptr_malloc);
        exit(0);
    }
    for (i=0;i<size;i++){
        *(ptr_calloc+i)=i+2;
    }
    for(i=0;i<size;i++){
        printf("%d\t%p\n", *(ptr_calloc+i), (ptr_calloc+i));
    }
    printf("\n\n\n");

    printf("Enter the size of realloc: ");
    scanf("%d", &size_realloc);
    ptr_realloc=(int *)realloc(ptr_malloc, size_realloc*sizeof(int));

    if(ptr_realloc==NULL){
        printf("Memory allocation failed");
        free(ptr_malloc);
        free(ptr_calloc);
        exit(0);
    }
    for (i=0;i<size_realloc;i++){
        *(ptr_realloc+i)=i+3;
    }
    for(i=0;i<size_realloc;i++){
        printf("%d\t%p\n", *(ptr_realloc+i), (ptr_realloc+i));
    }
    
    free(ptr_calloc);
    free(ptr_realloc);

    return 0;
}