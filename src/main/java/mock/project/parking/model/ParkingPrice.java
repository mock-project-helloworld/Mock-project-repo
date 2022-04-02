package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class ParkingPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parking_price_id")
    private Long parkingPriceId;
    private String duration;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", nullable = false, referencedColumnName = "vehicle_type_id")
    private VehicleType vehicleTypeId;

    @OneToMany(mappedBy = "parkingPriceId")
    private Set<UserInvoice> userInvoiceSet;
}
