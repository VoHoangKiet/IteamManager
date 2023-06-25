package DTO;

import java.util.Scanner;

public class Painting extends Item {
    private int height, width;
    private boolean isWatercolour, isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean watercolour) {
        isWatercolour = watercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean framed) {
        isFramed = framed;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Height: ");
        height = sc.nextInt();
        System.out.print("Width: ");
        width = sc.nextInt();
        sc.nextLine();
        System.out.print("Is Watercolour: ");
        isWatercolour = sc.nextBoolean();
        System.out.print("Is Framed: ");
        isFramed = sc.nextBoolean();
    }

    @Override
    public void output() {
        super.input();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }
}

