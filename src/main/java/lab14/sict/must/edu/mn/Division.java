package lab14.sict.must.edu.mn;

/**
 * Тооны хуваах үйлдэл хийдэг класс.
 */
public class Division {

    /**
     * Хоёр тоог хуваана.
     *
     * @param a Хуваагдах тоо
     * @param b Хуваагч тоо
     * @return Ногдол
     * @throws IllegalArgumentException Тэгээр хуваах эсвэл буруу утга
     */
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new IllegalArgumentException("NaN утга хүлээн авах боломжгүй");
        }
        if (Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new IllegalArgumentException("Infinity утга хүлээн авах боломжгүй");
        }
        return a / b;
    }
}