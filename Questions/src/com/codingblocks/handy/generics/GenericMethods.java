package com.codingblocks.handy.generics;

class GenericMethods {
    public static void main(String args[]) {
        Box<Integer> box1 = new Box<>(7, 2, 10); // autoboxing parameters
        Box<Double> box2 = new Box<>(11.5, 5.0, 6.5);
        System.out.println("The volume of box1 is: " + box1.getVolume());
        System.out.println("The volume of box2 is: " + box2.getVolume());

        System.out.println("Invoking static generic method calculateVolume: " + Box.<Integer>calculateVolume(5, 7, 12)); // autoboxing to Integer
        System.out.println("Invoking static generic method calculateVolume: " + Box.calculateVolume(5.3, 7, 12.1)); // autoboxing to Double
        System.out.println();

        OldBox ob = new OldBox(5, 5, 5);
        System.out.println("The volume of ob is: " + ob.getVolume());
        System.out.println("OldBox calculateVolume: " + OldBox.calculateVolume(6.1, 7, 3.6));
        System.out.println("OldBox calculateVolume: " + OldBox.calculateVolume(new Byte((byte)0xA), new Double(4.75), new Integer(5)));
        System.out.println();

        byte b = 0xA;
        short s = 8;
        int i = 7;
        float f = 3.5f;
        double d = 1.25;

        VolumeDisplayer.cubeVolume(b, i, f, "my cube");
        VolumeDisplayer.cylinderVolume(d, s, "my cylinder");
    }
}

class Box<T extends Number> {
    private T length;
    private T height;
    private T width;

    Box(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    double getVolume () {
        return (length.doubleValue() * height.doubleValue() * width.doubleValue());
    }

    static <V extends Number> double calculateVolume(V gLength, V gHeight, V gWidth) {
        return (gLength.doubleValue() * gHeight.doubleValue() * gWidth.doubleValue());
    }
}

class OldBox {
    private int length;
    private int height;
    private int width;

    OldBox(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    int getVolume () {
        return (length * height * width);
    }

    static <T extends Number> double calculateVolume(T gLength, T gHeight, T gWidth) {
        return (gLength.doubleValue() * gHeight.doubleValue() * gWidth.doubleValue());
    }
}

class VolumeDisplayer {

    static <T extends Number> void cubeVolume(T gLength, T gHeight, T gWidth, String s) {
        System.out.println("The volume of " + s + " is: " + (gLength.doubleValue() * gHeight.doubleValue() * gWidth.doubleValue()));
    }

    static <T extends Number> void cylinderVolume(T radius, T height, String s) {
        System.out.println("The volume of " + s + " is: " + (3.14159 * (radius.doubleValue() * radius.doubleValue()) * height.doubleValue()));
    }

}
