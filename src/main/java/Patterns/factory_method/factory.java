package Patterns.factory_method;

interface Dog{
    public void speak();
}
class Poodle implements Dog{
    public void speak(){
        System.out.println("The Poodle say \"arf\"");
    }
}
class Rottweiler implements Dog{
    public void speak(){
        System.out.println("The Rottweiler says \"WOOF!\"");
    }
}
class Husky implements Dog{
    public void speak(){
        System.out.println("The Husky says\"Dude, what's up?\"");
    }
}
class DogFactory{
    public static Dog getDog(String criteria){
        if (criteria.equals("small")) {
            return new Poodle();
        } else if(criteria.equals("big")){
            return new Rottweiler();
        } else if (criteria.equals("working")){
            return new Husky();
        }
        return null;
    }
}

public class factory {
    public static void main(String[] args) {
Dog dog=DogFactory.getDog("small");
        dog.speak();
        dog = DogFactory.getDog("big");
        dog.speak();
        dog =DogFactory.getDog("working");
        dog.speak();
    }
}
