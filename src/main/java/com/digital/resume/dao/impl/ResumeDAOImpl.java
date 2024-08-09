package com.digital.resume.dao.impl;

import com.digital.resume.model.Contact;
import com.digital.resume.model.Project;
import com.digital.resume.model.Resume;
import org.springframework.stereotype.Repository;
import com.digital.resume.dao.ResumeDao;

import java.util.Arrays;

@Repository
public class ResumeDAOImpl implements ResumeDao {
    @Override
    public Resume getResume() {

        Resume resume = new Resume();
        resume.setName("Nunna Surya Narayana");
        resume.setJobTitle("Senior Software Engineer");
        resume.setSummary("With over 4 + 1 (Intern) years of proven experience...");

        // Core Competencies
        resume.setCoreCompetencies(Arrays.asList(
                "Full Stack Developer",
                "Scrum and Jira Planning",
                "Adaptive to New Technologies",
                "Team and Time Management",
                "Flexibility in Adapting to New Environments"
        ));

        // Tools and Technologies
        resume.setToolsAndTechnologies(Arrays.asList(
                "Java Full Stack (Java Spring Boot, Angular, MySQL)",
                "Mean Stack Developer (Node.js, Express.js, Angular, MongoDB)",
                "Dot Net Core",
                "Java Spring Boot",
                "GIT",
                "Sprint and Jira Planning",
                "Visual Studio Code, Visual Studio, IntelliJ, Eclipse...",
                "AWS, Azure DevOps",
                "Microservice Architecture",
                "IoT, Machine Learning (Beginner)"
        ));

        // Education
        resume.setEducation("Computer Science and Engineering from Godavari Institute of Engineering and Technology (Autonomous)");

        // Projects
        Project project1 = new Project();
        project1.setName("CoFY Application");
        project1.setRole("Full Stack Developer");
        project1.setResponsibilities(Arrays.asList(
                "API Design, Development, and Maintenance",
                "Security Vulnerability Management",
                "Automated Testing",
                "Collaboration and Documentation"
        ));

        // Add more projects similarly...
        resume.setProjects(Arrays.asList(project1));

        // Achievements
        resume.setAchievements(Arrays.asList(
                "Promoted Thrice in the Last Four Years at Virtusa...",
                "Oracle Certified Associate Java SE 8 Programmer (2020)",
                "Certification in Java Programming from Microsoft Technology Associate",
                "Identified as the Top Performer for FY22 at Virtusa",
                "Awarded by the Global Delivery Head as a Mark of Appreciation for Efforts in GCTS Team",
                "Provided Major Design and Development Contributions for Patent US-11604662-B2"
        ));

        // Contact
        Contact contact = new Contact();
        contact.setPhone("8328619345");
        contact.setEmail("suryanarayananunna0612@gmail.com");
        resume.setContact(contact);

        return resume;
    }
}
