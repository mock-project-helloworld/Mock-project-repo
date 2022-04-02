package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;
    private String licensePlate;
    private String color;
    private String brand;

    @OneToMany(mappedBy = "vehicleId")
    private Set<UserInvoice> userInvoiceSet;

    @ManyToOne
    @JoinColumn(name= "vehicle_type_id", nullable = false, referencedColumnName = "vehicle_type_id")
    private VehicleType vehicleTypeId;
}
