package Module8;

public class PowerOf2 {
        public static void main(String[] args) {
            int num = 8;

            if (num > 0 && (num & (num - 1)) == 0) {
                System.out.println(num + " is a power of 2");
            } else {
                System.out.println(num + " is NOT a power of 2");
            }
        }
    }

