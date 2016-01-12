package Patterns.Builder;

/**
 * Created by admin on 12.01.2016.
 */
public class main {
    public static void main(String[] args) {
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).build();

        System.out.println(whiteCake);
    }
}

class Cake {

    private final double sugar;
    private final double butter;
    private final int eggs;


    public static class Builder {

        private double sugar;
        private double butter;
        private int eggs;


        //builder methods for setting property
        public Builder sugar(double cup){this.sugar = cup; return this; }
        public Builder butter(double cup){this.butter = cup; return this; }
        public Builder eggs(int number){this.eggs = number; return this; }

        public Cake build() {
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;

    }


    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs +'}';

    }

}

