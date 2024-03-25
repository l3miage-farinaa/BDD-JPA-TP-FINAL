package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class ExaminerEntity extends UserEntity{
    private String login;
    private String password;

    @OneToOne
    private TestCenterEntity testCenter ;
}
