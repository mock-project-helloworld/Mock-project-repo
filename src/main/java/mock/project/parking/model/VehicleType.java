package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class VehicleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_type_id")
    private Long vehicleTypeId;
    private String vehicleTypeName;

    @OneToMany(mappedBy = "vehicleTypeId")
    private Set<Vehicle> vehicleSet;

    @OneToMany(mappedBy = "vehicleTypeId")
    private Set<ParkingPrice> parkingPriceSet;
}
