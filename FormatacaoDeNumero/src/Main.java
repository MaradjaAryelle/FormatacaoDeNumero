public class Main {
    public static void main(String[] args) {
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}