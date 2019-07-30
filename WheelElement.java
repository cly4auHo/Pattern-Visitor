package visitor;

public class WheelElement implements Element {

    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public WheelElement(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
