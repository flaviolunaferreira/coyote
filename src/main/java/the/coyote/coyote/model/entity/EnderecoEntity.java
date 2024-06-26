package the.coyote.coyote.model.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import the.coyote.coyote.model.enumeration.TipoLogradouro;

@Getter
@Setter
@MappedSuperclass
public class EnderecoEntity extends BasicEntity {

    private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;



}
