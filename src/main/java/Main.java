import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            MaxDigitSum processor = new MaxDigitSum();
            int currentNumber;
            System.out.println("Введите целые числа (введите 0 для завершения):");
            while ((currentNumber = scanner.nextInt()) != 0) {
                processor.processNumber(currentNumber);
            }

            if (processor.hasMaxSumNumber()) {
                System.out.println("Число с максимальной суммой цифр: " + processor.getMaxSumNumber());
            }

            else {
                System.out.println("Никаких чисел не было введено.");
            }

        } catch (Exception e) {
            System.out.println("Было введено не корректное значение");
        }
    }
}
