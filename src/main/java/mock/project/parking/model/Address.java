package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    private String city;
    private String district;
    private String ward;
    private String detail;

    @OneToMany(mappedBy = "addressId")
    private Set<User> userSet;

    @OneToMany(mappedBy = "addressId")
    private Set<ParkingLot> parkingLotSet;

}
