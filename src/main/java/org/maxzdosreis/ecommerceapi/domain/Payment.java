package org.maxzdosreis.ecommerceapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.maxzdosreis.ecommerceapi.domain.enums.PaymentStatus;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer state;

    @JsonBackReference
    @JoinColumn(name = "order_id")
    @OneToOne
    @MapsId
    private Order order;

    public PaymentStatus getState() {
        return PaymentStatus.toEnum(state);
    }

    public void setEstado(PaymentStatus state) {
        this.state = state.getCod();
    }
}
