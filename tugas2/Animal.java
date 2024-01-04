package tugas2;

/*
@author
NAMA                : Satrio Teguh Hutomo
KELAS               : Reguler C
NIM                 : 221106042963
Deskripsi Program   : Program Menampilkan Ciri Ciri Hewan

*/

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats(){
        return eats;
    }

    public int getNoOfLegs(){
        return noOfLegs;
    }

    class Rabbit extends Animal{
        private String color;
        private String name;

        public Rabbit(String name, boolean veg, String food, int legs, String color){
            super(veg, food, legs);
            this.name = name;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal(false, "grass", 4);
        Animal.Rabbit rabbit = animal.new Rabbit("Peter", false, "grass", 4, "grey");

        System.out.print("Hello, His name is " + rabbit.getName());
        System.out.print("\n"+rabbit.getName()+" is Vegetarian? "+rabbit.isVegetarian());
        System.out.print("\n"+rabbit.getName()+" eats "+rabbit.getEats());
        System.out.print("\n"+rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.print("\n"+rabbit.getName()+" color is "+rabbit.getColor());

    }
}
