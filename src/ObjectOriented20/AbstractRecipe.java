package ObjectOriented20;

public abstract class AbstractRecipe {
    //preparation
    //recipe
    //clean up

    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();
}
