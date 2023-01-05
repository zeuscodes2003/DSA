import java.util.Scanner;

class LinkedList {
    public static Scanner sc = new Scanner(System.in);
    private node head;

    LinkedList() {
        head = null;
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

    public static void main(String[] args) {
        int ch;
        LinkedList obj = new LinkedList();
        while (true) {
            System.out.println("MENU\n1:insert\n2:display\n");
            System.out.println("enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.display();
                    break;
                default:
                    break;
            }

        }

    }
}
