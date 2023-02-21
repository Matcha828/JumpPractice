import java.util.*;

public class basic {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 4, 5, 6, 6, 7};

        int[] temp = removeDuplicate(arr);
        for (int e: temp){
            System.out.print(e + " ");
        }

        System.out.println();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,2);
        map.put(3,2);

        for (Map.Entry<Integer, Integer> set: map.entrySet()){
            System.out.println(set.getKey() + " " + set.getValue());
        }

        for (int i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }

        LinkedList<Integer> list = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        Queue<Integer> queue = new LinkedList<>();
        Queue<String> pq = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();

        int[] arr2 = new int[]{1, 2, 2, 11, 52, 26, 6, 7};
        Arrays.sort(arr2, 1, 4);

        Integer[] arr3 = {1, 2, 2, 11, 52, 26, 6, 7};
        Arrays.sort(arr3, Collections.reverseOrder());
        for (int e: arr2){
            System.out.println(e);
        }

    }

    public static int[] removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int e: arr){
            set.add(e);
        }

        int[] temp = new int[set.size()];

        int count = 0;
        for (int e: set){
            temp[count++] = e;
        }
        return temp;
    }
}
