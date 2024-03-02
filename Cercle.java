import java.lang.Override;
import java.util.InputMismatchException;

public class Cercle extends Form {
    private double rayon;

    public Cercle(){
        super();
        this.rayon = 0;
    }

    @Override
    public void saisir(){
        try{
            System.out.println("entrer le rayon du cercle : ");
            this.rayon = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ereur: veuiller entrer une valeur valide");
        }    
    }

    @Override
    public String toString(){
        return "Rayon du Cercle : " + this.rayon + " cm ";
    }
    
    private double formatDecimal(double value){
        return Math.round(value * 100.0)/100.0;
    }

    //overload
    public double perimetre(){
        return formatDecimal(2*Math.PI*this.rayon);
    }

    //overload
    public double surface(){
        return formatDecimal(Math.PI * Math.pow(this.rayon , 2));
    }
}
