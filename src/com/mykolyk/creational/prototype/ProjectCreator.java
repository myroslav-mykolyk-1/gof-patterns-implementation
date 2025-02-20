package com.mykolyk.creational.prototype;

class ProjectCreator {
    Project project;

    ProjectCreator(Project project) {
        this.project = project;
    }

    void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
