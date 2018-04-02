package software.perfekt.gnaf.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(length = 200, nullable = false)
    private String email;

    @Column(length = 128, nullable = false)
    private String password;

    @Column(length = 200, name = "name")
    private String name;

    @Column(length = 200, name = "middleName")
    private String middleName;

    @Column(length = 200, name = "lastName")
    private String lastName;

    @Column(length = 200)
    private String company;

    @Column(length = 200, nullable = false)
    private String phone;
}
