import ru.netology.sqr.SQRService;

public class main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(" Количество квадратов в заданном диапазоне " + service.numberOfSqrt(200,300));

    }
}
