package com.alibou.banking.fraud;

import com.alibou.banking.common.AbstractEntity;
import com.alibou.banking.transaction.Transaction;



import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "FRAUDS")
public class Fraud extends AbstractEntity {

    @Enumerated(EnumType.STRING)
    private FraudType type;
    @Enumerated(EnumType.STRING)
    private FraudStatus status;
    private LocalDateTime date;
    @OneToOne
    private Transaction transaction;


}
