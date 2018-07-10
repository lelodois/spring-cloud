package br.com.lelo.springcloud.mysale.services;

import br.com.lelo.springcloud.mysale.model.Sale;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SaleService {

    private List<Sale> saleList = Lists.newArrayList();

    @PostConstruct
    public void start() {
        saleList.add(
                new Sale(1000l)
                        .addItem(5, 100)
                        .addItem(2, 70)
        );
        saleList.add(
                new Sale(2000l)
                        .addItem(13, 48)
                        .addItem(6, 58)
        );
        saleList.add(
                new Sale(3000l)
                        .addItem(5, 48)
        );

        saleList = Collections.unmodifiableList(saleList);
    }

    public List<Sale> getList() {
        return saleList;
    }
}
