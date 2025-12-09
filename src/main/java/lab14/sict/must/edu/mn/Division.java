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
     * @throws IllegalArgumentException Тэгээр хуваах оролдлого
     */
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}