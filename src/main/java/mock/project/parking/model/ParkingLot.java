package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parking_lot_id")
    private Long parkingLotId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User userId;

    @OneToMany(mappedBy = "parkingLotId")
    private Set<SystemRentalInvoice> systemRentalInvoiceSet;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false, referencedColumnName = "address_id")
    private Address addressId;

    private String parkingLotName;

    private String status;
    private Long carSlots;
    private Long motorSlots;
    private Long vanSlots;
}
