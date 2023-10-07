package omkar;
public class printnames {
//    int count = 0;
    public static void main(String args[]) {
        String name = "omkar";
        int count = 0;
        print(name, count);
    }

    public static String print(String name, int count) {
        if (count == 5) {
            return name;
        }
        System.out.println(name);
        count++;
        print(name, count);
        return name;

    }
}
