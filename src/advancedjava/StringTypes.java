package advancedjava;

public class StringTypes {
    public static void main(String[] args) {
        String s = "Nidhi";
        StringBuilder sb = new StringBuilder("Nidhi");
        StringBuffer sbf = new StringBuffer("Nidhi");

        sb.append(" S");
        sbf.append(" Shetty");

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
    }
}
