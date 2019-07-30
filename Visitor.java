package visitor;

public interface Visitor {

    void visit(BodyElement body);
    void visit(EngineElement engine);
    void visit(WheelElement wheel);
    void visit(Car car);
}
