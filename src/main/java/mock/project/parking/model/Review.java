package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id", nullable = false, referencedColumnName = "parking_lot_id")
    private ParkingLot parkingLotId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User userId;
}
