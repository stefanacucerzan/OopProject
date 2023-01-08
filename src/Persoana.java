public class Persoana {
    String nume;
    String prenume;
    int age;
    String gen;

    Persoana(){
        gen = "m";
        nume = "unknown";
        prenume = "unknown";
        age = 18;
    }

    //this se refera la atributul din clasa curenta
    Persoana(String nume,String prenume){
        this.nume = nume;
       this.prenume = prenume;
    }

    public Persoana(String nume, String prenume, int age, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.gen = gen;
    }
}
