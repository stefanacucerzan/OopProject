
public class Film {
    private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPtCopii;
    public static String unText = "Toate filmele sunt frumoase";

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Film(){
        this.titlu = "unknown";
        this.anProductie = 2000;
        this.rating = 10;
        this.potrivitPtCopii = false;
        System.out.println("Primul constructor e apelat");
    }

    public Film(String titlu, int anProductie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.potrivitPtCopii = potrivitPtCopii;
    }


    public void afiseazaDacaEPotrivitPtCopii(){
        if (this.potrivitPtCopii){
            System.out.println(this.titlu+" e potrivit pt copii");
        }
        else {
            System.out.println(this.titlu+" nu e potrivit pentru copii");
        }
    }

    public String afiseazaRating(){
        return (this.titlu+" are rating "+this.rating);
    }

    public static String afiseazaUnText(){
        return(unText);
    }

    public static void afiseazaunTextVoid(){
        System.out.println(unText);
    }


}