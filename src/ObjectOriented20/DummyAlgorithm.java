package ObjectOriented20;

import ObjectOriented20.interfaces.ComplexAlgorithm;

public class DummyAlgorithm implements ComplexAlgorithm {

    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 + number2;
    }
}
