package the.coyote.coyote.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.coyote.model.enumeration.TipoPessoa;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonaEntity extends BasicEntity {

    private String nomeRazaoSocial;
    private String apelidaNomeFantazia;
    private boolean ativo;
    private TipoPessoa tipoPessoa;
    
}
