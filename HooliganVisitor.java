package visitor;

public class HooliganVisitor implements Visitor {

    @Override
    public void visit(BodyElement body) {
        System.out.println("Crush");
    }

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Power on");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Kick " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Smock inside a car");
    }
}
