package Lab_Test1_2024;

public class Cat {
    private String catName;
    public Cat(String n) {
        catName = n;
    }

    public void Catch(Mouse m) {
        System.out.println(catName + " caught " + m.getName());
    }

    @Override
    public String toString() {
        return "There is a cat named" + catName;
    }
}
