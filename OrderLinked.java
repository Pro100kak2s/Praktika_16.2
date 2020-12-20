package com.company;


class ListElement<E> {
        ListElement next;
        E data;
    }

  public  class OrderLinked<E> {
        private ListElement head;
        private ListElement tail;
        private int size;
        void addFront(E data)
        {
            ListElement a = new ListElement();
            a.data = data;
            size++;
            if(head == null)
            {
                head = a;
                tail = a;
            }
            else {
                a.next = head;
                head = a;
            }
        }

        void addBack(E data) {
            ListElement a = new ListElement();
            a.data = data;
            size++;
            if (tail == null)
            {
                head = a;
                tail = a;
            } else {
                tail.next = a;
                tail = a;
            }
        }
        int getSize(){
            return size;
        }
        E getEl(int number){
            ListElement t=head;
            int i=0;
            while (t!=null){
                if(number==i){
                return (E) t.data;
                }
                t=t.next;
                i++;
            }
            return null;
        }
        void printList()
        {
            ListElement t = head;
            while (t != null)
            {
                System.out.print(t.data + " ");
                t = t.next;
            }
        }

        void delEl(E data)          //удаление элемента
        {
            if(head == null)
                return;

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            ListElement t = head;
            while (t.next != null) {
                if (t.next.data == data) {
                    if(tail == t.next)
                    {
                        tail = t;
                    }
                    t.next = t.next.next;
                    return;
                }
                t = t.next;
            }
        }
    }

