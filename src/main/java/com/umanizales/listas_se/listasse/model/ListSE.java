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
            temp.setNext(head); // tomar niño y añadirlo al inicio
            head = temp;
        }
    }


    public void add(Kid kid) {
        head(kid);

    }

    public void addByPosition(int position, Kid kid) {
        if (position == 1) {
            addFirst(kid);
        } else {
            int posTemp = 1;
            Node temp = head;
            while (posTemp < (position - 1)) {
                temp = temp.getNext();
                posTemp++;
            }
            //Estoy parado uno antes de donde debe quedar
            Node newNode = new Node(kid);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    }

    private void head(Kid kid) {
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
            int count = 1; // el contador se inicia en uno
            while (temp.getNext() != null) {
                temp = temp.getNext(); //  temporal toma su siguiente
                int cont = +1;
            }
            return count;
        }
    }

    public void deletePosition(int position) {
        if (position > 0 && position <= this.size) {
            if (position == 1) {
                this.head = this.head.getNext(); // se toma los datos o atributos de la cabeza
                this.size--; // para el tamaño de la lista
            } else {
                Node temp = head;  // temporal toma la cabeza
                int count = 1; // crear un contador para saber su posicion y asi eliminar la posicion que el usuario requiere
                while (temp != null) {
                    if (count == position - 1) {
                        temp.setNext(temp.getNext().getNext());
                        this.size--;
                        break; // parar el bucle
                    }
                    temp = temp.getNext();
                    size++;
                }
            }


        }



    }

    public void addFinal(Kid kid) {
        head(kid);
    }

    public void girlsFirst() {
        //Se valida que existan por lo menos dos para mezclar
        if (size > 1) {
            int contM = 1;
            int contF = 2;
            //Creo un ayudante y lo posiciono en la cabeza
            Node temp = head;
            ListSE listCp = new ListSE();
            //Recorre la lista de principio a fin
            while (temp != null) {
                if (temp.getData().getGender() == 'M') {
                    if (contM > listCp.size) {
                        listCp.add(temp.getData());
                    } else {
                        listCp.addByPosition(contM, temp.getData());
                    }
                    contM += 2;
                } else {
                    if (contF > listCp.size) {
                        listCp.add(temp.getData());
                    } else {
                        listCp.addByPosition(contF, temp.getData());
                    }
                    contF += 2;
                }
                temp = temp.getNext();
            }
            head = listCp.getHead();
        }
    }


    public void invert() {
        if (head != null) {
            ListSE listCP = new ListSE(); // crear lista temporal
            Node temp = head;
            while (temp != null) {
                listCP.addFirst(temp.getData()); // tomar su siguiente y recorrerlo hasta que se pare en el ultimo dato y enviarlo a la nueva lista
                temp = temp.getNext();
            }
            head = listCP.getHead();
        }
    }
}

