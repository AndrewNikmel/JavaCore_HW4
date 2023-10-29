package task2;

public class AmountException extends RuntimeException {
    public AmountException() {
        super("Ошибка! Необходимо покупать товар количеством от 1 до 100");
    }
}