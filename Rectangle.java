import java.lang.Override;
import java.util.InputMismatchException;

public class Rectangle extends Form {
    private double width;
    private double height;


    public Rectangle(){
        super();
        this.width = 0;
        this.height = 0;
    }

    @Override
    public void saisir(){
        try{
            System.out.println("entrer la longueur du rectangle : ");
            this.height = sc.nextDouble();
            System.out.println("entrer la longueur du rectangle : ");
            this.width = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ereur: veuiller entrer une valeur valide");
            
        }   
    }

    @Override
    public String toString(){
        return "Dimensions du Rectangle : " + this.height + " cm x "  + this.width + " cm ";
    }

    private double formatDecimal(double value){
        return Math.round(value * 100.0)/100.0;
    }

    @Override
    public double perimetre(){
        return formatDecimal((this.height + this.width)*2);
    }

    @Override
    public double surface(){
        return formatDecimal((this.height * this.width));
    }

    
}
