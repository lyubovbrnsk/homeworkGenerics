package com.company;

public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox= new MagicBox<String>(3);
        magicBox.add("Hello");
        magicBox.add("World");
//        magicBox.pick();

        magicBox.add("!");
//        magicBox.pick();
//        String p = magicBox.pick();
//        System.out.println(p);

        MagicBox<Integer> magicBox1 = new MagicBox<Integer>(3);
        magicBox1.add(123);
        magicBox1.add(456);
        magicBox.pick();

//        magicBox1.add(789);
//        magicBox1.pick();
//        Integer p1 = magicBox1.pick();
//        System.out.println(p1);
    }
}
