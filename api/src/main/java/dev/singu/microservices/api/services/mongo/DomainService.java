package dev.singu.microservices.api.services.mongo;

import dev.singu.microservices.api.domains.mongo.Domain;
import dev.singu.microservices.api.domains.requests.DomainRequest;
import dev.singu.microservices.api.domains.responses.DomainResponse;
import dev.singu.microservices.api.mappers.DomainMapper;
import dev.singu.microservices.api.repositories.mongo.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DomainService {

    private final DomainRepository repository;

    public DomainResponse getByName(String name) {
        return DomainMapper.generateResponse(repository.findByName(name));
    }

    public List<DomainResponse> getAll() {
        final List<Domain> domains = repository.findAll();

        List<DomainResponse> domainResponses = new ArrayList<>();

        domains.forEach(domain -> domainResponses.add(DomainMapper.generateResponse(domain)));
        return domainResponses;
    }

    public DomainResponse create(DomainRequest request) {
        return DomainMapper.generateResponse(repository.save(DomainMapper.createDomain(request)));
    }
}
