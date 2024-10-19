package net.oussamaTp.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.oussamaTp.accountservice.enums.AccountType;
import net.oussamaTp.accountservice.model.Customer;

import java.time.LocalDate;
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}
