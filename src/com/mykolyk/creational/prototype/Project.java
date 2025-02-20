package com.mykolyk.creational.prototype;

class Project implements Copyable<Project> {
    int id;
    String projectName;
    String sourceCode;

    Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }

    @Override
    public Project copy() {
        return new Project(id, projectName, sourceCode);
    }
}
