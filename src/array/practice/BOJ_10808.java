package array.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 */
public class BOJ_10808 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, IOException {

        String S = br.readLine();
        byte[] counts = new byte[26];
        Arrays.fill(counts, (byte) 0);

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            counts[(byte) (ch - 'a')]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + " ");
        }

    }
}
