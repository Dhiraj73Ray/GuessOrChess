public class ChessPiece {
    String name;
    String color;
    String position;

    // public ChessPiece(){

    // }

    public ChessPiece(String name, String color, String position) {
        this.name = name;
        this.color = color;
        this.position = position;
    } 
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

}
