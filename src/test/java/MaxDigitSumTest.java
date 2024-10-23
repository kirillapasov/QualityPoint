import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxDigitSumTest {

    @Test
    public void testMaxSumOfDigits() {
        MaxDigitSum processor = new MaxDigitSum();
        processor.processNumber(123);
        processor.processNumber(999);
        processor.processNumber(1111);
        assertTrue(processor.hasMaxSumNumber(), "Должно быть выбрано максимальное число.");
        assertEquals(999, processor.getMaxSumNumber(), "Число с максимальной суммой цифр должно быть 999.");
    }
}