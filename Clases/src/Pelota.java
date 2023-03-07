import java.awt.*;

public class Pelota {

    private Color color;
    private int radio;
    private boolean rebota;
    private String  material;

    public Pelota(){
        material = "Caucho";
        rebota = true;
        radio = 10;
        color = Color.RED;

    }
    public Pelota(Color color, int radio, boolean rebota, String material) {
        this.color = color;
        this.radio = radio;
        this.rebota = rebota;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isRebota() {
        return rebota;
    }

    public void setRebota(boolean rebota) {
        this.rebota = rebota;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "Color =" + color +
                ", Radio=" + radio +
                ", Rebota=" + rebota +
                ", Material='" + material + '\'' +
                '}';
    }
}
