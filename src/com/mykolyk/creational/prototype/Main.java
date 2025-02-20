package com.mykolyk.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Project mainProject = new Project(1, "Main Project", "Source code of Main Project");
        System.out.println(mainProject);

        ProjectCreator projectCreator = new ProjectCreator(mainProject);
        Project cloneProject = projectCreator.cloneProject();
        System.out.println(cloneProject);
    }
}
