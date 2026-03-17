package com.simplifiedpicpay.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

// Import User class (adjust the package if needed)
import com.simplifiedpicpay.domain.user.User;

@Entity(name = "transactions")
@Table(name = "tbl_transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Transaction {
	// Add fields, constructors, and methods here as needed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;
    
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;
    
    private LocalDateTime timestamp;
}

