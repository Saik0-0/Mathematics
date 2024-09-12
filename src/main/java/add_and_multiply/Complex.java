package add_and_multiply;

public class Complex implements Element{
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
        return re + " + "+ im + "i";
    }

    @Override
    public Complex add(Element other) {
        if (other instanceof Complex cOther) {
            return new Complex(re + cOther.getRe(),
                    im + cOther.getIm());
        } else
            throw new IllegalArgumentException("Not a Complex argument");
    }

    @Override
    public Complex multiply(Element other) {
        if (other instanceof Complex cOther) {
            return new Complex(re * cOther.getRe() + -1 * im * cOther.getIm(),
                    re * cOther.getIm() + im * cOther.getRe());
        }
        else
            throw new IllegalArgumentException("Not a Complex argument");
    }
}
