package agh.ics.oop;

public class Grass extends AbstractWorldMapElement{
    public Grass(Vector2d position){
        super(position);
    }

    public String toString(){
        return "*";
    }

    public String getPath() {
        return "src/main/resources/grass.png";
    }
}
