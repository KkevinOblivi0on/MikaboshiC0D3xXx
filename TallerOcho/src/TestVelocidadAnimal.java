public class TestVelocidadAnimal {
   public static void main(String[] args) {
      Animal animal1 = new Animal();
      Animal animal2 = new Animal(75, 6, 3.5);
      
      System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + " millas por hora.");
      System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + " millas por hora.");
   }
}
