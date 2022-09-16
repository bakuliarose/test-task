package kg.megacom.testtask.models;

import kg.megacom.testtask.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private Status status;
}