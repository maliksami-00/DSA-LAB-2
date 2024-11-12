public class Color {
    private int red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If the same reference, return true
        if (!(obj instanceof Color)) return false; // Check if obj is of type Color

        Color other = (Color) obj; // Cast obj to Color type
        return this.red == other.red && this.green == other.green && this.blue == other.blue;
    }

    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0); // Red
        Color color2 = new Color(255, 0, 0); // Red
        Color color3 = new Color(0, 255, 0); // Green

        System.out.println(color1.equals(color2)); // true
        System.out.println(color1.equals(color3)); // false
    }
}
