package by.osinin.classwork.lesson11;

public class ExceptionExample {
    public static void main(String[] args) {
        int result;
        try {
            result = 2/1;
            try {
                result = 2/0;
            } catch (Exception e) {

            }
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Oops, something bad");
            result = 0;
        } catch (Exception e) {
            System.out.println("Oops, something bad 2");
            result = -1;
        } finally {
            System.out.println("this is the end of try block");
        }
        System.out.println(result);
    }
}
