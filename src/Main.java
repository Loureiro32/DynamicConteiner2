public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        Container container = new Container(data);
        container.add(4);
        container.printList();
        container.remove(3);
        container.printList();

    }
}