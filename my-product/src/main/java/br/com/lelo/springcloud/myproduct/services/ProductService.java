package br.com.lelo.springcloud.mydash.services;

import br.com.lelo.springcloud.mydash.model.Product;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ProductService {

    private List<Product> list = Lists.newArrayList();

    @PostConstruct
    public void start() {
        list.add(new Product(100l, "Coca cola 350 ml"));
        list.add(new Product(48l, "Pepsi 350 ml"));
        list.add(new Product(60l, "Refrigerante Itubaína 2lt"));
        list = Collections.unmodifiableList(list);
    }

    public List<Product> getList() {
        return list;
    }
}
