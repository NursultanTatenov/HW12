package com.company;

public class Dog {
    private String breedType;
    private String color;
    private String habitatPlace;
    private int age;
    private String cartoon;

    void setCartoon(String cartoonVar){
        cartoon=cartoonVar;
    }

    String getCartoon(){
        return cartoon;
    }

    void setBreedType(String BreedTypeVar) {
        breedType = BreedTypeVar;
    }

    void setColor(String colorVar) {
        color = colorVar;
    }

    void setHabitatPlace(String habitatPlaceVar) {
        habitatPlace = habitatPlaceVar;
    }

    void setAge(int ageVar) {
        age = ageVar;
    }

    String getBreedType() {
        return breedType;
    }

    public String getColor() {
        return color;
    }

    public String getHabitatPlace() {
        return habitatPlace;
    }

    public int getAge() {
        return age;
    }
}
