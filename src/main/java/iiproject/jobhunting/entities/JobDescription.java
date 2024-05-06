package iiproject.jobhunting.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_description_db")
public class JobDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_description_id")
    private int jobDescriptionId;

    @Column(name="job_description_address")
    private String jobDescriptionAddress;

    @Column(name="quantity")
    private String quantity;

    @Column(name="experience")
    private String experience;

    @Column(name="job_description_rank")
    private  String jobDescriptionRank;

    @Column(name="salary")
    private String salary;

    @Column(name="title")
    private String title;

    @Column(name="job_description_type")
    private String jobDescriptionType;

    @Column(name="description")
    private String description;

    @Column(name="deadline")
    private String deadline;

    @Column(name="created_at")
    private String createdAt;

    @Column(name="view")
    private int view;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="category_id")
    private Category category;

}