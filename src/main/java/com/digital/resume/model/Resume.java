package com.digital.resume.model;

import java.util.List;

public class Resume {
    private String name;
    private String jobTitle;
    private String summary;
    private List<String> coreCompetencies;
    private List<String> toolsAndTechnologies;
    private String education;
    private List<Project> projects;
    private List<String> achievements;
    private Contact contact;

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(List<String> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public List<String> getToolsAndTechnologies() {
        return toolsAndTechnologies;
    }

    public void setToolsAndTechnologies(List<String> toolsAndTechnologies) {
        this.toolsAndTechnologies = toolsAndTechnologies;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
