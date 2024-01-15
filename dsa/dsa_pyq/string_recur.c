#include<stdio.h>
#include<string.h>

int isPalindrome(char *inputString, int leftIndex, int rightIndex){
    if(leftIndex>=rightIndex){
        return 1;
    }
    else if(inputString[leftIndex]==inputString[rightIndex]){
        return isPalindrome(inputString, leftIndex+1, rightIndex-1);        
    }
    return 0;
}

int main(){
    char inputString[100];
    printf("Enter the string: ");
    scanf("%s", inputString);
    if(isPalindrome(inputString, 0, strlen(inputString)-1)){
        printf("The string is a palindrome: ");
    }
    else{
        printf("The string is not a palindrome");
    }
    return 0;
}