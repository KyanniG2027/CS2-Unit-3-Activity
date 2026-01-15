public class Pet {
    // 1. Declare INSTANCE VARIABLES
    
    // 2. Define CONSTRUCTOR
    
    // 3. Define METHODS (getters, toString, setters)

    private String name;
    private int age;
    private double weight;
    private String type; 
    private boolean sterile; 
 

    public Pet (){
        this.name= "sparkles"; 
        this.age = "0";
        this.weight= "0"; 
        this.type ="guinea pig";
        this.sterile ="yes"; 
     }
    
    public Pet (String n, int a, double w, String t, boolean s){

        this.name= n;
        this.age= a;
        this.weight= w;
        this.type = t;
        this.sterile = s;
      }

      //METHODS 
      public String getName(){
        return name;
      }
      public int getAge(){
        return age; 
      }
      public double getWeight(){
        return weight;
      }
      public String getType(){
        return type;
      }
      public boolean getSterile(){
        return sterile;
      }
  
        // toString method 
        public String toString(){
          String state = "Pet[" + name + "," + age + "," + weight + "," + type + "," + sterile + "]";
          return state; 
        }
      
        public void setName(String newName){
          this.name = newName;
        }
        public void setAge (int newAge){
          this.age = newAge; 
       }
        public void setWeight (double newWeight){
          this.weight = newWeight; 
        }
        public void setType (String newType ){
          this.type = newType; 
        }
        public void setSterile (boolean newSterile){
          this.sterile = newSterile; 
        }

        







}