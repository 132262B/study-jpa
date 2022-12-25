package com.example.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(callSuper = true)
//@EntityListeners(value = AuditingEntityListener.class)
@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

//    @Column(updatable = false)
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @Column(insertable = false)
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

    @Transient
    private String testData;

//    @PrePersist
//    public void PrePersist() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }


}
