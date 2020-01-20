package by.stormnet.figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Polyline extends Figure {
    private double base;

    public Polyline( double cx, double cy, double lineWidth, Color color, double base) {
        super(Figure.FIGURE_TYPE_POLYLINE, cx, cy, lineWidth, color);
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polyline polyline = (Polyline) o;
        return Double.compare(polyline.base, base) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void draw(GraphicsContext gc) {
            gc.setLineWidth(this.lineWidth);
            gc.setStroke(this.color);
            gc.strokePolyline(new double[]{this.cx + this.base, this.cx - this.base, this.cx + this.base, this.cx - this.base}, new double[]{this.cy - this.base, this.cy - this.base, this.cx + this.base, this.cx + this.base}, 4);
        }


    }

