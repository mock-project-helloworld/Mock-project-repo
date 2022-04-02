package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false, referencedColumnName = "address_id")
    private Address addressId;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false, referencedColumnName = "username")
    private Account username;

    @OneToMany(mappedBy = "userId")
    private Set<ParkingLot> parkingLotSet;

    @OneToMany(mappedBy = "userId")
    private Set<Review> reviewSet;

    @OneToMany(mappedBy = "userId")
    private Set<Bank> bankSet;
}
