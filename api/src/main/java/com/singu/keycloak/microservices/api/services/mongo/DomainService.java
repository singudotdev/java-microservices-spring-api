package com.singu.keycloak.microservices.api.services.mongo;

import com.singu.keycloak.microservices.api.domains.responses.DomainResponse;
import com.singu.keycloak.microservices.api.domains.mongo.Domain;
import com.singu.keycloak.microservices.api.domains.requests.DomainRequest;
import com.singu.keycloak.microservices.api.mappers.DomainMapper;
import com.singu.keycloak.microservices.api.repositories.mongo.DomainRepository;
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
