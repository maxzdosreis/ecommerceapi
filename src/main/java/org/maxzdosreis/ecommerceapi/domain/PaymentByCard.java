package org.maxzdosreis.ecommerceapi.domain;

import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentByCard extends Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer numberOfInstallments;
}
