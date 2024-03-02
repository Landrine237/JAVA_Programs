public class Main_Form {
    public static void main(String[] args){
        Form[] shape = new Form[3];
        shape[0] = new Rectangle();
        shape[1] = new Cercle();
        shape[2] = new Trapeze();

        for(Form sh : shape){
            sh.saisir();
            System.out.println(sh.toString());
            System.out.println(" Perimetre : " +  sh.perimetre()  + "  cm.  ");
            System.out.println(" Surface : " +  sh.surface()  + "  cm au carre.  ");
            System.out.println();
        }
        shape[0].sc.close();
    }
    
}
