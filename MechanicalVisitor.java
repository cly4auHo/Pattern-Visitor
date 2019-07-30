package visitor;

public class MechanicalVisitor implements Visitor {

    @Override
    public void visit(BodyElement body) {
        System.out.println("Check body");
    }

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Check " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Check car");
    }
}
