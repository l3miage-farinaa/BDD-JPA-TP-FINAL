package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class TestCenterEntity {
    @Id
    private Long id ;
    @Enumerated(EnumType.ORDINAL)
    private TestCenterCode code ;
    private String university ;
    private String city ;

    @OneToMany(mappedBy = "testCenter")
    private Set<CandidateEntity> candidates ;

    @OneToMany(mappedBy = "testCenter")
    private Set<ExaminerEntity> examiners ;
}
