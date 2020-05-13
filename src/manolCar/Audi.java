package manolCar;

public class Audi extends Car{
    private boolean allRoad;
    public Audi(){
        super("Audi");
        allRoad = false;
    }
    public Audi(String model, int price, String VIN, boolean allRoad){
        super("Audi",model,price,VIN);
        this.allRoad = allRoad;

    }
    @Override
    public void drive(){
        System.out.println("Lead by technology...");
        if(allRoad){
            System.out.println("You can feel the power of allRoad...");
        }
    }
}
