package kg.megacom.testtask.models.entries;

import kg.megacom.testtask.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String imageUri;
    @Enumerated(EnumType.STRING)
    private Status status;
}