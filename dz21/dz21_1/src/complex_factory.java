public class complex_factory implements complex_abstract_factory {

    @Override
    public complex create(double real, double img) {
        return new complex(real, img);
    }

}