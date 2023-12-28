package array.practice;

/**
 * 주어진 N의 int 배열 arr 에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1, 아니면 0을 반환하는 함수 작성
 */
public class FindSumByArray {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 52, 48}, 100));
        System.out.println(solution(new int[] {52, 42}, 100));
        System.out.println(solution(new int[] {4, 13, 63, 87}, 100));
    }

    public static int solution(int[] arr, int correct) {

        boolean[] checking = new boolean[correct + 1];

        for (int i = 0; i < arr.length; i++) {
            int find = arr[i];
            if (checking[correct - find]) {
                return 1;
            }
            checking[find] = true;
        }

        return 0;
    }

}