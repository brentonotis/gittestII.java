public class PersonInfo {
   private int numKids;

   public void setNumKids(int personsKids) {
      numKids = personsKids;
      return;
   }

   public void incNumKids() {
      numKids = numKids + 1;
      return;
   }

   public int getNumKids() {
      return numKids;
   }
}