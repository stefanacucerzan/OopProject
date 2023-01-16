public class Animal {
   public String nume;
   public String culoare;
   public boolean vegetarian;
   public String nrPicioare;


   public Animal() {
      this.nume = "unkown";
      this.culoare = "unkown";
      this.vegetarian = false;
   }

   public Animal(String nume, String culoare, boolean vegetarian) {
      this.nume = nume;
      this.culoare = culoare;
      this.vegetarian = vegetarian;
   }
   public void mananca(){
      System.out.println("numeAnimal mananca");

   }
   public void doarme(){
      System.out.println("numeAnimal doarme");
   }
   public String afiseaza() {
      return "numeAnimal are culoarea culoare";
   }
}
