package org.maxzdosreis.ecommerceapi.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentByCardDTO extends PaymentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer numberOfInstallments;
}
