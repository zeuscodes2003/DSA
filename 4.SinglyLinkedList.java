import java.util.Scanner;

class LinkedList {
    public static Scanner sc = new Scanner(System.in);
    private node head;

    LinkedList() {
        this.head = null;
    }

    class node {
        int data;
        node link;

        node(int n) {
            this.data = n;
            this.link = null;
        }
    }

    public void insert() {
        int n;
        System.out.println("enter the value");
        n = sc.nextInt();
        node newnode = new node(n);
        newnode.link = head;
        head = newnode;
    }

    public void display() {
        node ptr;
        ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.link;

        }

    }

    public void deleteAtBeg() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.link == null) {
            head = null;
        } else {
            node ptr = head;
            head = ptr.link;

        }
    }

    public void insertany() {
        int pos, n, i = 1;
        node ptr = head;
        System.out.println("enter your position");
        pos = sc.nextInt();

        System.out.println("enter the value");
        n = sc.nextInt();
        node newnode = new node(n);
        if (pos == 1) {
            newnode.link = head;
            head = newnode;
            return;
        }
        while (i < pos) {
            ptr = ptr.link;
            i++;
        }
        newnode.link = ptr.link;
        ptr.link = newnode;
    }

    public void deleteany() {
        node ptr = head;
        node ptr1 = null;
        int i = 1, pos;

        System.out.println("\nenter the position u wish to delete\n");
        pos = sc.nextInt();
        if (pos == 1) {
            head = head.link;

            return;
        }
        while (i < pos - 1) {
            ptr = ptr.link;
            i++;
        }
        ptr1 = ptr.link;

        ptr.link = ptr.link.link;

    }

    public void deleteAtEnd() {
        node ptr1, ptr;
        ptr1 = null;
        ptr = head;
        if (head == null) {
            System.out.println("empty for deletion");
            return;
        }
        if (head.link == null) {
            head = null;
            return;
        }

        while (ptr.link != null) {
            ptr1 = ptr;
            ptr = ptr.link;
        }
        ptr1.link = null;

    }

    public static void main(String[] args) {
        int ch;
        LinkedList obj = new LinkedList();
        while (true) {
            System.out.println(
                    "MENU\n1:insert\n2:display\n3:deleteatbeg\n4:deleteatend\n5:insertany\n6:deleteant\n7:exit()");
            System.out.println("enter your choice");
            ch = sc.nextInt();
            switch (ch) {
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
                    break;
            }

        }

    }

}
