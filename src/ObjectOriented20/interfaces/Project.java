package ObjectOriented20.interfaces;

import ObjectOriented20.DummyAlgorithm;

public class Project {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10, 20));
    }
}
