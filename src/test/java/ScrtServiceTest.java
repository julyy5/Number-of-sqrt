import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class ScrtServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "7, 200, 450",
            "19, 150, 1000"
    })
    public void testNumberOfSqrt(int expected, int first, int end) {
        SQRService service = new SQRService();
        int actual = service.numberOfSqrt(first, end);
        Assertions.assertEquals(expected, actual);
    }
}

