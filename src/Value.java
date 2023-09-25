public class Value {

    //properties
    private String name;
    private int points = 0;

    //constructors
    public Value(String name){
        this.name = name;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public void addPoint(){
        this.points++;
    }
}
