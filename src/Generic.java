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
          String a = "Apple", b = "Peach", c = "Banana";
            System.out.println("the maximum number is :" +maximum( a ,b ,c));
        }
}