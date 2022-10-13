package com.umanizales.listas_se.listasse.model;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ListSE {
    private Node head;
    private int size;

    public void addFirst(Kid kid) {
        if (head == null) {
            head = new Node(kid);
        } else {
            Node temp = new Node(kid);
            temp.setNext(head);
            head = temp;
        }
    }


    public void add(Kid kid) {
        if (head == null) {
            head = new Node(kid);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            ///Ayudante esta en el ultimo
            Node newNode = new Node(kid);
            temp.setNext(newNode);
        }

    }

    public int count() {
        if (head == null) {
            return 0;
        } else {
            //call temp
            Node temp = head;
            int cont = 1;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                cont++;
            }
            return cont;
        }
    }

    public void deletePosition(int position) {
        if (position > 0 && position <= this.size) {
            if (position == 1) {
                this.head = this.head.getNext();
                this.size--;
            } else {
                Node temp = head;
                int count = 1;
                while (temp != null) {
                    if (count == position - 1) {
                        temp.setNext(temp.getNext().getNext());
                        this.size--;
                        break;
                    }
                    temp = temp.getNext();
                    size++;
                }
            }


        }


    }

    public void addFinal(Kid kid) {
        if (head == null) {
            head = new Node(kid);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            Node newNode = new Node(kid);
            temp.setNext(newNode);
        }
    }

    public void girlsFirst(Kid kid) {
        if (head != null) {
            ListSE newList = new ListSE();
            Node temp = head;
            while (temp != null) ;
            {
                if (temp.getData().getGender() == 'M') {
                    newList.add(temp.getData());
                } else {
                    newList.addFirst(temp.getData());

                }
                temp = temp.getNext();
            }
            this.head = newList.head;
        }
    }

    public void invert(Kid kid) {
        if (head != null) {
            ListSE listTemp = new ListSE();
            Node temp = head;
            while (temp != null) {
                listTemp.add(temp.getData());
                temp = temp.getNext();
            }
            head = listTemp.getHead();
        }
    }
}

