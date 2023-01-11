package example;

public class SingletonePatern {
    private static SingletonePatern singletonePatern;

    private SingletonePatern() {
    }

    public static SingletonePatern getSingletonePatern() {
        if (singletonePatern == null) {
            singletonePatern = new SingletonePatern();
        }
        return singletonePatern;
    }
}
