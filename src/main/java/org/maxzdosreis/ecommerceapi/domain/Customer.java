package org.maxzdosreis.ecommerceapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.maxzdosreis.ecommerceapi.domain.enums.TypeCustomer;

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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String name;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 18)
    private String cpfAndCnpj;

    @Column(nullable = false)
    private Integer type;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "PHONE")
    private Set<String> phones = new HashSet<>();

    @JsonBackReference
    @OneToMany
    private List<Order> orders = new ArrayList<>();

    public TypeCustomer getType(){
        return TypeCustomer.toEnum(type);
    }

    public void setType(TypeCustomer type){
        this.type = type.getCod();
    }
}
