package mock.project.parking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "`password`")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false, referencedColumnName = "role_id")
    private Role roleId;

    @OneToMany(mappedBy = "username")
    private Set<User> userSet;

}
