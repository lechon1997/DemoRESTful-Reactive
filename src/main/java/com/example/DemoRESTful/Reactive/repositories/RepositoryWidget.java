package com.example.DemoRESTful.Reactive.repositories;

import com.example.DemoRESTful.Reactive.collections.Dato;
import com.example.DemoRESTful.Reactive.collections.Widget;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface RepositoryWidget extends ReactiveMongoRepository<Widget, String> {
}
