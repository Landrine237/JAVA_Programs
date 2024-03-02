import java.lang.Override;
import java.util.InputMismatchException;

public class Trapeze extends Form {
    private double Gb;
    private double Pb;
    private double cote1;
    private double cote2;
    private double h;

    public Trapeze(){
        super();
        this.Gb = 0;
        this.Pb = 0;
        this.cote1 = 0;
        this.cote2 = 0;
        this.h = 0;
    }

    @Override
    public void saisir(){
        try{
            System.out.println("entrer la grande base du trapeze : ");
            this.Gb = sc.nextDouble();
            System.out.println("entrer la petite base du trapeze : ");
            this.Pb = sc.nextDouble();
            System.out.println("entrer le premier cote du trapeze : ");
            this.cote1 = sc.nextDouble();
            System.out.println("entrer le deuxieme cote du trapeze : ");
            this.cote2 = sc.nextDouble();
            System.out.println("entrer la hauteur du trapeze : ");
            this.h = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ereur: veuiller entrer une valeur valide");
        }
    }

    @Override
    public String toString(){
        return "Dimension du Trapeze : " + this.Gb + " cm x " + this.Pb + " cm x " + this.cote1 + " cm x " + this.cote2 + " cm x " + this.h;
    }
    
    private double formatDecimal(double value){
        return Math.round(value * 100.0)/100.0;
    }

    //overload
    public double perimetre(){
           return (this.Gb + this.Pb + this.cote1 + this.cote2);
    }

    //overload
    public double surface(){ 
           return formatDecimal((this.Gb + this.Pb)*this.h)/2;
    }
    
}
