package br.com.lelo.springcloud.myeurekaclient.model;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerService {

    private List<Customer> list = Lists.newArrayList();

    @PostConstruct
    public void postConstruct() {
        list.add(new Customer("Cássio Araújo", 1000l));
        list.add(new Customer("Cebolácio Silva Júnior", 2000l));
        list.add(new Customer("Mônica Sousa Neta", 3000l));
        list.add(new Customer("Magali Lima", 4000l));
    }


    public List<Customer> getAll() {
        return list;
    }
}
