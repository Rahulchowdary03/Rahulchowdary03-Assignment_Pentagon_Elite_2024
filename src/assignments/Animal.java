package assignments;



 class Animal {
     String name;

     Animal(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }
}




 class Dog extends Animal {
     String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

     String getBreed() {
        return breed;
    }
}




 class AnimalWrapper {
     Animal animal;

    AnimalWrapper(Animal animal) {
        this.animal = animal;
    }

     Animal getAnimal() {
        return animal;
    }

     void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

