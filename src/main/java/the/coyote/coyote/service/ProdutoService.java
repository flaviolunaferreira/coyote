package the.coyote.coyote.service;

import java.util.List;

import org.springframework.stereotype.Service;

import the.coyote.coyote.model.dto.ListaProdutosResponseDTO;

@Service
public interface ProdutoService {

    List<ListaProdutosResponseDTO> getAll(Integer pageNumber, Integer pageSize);
}
