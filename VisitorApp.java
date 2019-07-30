package visitor;

public class VisitorApp {

    public static void main(String[] args) {
//        Element body = new BodyElement();
//        Element eng = new EngineElement();
        Element car = new Car(); // все элементы уже в тачке
//        Element wheel = new WheelElement("Left bot");

        Visitor hooligan = new HooliganVisitor();
        Visitor mech = new MechanicalVisitor();

//        body.accept(hooligan);
//        eng.accept(hooligan);
        car.accept(mech);
//        wheel.accept(mech);
    }
}
