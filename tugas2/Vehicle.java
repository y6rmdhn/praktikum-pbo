package tugas2;

/*
@author
NAMA                : Muhamad Yopan Ramadhan
KELAS               : Reguler C
NIM                 : 221106042905
Deskripsi Program   : Program untuk menampilkan jenis kendaraan

*/

public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle (){
    }

    public String getMyBrand(){
        return myBrand;
    }

    public void setMyBrand(String myBrand){
        this.myBrand = myBrand;
    }

    public String getMyModel(){
        return myModel;
    }

    public void setMyModel(String myModel){
        this.myModel = myModel;
    }

    class Bicycle extends Vehicle{
        private int myGearCount;

        //construktor
        public Bicycle(String myBrand, String myModel, int myGearCount){
            super.setMyBrand(myBrand);
            super.setMyModel(myModel);
            this.myGearCount = myGearCount;
            System.out.println("Brand : "+myBrand+ "\n" + "Model : " +myModel+ "\n" + "Jumlah Gear : "+myGearCount);
        }

        public int getMyGearCount() {

            return myGearCount;
        }

        public void setMyGearCount(int myGearCount){

            this.myGearCount = myGearCount;
        }
    }
        class Skateboard extends Vehicle{
            private Double myBoardLength;

            //constructor
            public Skateboard(String myBrand, String myModel, Double myBoardLength){
                super.setMyBrand(myBrand);
                super.setMyModel(myModel);
                this.myBoardLength = myBoardLength;
                System.out.println("Brand : "+myBrand+ "\n" + "Model : " +myModel+ "\n" + "Panjangnya Board : "+myBoardLength);
        }

        public Double getMyBoardLength(){

                return myBoardLength;
        }

        public void setMyBoardLength(Double myBoardLength){
                this.myBoardLength = myBoardLength;
        }
    }
}
