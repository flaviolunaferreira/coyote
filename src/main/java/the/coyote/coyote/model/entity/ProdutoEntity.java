package the.coyote.coyote.model.entity;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto")
public class ProdutoEntity extends BasicEntity {

    private String descricao;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;

    
}