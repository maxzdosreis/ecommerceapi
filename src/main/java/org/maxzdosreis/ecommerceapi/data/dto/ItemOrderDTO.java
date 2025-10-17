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
public class ItemOrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Double discount;
    private Integer quantity;
    private Double price;
    private Long orderId;
    private Long productId;
}
