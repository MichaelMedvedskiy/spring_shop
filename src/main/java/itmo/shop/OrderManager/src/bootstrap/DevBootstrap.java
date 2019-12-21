package itmo.shop.OrderManager.src.bootstrap;


import itmo.shop.OrderManager.src.model.Item;
import itmo.shop.OrderManager.src.repositories.ItemRepository;
import itmo.shop.OrderManager.src.repositories.OrderRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/16/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ItemRepository itemRepository;
    private OrderRepository orderRepository;

    public DevBootstrap(ItemRepository itemRepository, OrderRepository orderRepository) {
        this.itemRepository = itemRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){


        Item anal_zond = new Item("СТАЛИН 3000", 1L, 3000.);

        itemRepository.save(anal_zond);

    }
}
