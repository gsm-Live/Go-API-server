package live.goapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", nullable = false)
    private Integer student_id;

    @Column(name = "name" , nullable = true , unique = true)
    private String name;

    @Column(name = "number" , nullable = true, unique = true)
    private String number;

    @Column(name = "major" , nullable = true, unique = true)
    private String major;

    public Student(String name, String number, String major) {
        this.name = name;
        this.number = number;
        this.major = major;
    }
}
