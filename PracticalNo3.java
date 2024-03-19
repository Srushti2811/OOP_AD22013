public class PracticalNo3 {

    
    public double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

   
      public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        PracticalNo3 calculator = new PracticalNo3();

       
        Double cubeVolume = calculator.calculateVolume(4.0);
        Double cylinderVolume = calculator.calculateVolume(2.0, 5.0);
        Double boxVolume = calculator.calculateVolume(2.5, 4.0, 5.0);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Box: " + boxVolume);
    }
}


