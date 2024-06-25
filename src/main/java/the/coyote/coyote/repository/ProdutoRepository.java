package the.coyote.coyote.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import the.coyote.coyote.model.entity.ProdutoEntity;

public interface ProdutoRepository extends PagingAndSortingRepository<ProdutoEntity, Long> {

}
