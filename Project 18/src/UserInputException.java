// допишите код UserInputException
class UserInputException extends Exception {

    // Конструктор без параметров
    public UserInputException() {
        super();
    }

    // Конструктор с коротким текстом об ошибке
    public UserInputException(String message) {
        super(message);
    }
}

