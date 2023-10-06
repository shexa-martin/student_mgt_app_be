package zw.ac.shexatech.student_mgt_app.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "organizations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Organization {

    @Id
    @SequenceGenerator(
            name = "org_id_seq_gen",
            sequenceName = "org_id_seq_gen",
            initialValue = 1,
            allocationSize=1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "org_id_seq_gen")
    @Column(name = "org_id")
    private Long org_id;

    @Column(name = "org_name", unique = true)
    private String orgName;

    @Column(name = "website", unique = true, nullable = true)
    private String website;

    @Column(name="fb", unique = true, nullable = true)
    private String fb;

    @Column(name = "x_twitter", unique = true, nullable = true)
    private String x;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Organization(String orgName,
                        String website,
                        String fb,
                        String x,
                        Long parentId,
                        Timestamp createdAt,
                        Timestamp updatedAt) {
        this.orgName = orgName;
        this.website = website;
        this.fb = fb;
        this.x = x;
        this.parentId = parentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
