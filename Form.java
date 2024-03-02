import java.util.Scanner;

abstract class Form {
    private double x;
    private double y;
    protected Scanner sc;

    public Form() {
        this.x = 0;
        this.y = 0;
        this.sc = new Scanner(System.in);
    }

    public void saisir(){}

    public String toString(){
        return "Dimensions : " + x + "cm" + " " + y + "cm";
    }

    public abstract double perimetre();

    public abstract double surface();
}
