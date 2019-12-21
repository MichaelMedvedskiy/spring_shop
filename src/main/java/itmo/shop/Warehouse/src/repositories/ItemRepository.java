package itmo.shop.Warehouse.src.repositories;

import itmo.shop.Warehouse.src.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
