package P4_Say_Hello_Extended;

public interface Person {
    String getName();
    default String sayHello() {
        return "Hello";
    }

}
