package array;

public class ArrayImpl implements Array {

    private final int maxSize = 9999;
    private int[] arr = new int[maxSize];
    private int len = 0;

    public ArrayImpl() {}

    public ArrayImpl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
        len = arr.length;
    }

    /**
     * 삽입
     * @param idx
     * @param num
     * @return
     */
    @Override
    public void insert(int idx, int num) {
        for (int i = len - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = num;
        len++;
    }

    /**
     * 삭제
     * @param idx
     * @return
     */
    @Override
    public void erase(int idx) {
        for (int i = idx; i < len; i++) {
            arr[i] = arr[i + 1];
        }
        len--;
    }

    /**
     * 출력
     */
    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
