package leetcode.DesignHashMap;

import java.util.Arrays;

public class DesignHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(2, 2);
        System.out.println(map.get(3));
        map.put(2, 1);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
    }

    static class MyHashMap {
        private int[] arr;
        public MyHashMap() {
            arr = new int[1000001];
            Arrays.fill(arr, -1);
        }

        public void put(int key, int value) {
            arr[key] = value;
        }

        public int get(int key) {
            return arr[key];
        }

        public void remove(int key) {
            arr[key] = -1;
        }
    }
}
