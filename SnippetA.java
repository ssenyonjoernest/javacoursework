public class SnippetA {

    public static void main(String[] args) {

        final int MAX_RETAKES = 3;

        System.out.println("Retakes allowed: " + MAX_RETAKES);

        // MAX_RETAKES = 4;  // This would cause an error
        System.out.println("Retakes allowed: " + MAX_RETAKES);
    }
}