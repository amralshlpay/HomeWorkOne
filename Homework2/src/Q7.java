public class Q7 {
    public static void main(String[] args) {
        StringBuilder Text = new StringBuilder("Text");
        System.out.println(Text.charAt(0));
        System.out.println(Text.charAt(3));
        Text.deleteCharAt(0);
        Text.deleteCharAt(2);
        System.out.println(Text);
    }
}
