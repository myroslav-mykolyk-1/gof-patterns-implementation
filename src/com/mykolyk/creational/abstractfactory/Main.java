package com.mykolyk.creational.abstractfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = createGUIFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();
    }

    static GUIFactory createGUIFactory() {
        System.out.println("Choose the OS (Write the number):\n1 - MacOS\n2 - Windows");
        Scanner scanner = new Scanner(System.in);
        int loggingTypeOption = scanner.nextInt();
        return switch (loggingTypeOption) {
            case 1 -> new MacOSGUIFactory();
            case 2 -> new WindowsGUIFactory();
            default -> throw new RuntimeException("OS is not present at the menu!");
        };
    }
}
