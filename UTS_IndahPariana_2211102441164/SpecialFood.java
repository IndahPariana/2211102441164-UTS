import greenfoot.*;

public class SpecialFood extends Actor {
    private int value; // Nilai khusus untuk makanan ini

    public SpecialFood(int value) {
        this.value = value;
        // Set gambar makanan khusus
        setImage("images/hamburger.png");
    }

    public int getValue() {
        return value;
    }
}
