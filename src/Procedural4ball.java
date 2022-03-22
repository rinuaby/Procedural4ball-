import processing.core.PApplet;

public class Procedural4ball extends PApplet {

    public static final int Height = 480;
    public static final int Width = 640;
    public static final int Diameter = 10;
    public static int position = 0;

    @Override
    public void settings() {
        super.settings();
        size(Width, Height);
    }

    @Override
    public void draw() {
        for (int s = 1; s<= 4; s++) {
            ball(s*position,s*Height/5);
        }
        position +=1;
    }

    private void ball(int positionX, int height) {
        ellipse(positionX,height,Diameter, Diameter);
    }
    
    public static void main(String[] args) {
        PApplet.main("Procedural4ball",args);
    }
}