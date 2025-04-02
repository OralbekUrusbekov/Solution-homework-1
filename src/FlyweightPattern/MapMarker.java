package FlyweightPattern;

// MapMarker class representing individual markers with shared styles
public class MapMarker {
    private String location;
    private MarkerStyle style;

    public MapMarker(String location, String icon, String color) {
        this.location = location;
        this.style = MarkerFactory.getStyle(icon, color);
    }

    public void display() {
        style.display(location);
    }
}

