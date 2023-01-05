#include <bits/stdc++.h>
using namespace std;

class node
{
public:
    int data;
    node *link;
    node(int n)
    {
        this->data = n;
        this->link=NULL;
    }
};
class linkedlist
{
    node *head;
    int n;

public:
    linkedlist()
    {
        head = NULL;
    }
    void insert();
    void display();
    void deleteAtBeg();
    void deleteAtEnd();
    void deleteany();
    void insertany();
};
void linkedlist::insert()
{
    int n;
    cout << "enter the value";
    cin >> n;
    node *newnode = new node(n);
    newnode->link = head;
    head = newnode;
}
void linkedlist::display()
{
    if (head == NULL)
    {
        cout << "empty bro\n";
    }
    node *ptr = head;
    while (ptr != NULL)
    {
        cout << ptr->data << endl;
        ptr = ptr->link;
    }
}
void linkedlist::deleteAtBeg()
{
    if (head == NULL)
    {
        cout << "empty to delete" << endl;
        return;
    }
    if (head->link == NULL)
    {
        head = NULL;
    }
    else
    {
        node *ptr = head;
        head = ptr->link;
        free(ptr);
    }
}

void linkedlist::deleteAtEnd()
{
    node *ptr1, *ptr;
    ptr = head;
    if (head == NULL)
    {
        cout << "empty to delete\n";
        return;
    }
    if (head->link == NULL)
    {
        head = NULL;
        return;
    }

    while (ptr->link != NULL)
    {
        ptr1 = ptr;
        ptr = ptr->link;
    }
    ptr1->link = NULL;
    free(ptr);
}
void linkedlist::insertany()
{
    int pos, n, i = 1;
    node *ptr = head;
    cout << "enter the position\n";
    cin >> pos;
    cout << "enter the value";
    cin >> n;
    node *newnode = new node(n);
    if (pos == 1)
    {
        newnode->link = head;
        head = newnode;
        return;
    }
    while (i < pos - 1)
    {
        ptr = ptr->link;
        i++;
    }
    newnode->link = ptr->link;
    ptr->link = newnode;
}
void linkedlist::deleteany()
{
    node *ptr = head, *ptr1;
    int i = 1, pos;
    cout << "\nenter the position u wish to delete\n";
    cin >> pos;
    if (pos == 1)
    {
        head = head->link;
        free(ptr);
        return;
    }
    while (i < pos - 1)
    {
        ptr = ptr->link;
        i++;
    }
    ptr1 = ptr->link;

    ptr->link = ptr->link->link;
    free(ptr1);
}
int main()
{
    int ch;
    linkedlist obj;
    while (1)
    {
        cout << ("MENU\n1:insert\n2:display\n3:deleteatbeg\n4:deleteatend\n5:insertany\n6:deleteant\n7:exit()");
        cout << "enter you choice" << endl;
        cin >> ch;
        switch (ch)
        {
        case 1:
            obj.insert();
            break;
        case 2:
            obj.display();
            break;
        case 3:
            obj.deleteAtBeg();
            break;
        case 4:
            obj.deleteAtEnd();
            break;
        case 5:
            obj.insertany();
            break;
        case 6:
            obj.deleteany();
            break;
        case 7:
            exit(0);
            break;
        }
    }
}
