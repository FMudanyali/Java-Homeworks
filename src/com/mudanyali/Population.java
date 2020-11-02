package com.mudanyali;
/**
 * A program to calculate the growth rate of 2 countries.
 * Furkan MUDANYALI
 * 20181701088
 */
public class Population {
    // Declare a country class with properties.
    static class Country{
        String name;
        double population;
        double growthRate;

        public Country(String name, double population, double growthRate){
            this.name = name;
            this.population = population;
            this.growthRate = growthRate;
        }
    }
    public static void main(String[] args) {
        // Our countries
        Country turkey = new Country("Turkey", 82000000, 1.5);
        Country japan = new Country("Japan", 126500000, -0.2);

        int year = 2020;
        // Decimals omitted as it would make no sense otherwise.
        String formatText = "Population of %s: %.0f%n";

        for(int i = 1; i <= 5; ++i){
            System.out.printf("%d:%n", year + i);
            // Calculate population
            turkey.population = 
                turkey.population + turkey.population * turkey.growthRate / 100;

            japan.population = 
                japan.population + japan.population * japan.growthRate / 100;
            // Print population
            System.out.printf(formatText, turkey.name, turkey.population);
            System.out.printf(formatText, japan.name, japan.population);
        }
    }
}