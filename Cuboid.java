//derived class
class Cuboid extends Rectangle {
    private double height;

    Cuboid(double width, double length, double height){
        // calling base class instance variables
        super(width, length);
        //in case height < 0 we set the height field value to 0
        if(height < 0){ this.height = 0; } else { this.height = height;}
    }
    double getHeight(){
        return this.height;
    }
    double getVolume(){
        return getArea() * getHeight();
    }


}
