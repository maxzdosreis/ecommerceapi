package org.maxzdosreis.ecommerceapi.data.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date instant;
    private Long paymentId;
    private Long customerId;
    private Long deliveryAddressId;
    private List<Long> itemOrdersIds;
}
