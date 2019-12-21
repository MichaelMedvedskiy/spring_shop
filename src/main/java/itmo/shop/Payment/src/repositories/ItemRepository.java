package itmo.shop.Payment.src.repositories;

import itmo.shop.Payment.src.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
