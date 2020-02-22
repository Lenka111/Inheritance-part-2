//base class
class Rectangle {
    //fields
    private double width, length;

    //constructor
    Rectangle(double width, double length){
        if(width < 0 ){ this.width = 0; } else { this.width = width; }
        if(length < 0){ this.length = 0; } else { this.length = length; }
    }

    //instance methods
    double getWidth(){
        //return the value of width field
        return this.width;
    }
    double getLength(){
        //return the value of length field
        return this.length;
    }
    // calculate area of a rectangle
    double getArea(){
        return (width * length);
    }
}
