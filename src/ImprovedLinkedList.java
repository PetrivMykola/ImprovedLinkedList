import java.util.LinkedList;

public class ImprovedLinkedList<E> extends LinkedList<E> {
    int capacity;

    public ImprovedLinkedList() {
        capacity = 16;
    }

    public ImprovedLinkedList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean add(E e) {

        if (this.size() != capacity) {
            super.add(e);

        } else {
            this.removeFirst();
            super.add(e);
        }
        return true;

    }
}