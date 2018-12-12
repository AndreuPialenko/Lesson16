public enum Color {
    BLACK("black"),
    RED("red"),
    BLUE("blue"),
    WHITE("white");

    private String name;

    private Color(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
