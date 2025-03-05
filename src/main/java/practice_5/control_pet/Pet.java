package practice_5.control_pet;

public abstract class  Pet {
   private String pet;

   public Pet(String pet) {
       this.pet = pet;
   }

   abstract void play();
   abstract void feed();
   abstract void walking();
}
