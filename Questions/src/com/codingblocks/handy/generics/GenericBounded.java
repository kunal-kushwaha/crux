package com.codingblocks.handy.generics;

class GenericBounded {
    public static void main(String args[]) {
        Boxes<Integer> box1 = new Boxes<Integer>(new Integer(6), new Integer(5), new Integer(3));
        Boxes<Integer> box2 = new Boxes<Integer>(7, 2, 10); // autoboxing parameters
        Boxes<Float> box3 = new Boxes<Float>(4.25f, 3.0f, 10.0f);
        Boxes<Double> box4 = new Boxes<Double>(11.5, 5.0, 6.5);
        Boxes<Byte> box5 = new Boxes<Byte>((byte)0xA, (byte)0x13, (byte)0xB);

//        Boxes<Human> box = new Boxes<Human>(1,2,3); // Error cuz human is not a subclass of Number

        System.out.println("The volume of box1 is: " + box1.getVolume());
        System.out.println("The volume of box2 is: " + box2.getVolume());
        System.out.println("The volume of box3 is: " + box3.getVolume());
        System.out.println("The volume of box4 is: " + box4.getVolume());
        System.out.println("The volume of box5 is: " + box5.getVolume());
    }
}

class Human{

}

class Boxes<T extends Number> {
    private T length;
    private T height;
    private T width;

    Boxes(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    double getVolume () {
        return (length.doubleValue() * height.doubleValue() * width.doubleValue());
    }
}