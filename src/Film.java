public class Film {
    public boolean pentruCopii;
    public String nume;

    Film(){
        this.pentruCopii = false;
        this.nume = "unknown";
    }
    Film(boolean pentruCopii, String nume){
        this.pentruCopii=pentruCopii;
        this.nume = nume;
    }

    public void afiseazaPentruCopii(){
        if (pentruCopii){
            System.out.println(this.nume+" e un film potrivit pentru copii");
        }
        else
        {
            System.out.println(this.nume+" nu e potrivit pentru copii");
        }
    }

}
