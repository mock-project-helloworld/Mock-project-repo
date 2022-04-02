package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slot_id")
    private Long slotId;
    private String slotName;
    private String status;

    @ManyToOne
    @JoinColumn(name = "slot_type_id", nullable = false, referencedColumnName = "slot_type_id")
    private SlotType slotTypeId;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id", nullable = false, referencedColumnName = "parking_lot_id")
    private ParkingLot parkingLotId;

    @OneToMany(mappedBy = "slotId")
    private Set<History> historySet;
}
