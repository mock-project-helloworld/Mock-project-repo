package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Long historyId;

    @ManyToOne
    @JoinColumn(name = "slot_id", nullable = false, referencedColumnName = "slot_id")
    private Slot slotId;

    private String timeCheckIn;
    private String timeCheckOut;
    private String licensePlates;
    private Double money;

}
