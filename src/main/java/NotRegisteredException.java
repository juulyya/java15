public class NotRegisteredException extends RuntimeException {

    //String s = "Игра не состоялось, есть не зарегистрированные игроки";

    public NotRegisteredException(String s) {
        super(s);
    }
}
