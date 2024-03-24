package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "user_info")
public class UserEntity extends TimeBaseEntity{
    @Id
    private Long id;
    @Column
    private String userName;
    @Column
    private String password;
}
