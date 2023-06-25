package DTO;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour)
    {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Weight: ");
        weight = sc.nextInt();
        sc.nextLine();
        System.out.print("Colour: ");
        colour = sc.nextLine();
    }
    @Override
    public void output()
    {
        super.output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+colour);
    }
}
