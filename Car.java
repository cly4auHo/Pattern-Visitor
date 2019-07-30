package visitor;

public class Car implements Element {

    Element[] elements;

    public Car() {
        this.elements = new Element[]{new WheelElement("Left bot"),
            new WheelElement("Right bot"), new WheelElement("Left top"),
            new WheelElement("Right top"), new BodyElement(), new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
        visitor.visit(this);
    }
}
