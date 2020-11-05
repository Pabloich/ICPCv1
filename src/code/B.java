package code;

import java.util.Scanner;

/**
 * B
 */
class Node {
    int value, childs, swaps;
    Node leftChild, rightChild;

    public Node(int value) {
        this.value = value;
        childs = 0;
        swaps = Integer.MAX_VALUE;
    }

    public void setSwaps(int n) {
        swaps = n;
    }

    public void setLeft(Node n) {
        leftChild = n;
    }

    public void setRight(Node n) {
        rightChild = n;
    }

    public int getValue() {
        return value;
    }

    public void setChilds(int value) {
        childs = value;
    }

    public int getChilds() {
        return childs;
    }

    public Node getLeft() {
        return leftChild;
    }

    public Node getRight() {
        return rightChild;
    }
}

class Arbol {
    Node root;

    public Arbol(Node node) {
        root = node;
        root.swaps = 0;
    }

    public int add(Node node) {
        Node current = root;
        int swaps = 0;

        while (current != null) {
            if (node.getValue() < current.getValue()) {
                swaps += current.getChilds() + 1;
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    current = current.getLeft();
                    break;
                }
                current = current.getLeft();
            } else {
                current.setChilds(current.getChilds() + 1);
                if (current.getRight() == null) {
                    current.setRight(node);
                    current = current.getRight();
                    break;
                }
                current = current.getRight();
            }
        }
        current.setSwaps(Math.min(swaps, current.swaps));
        return current.swaps;
    }
}
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Node[] estacion = new Node[n];
        for (int i = 0; i < n; i++) {
            estacion[i] = new Node(in.nextInt());
        }

        int count = 0;
        Arbol tree = new Arbol(estacion[0]);
        for (int i = 1; i < estacion.length; i++) {
            count += tree.add(estacion[i]);
        }
        System.out.println(count);

        for (int i = 0; i < estacion.length; i++) {
            estacion[i].childs = 0;
        }

        count = 0;
        tree = new Arbol(estacion[estacion.length - 1]);
        for (int i = estacion.length - 2; i >= 0; --i) {
            count += tree.add(estacion[i]);
        }
        System.out.println(count);
    }
}
