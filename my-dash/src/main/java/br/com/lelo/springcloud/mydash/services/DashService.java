package br.com.lelo.springcloud.mydash.services;

import br.com.lelo.springcloud.mydash.model.SaleItemDto;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DashService {

    public List<SaleItemDto> getList() {
        return new ArrayList<SaleItemDto>();
    }
}
