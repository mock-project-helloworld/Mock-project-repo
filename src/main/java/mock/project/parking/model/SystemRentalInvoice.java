package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SystemRentalInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "system_rental_invoice_id")
    private Long systemRentalInvoiceId;

    @ManyToOne
    @JoinColumn(name = "system_rental_price_id", nullable = false, referencedColumnName = "system_rental_price_id")
    private SystemRentalPrice systemRentalPriceId;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id", nullable = false, referencedColumnName = "parking_lot_id")
    private ParkingLot parkingLotId;
}
