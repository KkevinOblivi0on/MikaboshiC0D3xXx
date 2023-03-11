public class TrueFalseProgram {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        boolean true_false;

        true_false = (j < 5);
        System.out.println(true_false);

        true_false = (j > 3);
        System.out.println(true_false);

        true_false = (j < i);
        System.out.println(true_false);

        true_false = (i < 5);
        System.out.println(true_false);

        true_false = (j <= 5);
        System.out.println(true_false);

        true_false = (6 < 6);
        System.out.println(true_false);

        true_false = (i != j);
        System.out.println(true_false);

        true_false = (i == j || i < 50);
        System.out.println(true_false);

        true_false = (i == j && i < 50);
        System.out.println(true_false);

        true_false = (i > j || true_false && j >= 4);
        System.out.println(true_false);

        true_false = (!(i < 2 && j == 5));
        System.out.println(true_false);

        true_false = !true_false;
        System.out.println(true_false);
    }
}
