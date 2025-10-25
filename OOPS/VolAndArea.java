import java.util.Scanner;

public class VolAndArea {
    
}

abstract class Shapes {
    float[] dimensions;
    float spaceOccupied;
    Scanner sc = new Scanner(System.in);

    Shapes (int dimensions) {
        this.dimensions = new float[dimensions];
    }

    abstract void initializeDimensions(int n);

    abstract float computeSpaceOccupied();
}

class TwoDimensional extends Shapes {
    
    TwoDimensional (int numberOfDimensions) {
        super(numberOfDimensions);
    }

    @Override
    void initializeDimensions(int n) {
        for (int i=0; i < n; i++) {
            this.dimensions[i] = sc.nextInt();
        }
    }

    @Override
    float computeSpaceOccupied () {
        this.spaceOccupied = 1;
        for (int i=0; i < this.dimensions.length; i++) {
            this.spaceOccupied *= dimensions[i];
        }
        return spaceOccupied;
    }
}

class ThreeDimensional extends Shapes{

    ThreeDimensional (int dimensions) {
        super(dimensions);
    }

    @Override
    void initializeDimensions(int n) {
        for (int i = 0; i < n; i++) {
            this.dimensions[i] = sc.nextInt();
        }
    }

    @Override
    float computeSpaceOccupied () {
        for (int i = 0; i < this.dimensions.length; i++) {
            this.spaceOccupied *= dimensions[i];
        }
        return spaceOccupied;
    }
}

class Square extends TwoDimensional {
    Square(int n) {
        super(n);
    }
    
    
}
