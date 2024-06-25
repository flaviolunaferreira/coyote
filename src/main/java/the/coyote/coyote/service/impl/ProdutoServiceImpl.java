package the.coyote.coyote.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import the.coyote.coyote.model.dto.ListaProdutosResponseDTO;
import the.coyote.coyote.repository.ProdutoRepository;
import the.coyote.coyote.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ListaProdutosResponseDTO> getAll(Integer pageNumber, Integer pageSize) {
        if (pageSize > 50) pageSize = 50;

        PageRequest pagina = PageRequest.of(pageNumber, pageSize);

        return produtoRepository.findAll(pagina).stream().map(produto -> new ListaProdutosResponseDTO(produto)).collect(Collectors.toList());
    }

}
