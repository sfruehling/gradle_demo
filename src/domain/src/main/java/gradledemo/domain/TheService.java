package gradledemo.domain;

public class TheService implements AService {
    @Override
    public AForm getForm() {
        return new AForm();
    }
}
