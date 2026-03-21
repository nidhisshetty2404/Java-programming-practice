package Module11;
import java.util.Stack;
public class ReverseStack {
    static void insertAtBottom(Stack<Integer> s, int x) {
            if (s.isEmpty()) {
                s.push(x);
                return;
            }

            int temp = s.pop();
            insertAtBottom(s, x);
            s.push(temp);
        }

        static void reverse(Stack<Integer> s) {
            if (!s.isEmpty()) {
                int temp = s.pop();
                reverse(s);
                insertAtBottom(s, temp);
            }
        }

        public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);

            System.out.println("Original: " + s);
            reverse(s);
            System.out.println("Reversed: " + s);
        }
    }

