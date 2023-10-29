package task1;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        this("Неверный формат login ", Integer.valueOf("меньше 20 символов "));
    }

    public WrongLoginException(String expected, Integer current) {
        super(String.format("Ожидалась длина login меньше 20 символов %s символов, введено %s символов", expected, current));
    }
}
