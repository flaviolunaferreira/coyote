package the.coyote.coyote.model.dto;

import lombok.*;
import the.coyote.coyote.model.entity.ProdutoEntity;
import the.coyote.coyote.model.enumeration.TipoMercadoria;
import the.coyote.coyote.model.enumeration.UnidadeMedida;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ListaProdutosResponseDTO {

    private Long codigoInterno;
    private String integracao;
	private TipoMercadoria tipo;
	private String descricaoCompleta;
	private boolean ativa;
	private UnidadeMedida unidadeMedida; // esse campo é um enum

    public ListaProdutosResponseDTO(ProdutoEntity produto) {
        this.codigoInterno = produto.getId();
        this.integracao = produto.getIntegracao();
        this.tipo = produto.getTipo();
        this.descricaoCompleta = produto.getDescricaoCompleta();
        this.ativa = produto.isAtiva();
        this.unidadeMedida = produto.getUnidadeMedida();
    }
}
