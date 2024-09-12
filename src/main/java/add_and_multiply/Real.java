package add_and_multiply;

public class Real implements Element{
    private final double number;

    public Real(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }

    @Override
    public Real add(Element other) {
        if (other instanceof Real rOther) {
            return new Real(number + rOther.number);
        } else {
            throw new IllegalArgumentException("Not a Real argument");
        }
    }

    @Override
    public Real multiply(Element other) {
        if (other instanceof Real rOther) {
            return new Real(number * rOther.number);
        } else {
            throw new IllegalArgumentException("Not a Real argument");
        }
    }
}
