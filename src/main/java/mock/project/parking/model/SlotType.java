package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class SlotType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slot_type_id")
    private Long slotTypeId;

    private String slotTypeName;

    private Double price_per_day;

    @OneToMany(mappedBy = "slotTypeId")
    private Set<Slot> slotSet;
}
