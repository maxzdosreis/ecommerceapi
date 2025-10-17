package org.maxzdosreis.ecommerceapi.data.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String description;
    private Double price;
    private List<CategoryDTO> categoriesIds;
}
