public class Elev {
    public String nume;
    public static  String diriginte;

    public Elev(String nume) {
        this.nume = nume;
    }

    public void afiseazaElevDiriginte(){
        System.out.println((this.nume+"Are ca diriginte pe"+diriginte));
    }

}
