public class Generic {

    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
        public static void main(String[] args)
        {
          double a = 2.2, b = 4.4, c = 8.8;
            System.out.println("the maximum number is :" +maximum(2.2,4.4,8.8));
        }
}