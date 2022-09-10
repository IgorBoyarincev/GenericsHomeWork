import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int countElem = 0;

    public MagicBox() {
        items = (T[]) new Object[4];
    }

    public boolean add(T value) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = value;
                result = true;
                countElem++;
                break;
            }
        }
        return result;
    }

    public T pick() throws RuntimeException {
        int randomInt;
        if (countElem <= items.length - 1) {
            int deficit = items.length - countElem;
            throw new RuntimeException("IN ARRAY NEED ADD " + deficit + " ELEMENTS");
        } else {
            Random random = new Random();
            randomInt = random.nextInt(items.length);
        }
        return (T) items[randomInt];
    }

    public T[] getItems() {
        return items;
    }

}
