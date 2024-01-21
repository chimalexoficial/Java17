package ObjectOriented20;

public class Recipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Get the raw materials");
    }

    @Override
    void cleanup() {
        System.out.println("Cleaning utensils");
    }
}