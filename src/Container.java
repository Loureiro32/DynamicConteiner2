import java.util.Arrays;

public class Container {
    private int[] data = new int[]{1, 2, 3, 4, 5, 6};

    public void add(int value) {
        int[] newData = new int[data.length + 1];
        for (int i = 0; i <= data.length - 1; i++) {
            newData[i] = data[i];
        }
        newData[newData.length - 1] = value;
        data = newData;
        System.out.println(Arrays.toString(data));
    }

    public void remove(int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data = Arrays.copyOf(data, data.length - 1);
                System.out.println(Arrays.toString(data));
                break;
            }
        }

    }
}
