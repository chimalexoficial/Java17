package ObjectOriented20;

public class RecipeWithMicrowave extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the micro");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Cleaning utensils");
        System.out.println("Switch off the micro");

    }
}

