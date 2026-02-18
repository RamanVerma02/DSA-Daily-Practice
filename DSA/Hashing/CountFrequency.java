import java.util.HashMap;

public class CountFrequency {

    public static void operation(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        // for(int x : map.keySet())
        //     System.out.println(x+" "+map.get(x));

        System.out.print(map);
    }

    public static void hash(String naam) {
        HashMap<Character, Integer> map = new HashMap<>();
        String name = naam.toLowerCase();

        for (int i = 0; i < name.length(); i++) {

            if (map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
            } else {
                map.put(name.charAt(i), 1);
            }
        }
        // Avoid this coz it will ignore name of space occurance
        // System.out.println(map);

        // Use this as we are printing name as well for space
        for (char key : map.keySet()) {
            if (key == ' ')
                System.out.println("space = " + map.get(key));
            else
                System.out.println(key + " = " + map.get(key));
        }
    }

    public static void meth2(String naam){
        HashMap<Character, Integer> map = new HashMap<>();
        String name = naam.toLowerCase();

        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char x : map.keySet())
            System.out.println(x+" "+map.get(x));
        System.out.println(map);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 3, 5, 2, 3 };
        // operation(arr);
        // hash("Raman Verma");
        meth2("Hariom Verma");

    }

}