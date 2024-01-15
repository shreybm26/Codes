#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data){
    struct node *n;
    n=(struct node *)malloc(sizeof(struct node));
    n->data=data;
    n->left=NULL;
    n->right=NULL;
    return n;
}

void preorder(struct node *root){
    if(root!=NULL){
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root){
    if(root!=NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

void inorder(struct node *root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
        
    }
}

// struct node *search(struct node *root, int key){
//     if(root==NULL){
//         return NULL;
//     }
//     if(root->data==key){
//         return root;
//     }
//     else if(root->data>key){
//         return search(root->left, key);
//     }
//     else{
//         return search(root->right, key);
//     }
// }

// void insert(struct node *root, int key){
//     struct node *prev=NULL;
//     while(root!=NULL){
//         prev=root;
//         if(key==root->data){
//             return;
//         }
//         else if(key<root->data){
//             root=root->left;
//         }
//         else{
//             root=root->right;
//         }
//     }
//     struct node *new=createNode(key);
//     if(key<prev->data){
//         prev->left=new;
//     }
//     else{
//         prev->right=new;
//     }
// }

// struct node *inOrderPredecessor(struct node *root){
//     root=root->left;
//     while(root!=NULL){
//         root=root->right;
//     }
//     return root;
// }

// struct node *deleteNode(struct node *root, int val){
//     struct node *iPre;
//     if(root==NULL){
//         return NULL;
//     }
//     if(root->left==NULL && root->right==NULL){
//         free(root);
//     }
//     if(val<root->data){
//         deleteNode(root->left,val);
//     }
//     else if(root->data<val){
//         deleteNode(root->right, val);
//     }
//     else{
//         iPre=inOrderPredecessor(root);
//         root->data=iPre->data;
//         deleteNode(root->left,iPre->data);
//     }
//     return root;
// }

int main(){
    
    struct node *p=createNode(25);
    struct node *p1=createNode(15);
    struct node *p2=createNode(50);
    struct node *p3=createNode(10);
    struct node *p4=createNode(22);
    struct node *p5=createNode(35);
    struct node *p6=createNode(70);
    struct node *p7=createNode(4);
    struct node *p8=createNode(12);
    struct node *p9=createNode(18);
    struct node *p10=createNode(24);
    struct node *p11=createNode(31);
    struct node *p12=createNode(44);
    struct node *p13=createNode(66);
    struct node *p14=createNode(90);

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;
    p2->left=p5;
    p2->right=p6;
    p3->left=p7;
    p3->right=p8;
    p4->left=p9;
    p4->right=p10;
    p5->left=p11;
    p5->right=p12;
    p6->left=p13;
    p6->right=p14;

    // preorder(p);
    // printf("\n");
    // postorder(p);
    // printf("\n");
    // inorder(p);
    // printf("\n");

    // struct node *n=search(p,5);
    // if(n!=NULL){
    //     printf("found: %d\n", n->data);
    // }
    // else{
    //     printf("Element not found: ");
    // }

    insert(p,7);
    printf(" %d", p->right->right->data);
    
    return 0;
}