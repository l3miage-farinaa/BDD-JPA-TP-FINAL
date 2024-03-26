package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    @Column(scale = 2)
    private double grade;

    private LocalDateTime submissionDate;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;

    @ManyToOne
    private ExamEntity examEntity;

    @ManyToOne
    private CandidateEntity candidateEntity;

}
