package ObjectOriented20;

public class RectangleEx {
    private int length;
    private int width;

    public RectangleEx(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //getters/setters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
       return length * width;
    }

    public int perimeter() {
        return 2 * (length*width);
    }

    public String toString() {
        return String.format("length - %d width - %d area - %d perimeter - %d", length, width, area(), perimeter());
    }
}
