package Module9;

public class BinaryOfStrings {
        public static void generate(String str, int n) {
            if (str.length() == n) {
                System.out.print(str);
                return;
            }

            generate(str + "0", n);
            generate(str + "1", n);
        }

        public static void main(String[] args) {
            generate("", 3);
        }
    }

