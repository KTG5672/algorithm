package linkedlist.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ_1158 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> linked = new LinkedList<>();
        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int mod = Integer.parseInt(input[1]);
        
        for (int i = 0; i < size; i++) {
            linked.add(i + 1);
        }
        ListIterator<Integer> iterator = linked.listIterator();
        
        
    }
    
}
