package itmo.shop.OrderManager.src.repositories;

import itmo.shop.OrderManager.src.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
