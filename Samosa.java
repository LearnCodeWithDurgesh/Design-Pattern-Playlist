import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;

    // constructor
    private Samosa() {
        // if (samosa != null) {
        // throw new RuntimeException("You are trying to break singleton pattern");

        // }
    }

    // Lazy way of creating single object
    public static Samosa getSamosa() {
        // object of this class
        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve() {
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}

/*
 * 
 * 1. constructor private
 * 
 * 2. object create with the help of method
 * 
 * 3. create field to store object is private
 * 
 */