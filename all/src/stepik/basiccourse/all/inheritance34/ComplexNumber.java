package stepik.basiccourse.all.inheritance34;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        final double d;
        this.re = re;
        this.im = im;
    }

    double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return (Double.hashCode(getIm()) + Double.hashCode(getRe()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber number = (ComplexNumber) obj;
        return getIm() == number.getIm() && getRe() == number.getRe();
    }
}