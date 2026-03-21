package Module8;

public class VowelsAndConsonants {
        public static void main(String[] args) {
            String str = "Hello World";
            int vowels = 0, consonants = 0;

            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'n' || ch == 'i' || ch == 'd' || ch == 'h' || ch == 'i') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }

