package FlyweightPattern;

// MarkerStyle class representing shared styles for map markers
class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void display(String location) {
        System.out.println("Displaying " + icon + " in color " + color + " at " + location);
    }
}
