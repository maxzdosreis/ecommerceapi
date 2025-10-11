package org.maxzdosreis.ecommerceapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String name;

    @Column(nullable = false)
    private Double price;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "PRODUCT_CATEGORY",
            joinColumns = @JoinColumn (name = "product_id"),
            inverseJoinColumns = @JoinColumn (name = "category_id")
    )
    private List<Category> categories = new ArrayList<Category>();

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private Set<ItemOrder> items = new HashSet<>();

    @JsonIgnore
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();

        for (ItemOrder itemOrder : items) {
            orders.add(itemOrder.getOrder());
        }
        return orders;
    }
}
