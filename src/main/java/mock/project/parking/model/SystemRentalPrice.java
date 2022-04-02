package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class SystemRentalPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "system_rental_price_id")
    private Long systemRentalPriceId;
    private String systemRentalPriceName;
    private String duration;
    private Double price;

    @OneToMany(mappedBy = "systemRentalPriceId")
    private Set<SystemRentalInvoice> systemRentalInvoiceSet;
}
