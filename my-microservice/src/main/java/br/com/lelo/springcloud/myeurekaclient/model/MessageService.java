package br.com.lelo.springcloud.myeurekaclient.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MessageService {

    private Optional<Message> message = Optional.empty();

    @PostConstruct
    public void postConstruct() {
        this.message = Optional.of(new Message("Disponível com sucesso"));
    }


    public Message getStartupMessage() {
        if (message.isPresent()) {
            return message.get().addRequestCount();
        }
        throw new IllegalStateException("Message not found");
    }
}
