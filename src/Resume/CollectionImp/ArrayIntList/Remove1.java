package Resume.CollectionImp.ArrayIntList;

public class Remove1 {
    private int[] elementData;
    private int size;

    public Remove1() {
        elementData = new int[10];
        size = 0;
    }

    public void remove (int index){
        checkIndex(index, 0, size - 1);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    public void add(int index, int value) {
        checkIndex(index, 0, size);
        ensureCapacity(size + 1);

        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }

        elementData[index] = value;
        size++;
    }

    private void checkIndex(int index, int min, int max) {
        if (index < min || index > max) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2;
            if (capacity > newCapacity) newCapacity = capacity;

            int[] newList = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newList[i] = elementData[i];
            }
            elementData = newList;
        }
    }
}
