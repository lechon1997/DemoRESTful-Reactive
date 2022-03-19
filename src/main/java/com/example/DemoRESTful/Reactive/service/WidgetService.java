package com.example.DemoRESTful.Reactive.service;

import com.example.DemoRESTful.Reactive.collections.Dato;
import com.example.DemoRESTful.Reactive.collections.Widget;
import com.example.DemoRESTful.Reactive.dto.DtoWidget;
import com.example.DemoRESTful.Reactive.repositories.RepositoryWidget;
import com.example.DemoRESTful.Reactive.util.util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WidgetService {
    @Autowired
    private RepositoryWidget repository;

    public Flux<Widget> getWidgets(){
        return repository.findAll();
    }

    public Mono<DtoWidget> saveWidget(Mono<DtoWidget> dtoWidget){
        return dtoWidget.map(util::dtoToEntity)
                .flatMap(repository::insert)
                .map(util::entityToDto);
    }

    public Mono<Widget> findById(String id) {
        return repository.findById(id);
    }
}
