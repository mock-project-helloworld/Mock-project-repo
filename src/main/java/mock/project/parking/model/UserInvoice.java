package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_invoice_id")
    private Long userInvoiceId;
    private String startDate;
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "slot_id", nullable = false, referencedColumnName = "slot_id")
    private Slot slotId;

    @ManyToOne
    @JoinColumn(name = "parking_price_id", nullable = false, referencedColumnName = "parking_price_id")
    private ParkingPrice parkingPriceId;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false, referencedColumnName = "vehicle_id")
    private Vehicle vehicleId;
}
