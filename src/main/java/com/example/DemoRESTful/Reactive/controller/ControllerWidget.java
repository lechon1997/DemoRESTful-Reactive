package com.example.DemoRESTful.Reactive.controller;

import com.example.DemoRESTful.Reactive.collections.Dato;
import com.example.DemoRESTful.Reactive.collections.Widget;
import com.example.DemoRESTful.Reactive.dto.DtoWidget;
import com.example.DemoRESTful.Reactive.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/widgets")
public class ControllerWidget {

    @Autowired
    private WidgetService service;

    @GetMapping
    public Flux<Widget> getWidgets(){
        return service.getWidgets();
    }

    @PostMapping
    public Mono<DtoWidget> saveWidget(@RequestBody Mono<DtoWidget> dtoWidgetMono){
        return service.saveWidget(dtoWidgetMono);
    }

    @PutMapping("/update/{id}")
    public Mono<DtoWidget> updateWidget(@RequestBody Mono<DtoWidget> dtoWidgetMono, @PathVariable String id){
        return service.updateWidget(dtoWidgetMono, id);
    }

}
