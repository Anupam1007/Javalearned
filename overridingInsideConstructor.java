class Glyph {
void draw() { System.out.print("Glyph.draw()"); }
Glyph() {
System.out.print("Glyph() before draw()");
draw();
System.out.print("Glyph() after draw()");
}
}
class RoundGlyph extends Glyph {
private int radius = 1;
RoundGlyph(int r) {
radius = r;
System.out.print("RoundGlyph.RoundGlyph(), radius = " + radius);
}
void draw() {
System.out.print("RoundGlyph.draw(), radius = " + radius);
}
}
public class overridingInsideConstructor {
public static void main(String[] args) {

 new RoundGlyph(5);
}
}