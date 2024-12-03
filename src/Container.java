import java.util.Arrays;

public class Container {
    private int[] data = new int[10];
    private int currentIndex = 0;
    
    public void add(int value) {

    }

    public void remove(int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data = Arrays.copyOf(data, data.length - 1);
                break;
            }
        }

    }

    public void resize() {
        int[] array = new int[data.length + 2];
        for (int i = 0; i != data.length; i++) {
            array[i] = data[i];
        }
        data = array;
    }
}
