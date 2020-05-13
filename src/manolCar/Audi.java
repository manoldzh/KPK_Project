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
    public String toString(){
        if(allRoad){
            return super.toString() + " and AllRoad";
        }
        return super.toString();
    }
    @Override
    public String drive(){
        String result = new String();
        result += "Lead by technology...\n";
        if(allRoad){
            result += "You can feel the power of allRoad...";
        }
        return result;
    }
}
