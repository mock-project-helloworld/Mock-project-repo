package mock.project.parking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private Long bankId;
    private String bankName;
    private String bankNumber;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User userId;
}
