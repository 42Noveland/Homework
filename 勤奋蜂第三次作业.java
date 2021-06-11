

    class At<T> {
        Node next = null;
        T data;

        public At(T data) {
            this.data = data;
        }
    }
class list{
    public  At head;

}
    public class un2<T> {
    public void addAt(T d,list b) {
        At<T> newNode = new At(d);
        if (b.head == null) {
            b.head = newAt;
            return;
        }else{

        }
        At tmp = b.head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newAt;
    }


    public boolean deleteAt(int index,list b) {
        if (index < 1 || index > length(b)) {
            return false;
        }
        if (index == 1) {
            b.head = b.head.next;
            return true;
        }
        int i = 1;
        At preAt = b.head;
        At curAt = preAt.next;
        while (curAt != null) {
            if (i == index) {
                preAt.next = curAt.next;
                return true;
            }
            preAt = curAt;
            curAt = curAt.next;
            i++;
        }
        return false;
    }

    public int length(list b) {
        int length = 0;
        At tmp = b.head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }
public void remove(T a,list b){
        At p=b.head;
         At q=null;
        while (p!=null){
            if(p.data==a){
                if(q!=null){
                    q.next=p.next;
                }else{
                    b.head=p.next;
                }
                break;

            }
            q=p;
            p=p.next;


        }
}

    public void printList(list b) {
        At tmp = b.head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
        public void reverse(list b) {
            At pr = b.head;
            At p = b.head;
            At pBefore = null;
            while (p != null) {
                At pNext = p.next;
                if (pNext == null) {
                    pr = p;
                }
                p.next = pBefore;
                pBefore = p;
                p = pNext;
            }
            b.head = pr;
            
        }
        public void orderList(list b) {
            At<Integer> nextAt = null;
            Integer tmp = 0;
            At<Integer> curAt = b.head;
            while (curAt.next != null) {
                nextNode = curAt.next;
                while (nextAt != null) {
                    if (curAt.data > nextAt.data) {
                        tmp = curAt.data;
                        curAt.data = nextAt.data;
                        nextAt.data = tmp;
                    }
                    nextAt = nextAt.next;
                }
                curAt = curAt.next;
            }
        }
        public void deleteDuplecate(list b) {
            At p = b.head;
            while (p != null) {
                At q = p;
                while (q.next != null) {
                    if (p.data == q.next.data) {
                        q.next = q.next.next;
                    } else
                        q = q.next;
                }
                p = p.next;
            }

        }
    public static void main(String[] args) {
        un2<Integer> a = new un2<Integer>();
        list b=new list();
        a.addNode(5,b);
        a.addNode(3,b);
        a.addNode(1,b);
        a.addNode(2,b);
        a.addNode(55,b);
        a.addNode(36,b);
        System.out.println("长度：" + a.length(b));
        System.out.println("头数据:" + b.head.data);
        a.printList(b);
        a.deleteNode(4,b);
        System.out.println("After deleteNode(4):");
        a.printList(b);
        a.reverse(b);
        System.out.println("After reverse");
        a.printList(b);
        a.orderList(b);
        System.out.println("After orderList");
        a.printList(b);
        a.addNode(5,b);
        System.out.println("After addNode(5)");
        a.printList(b);
        a.deleteDuplecate(b);
        System.out.println("After deleteDuplecate");
        a.printList(b);
    }

}
