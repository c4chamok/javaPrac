package Lab_Test1_2024;

public class Mouse {
    private String mouseName;

    public Mouse(String n) {
        mouseName = n;
    }

    public String getName() {
        return mouseName;
    }

    @Override
    public String toString() {
        return "There is a mouse named" + mouseName;
    }
}
