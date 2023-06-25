package DTO;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {

    }
    public Vase(int value, String creator, int height, String material)
    {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.print("Material: ");
        material = sc.nextLine();
    }
    @Override
    public void output()
    {
        super.output();
        System.out.println("Height: "+height);
        System.out.println("Material: "+material);
    }
}
