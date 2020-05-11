package manolCar;

public abstract class Car implements Comparable<Car> {
    public int horsePower;
    private String model;
    public Car(){
        horsePower = 0;
        model = "default";
    }
    public Car(int horsePower, String model){
        this.horsePower = horsePower;
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public int getHorsePower(){
        return horsePower;
    }
    @Override
    public String toString(){
        return "This is " + model + " and has " + horsePower + horsePower;
    }
    public abstract void drive();
    @Override
    public int compareTo(Car c1){
        return this.getModel().compareTo(c1.getModel());
    }
    @Override
    public boolean equals(Object c){
        if(c==null){
            return false;
        }
        if(c == this){
            return true;
        }
        if(c.getClass() != this.getClass()) {
            return false;
        }
        if(((Car)c).getHorsePower() == this.getHorsePower() && ((Car)c).getModel().equals(this.getModel())) {
            return true;
        }
        return false;
    }
}