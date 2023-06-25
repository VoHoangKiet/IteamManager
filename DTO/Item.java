package DTO;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        value = sc.nextInt();
        System.out.println("Enter Creator: ");
        creator = sc.nextLine();
        if(value>0)
            System.out.println("creator is not empty.");
        else
            System.out.println("creator is empty.");
    }
    public void output()
    {
        System.out.println("Value: "+value);
        System.out.println("Creator: "+creator);
    }
}
