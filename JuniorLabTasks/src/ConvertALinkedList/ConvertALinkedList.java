package ConvertALinkedList;

/**
 * Создайте функцию stringify, которая принимает аргумент list/$list и возвращает строковое
 * представление списка. Строка начинается с текущего значения, указанного в data/$data, затем
 * следует символ пробела, направление связанности (" -> ") и снова пробел. Заканчиваться
 * строка всегда должна (null/NULL)
 * <p>
 * Например, приведенный ниже список:
 * new Node(1, new Node(2, new Node(3)))
 * Должен вернуть строку:
 * "1 -> 2 -> 3 -> null"
 * Приведем для примера еще один список:
 * new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
 * Он должен вернуть строку:
 * "0 -> 1 -> 4 -> 9 -> 16 -> null"
 * Для решения задачи добавьте класс Node, который имеет вид:
 * class Node {
 * constructor(data, next = null) {
 * this.data = data;
 * this.next = next;
 * }
 * }
 */

public class ConvertALinkedList {


    public static String stringify(Node list) {
        String result = null;
        result = new String();
        Node n = list;                         //Getting lin to a first elem
        while ((n != null)) {                                //While elem is
            result += n.getData() + " -> ";                 //Print its data
            n = n.getNext();                              //And move to next
        }
        return result + "null";
    }



    public static void main(String[] args) {
        System.out.println(stringify(new Node(1, new Node(2, new Node(3)))));
        System.out.println(stringify(null));

    }
}
class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
