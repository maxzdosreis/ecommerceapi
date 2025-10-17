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
public class AddressDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String zipCode;
    private Long customerId;
    private Long cityId;
}
