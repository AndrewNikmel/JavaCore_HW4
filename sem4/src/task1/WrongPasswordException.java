package task1;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
//        this("Неверный формат пароля ", Integer.valueOf(""));
        System.out.println("Ошибка");
    }
    public WrongPasswordException(String expected, Integer current) {
        super(String.format(" Ожидалась длина пароля  не меньше %s символов, введено %s символов", expected, current));
    }
}
