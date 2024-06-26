package the.coyote.coyote.service;

import java.util.List;

import org.springframework.stereotype.Service;

import the.coyote.coyote.model.dto.Produtos.ListaSimplesDeProdutosDTO;

@Service
public interface ProdutoService {

    List<ListaSimplesDeProdutosDTO> getAll(Integer pageNumber, Integer pageSize);
}
