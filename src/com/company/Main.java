package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish=new Fish();

        fish.setBreedType("Clown fish");
        fish.setColor("orange-white");
        fish.setHabitatPlace("ocean");
        fish.setAge(10);
        fish.setCartoon("Finding Nemo");

        System.out.println(fish.getBreedType()+" live in "+fish.getHabitatPlace()+" "+fish.getAge()+" years and have "+fish.getColor()+" color. " +
                "The cartoon about "+fish.getBreedType()+" is '"+fish.getCartoon()+"'.");

        Parrot parrot=new Parrot();
        parrot.setBreedType("Spix's macaw");
        parrot.setColor("blue-white");
        parrot.setHabitatPlace("Brazil");
        parrot.setAge(30);
        parrot.setCartoon("Rio");

        System.out.println(parrot.getBreedType()+" live in "+parrot.getHabitatPlace()+" "+parrot.getAge()+" years and have "+parrot.getColor()+" color. " +
                "The cartoon about "+parrot.getBreedType()+" is '"+parrot.getCartoon()+"'.");

        Cat cat=new Cat();
        cat.setBreedType("Scottish Fold");
        cat.setColor("red-headed");
        cat.setHabitatPlace("Scotland");
        cat.setAge(15);
        cat.setCartoon("Shrek 2");

        System.out.println(cat.getBreedType()+" live in "+cat.getHabitatPlace()+" "+cat.getAge()+" years and have "+cat.getColor()+" color. " +
                "The cartoon about "+cat.getBreedType()+" is '"+cat.getCartoon()+"'.");

        Dog dog=new Dog();
        dog.setBreedType("Dolmatian");
        dog.setColor("white with black spots");
        dog.setHabitatPlace("land");
        dog.setAge(15);
        dog.setCartoon("101 dalmatians");

        System.out.println(dog.getBreedType()+" live in "+dog.getHabitatPlace()+" "+dog.getAge()+" years and have "+dog.getColor()+" color. " +
                "The cartoon about "+dog.getBreedType()+" is '"+dog.getCartoon()+"'.");







    }
}
