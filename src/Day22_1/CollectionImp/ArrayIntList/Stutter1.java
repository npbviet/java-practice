package Day22_1.CollectionImp.ArrayIntList;

public class Stutter1 {
    private int[] elementData;
    private int size;

    public Stutter1() {
        elementData = new int[10];
        size = 0;
    }

    public void stutter(){
        ensureCapacity(size*2);
        for (int i = size -1; i >= 0; i--){
            int value = elementData[i];
            elementData[2*i + 1] = value;
            elementData[2*i] = value;
        }
        size = size * 2;
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
