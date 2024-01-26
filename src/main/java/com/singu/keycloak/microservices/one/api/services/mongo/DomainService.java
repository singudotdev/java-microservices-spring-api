package com.singu.keycloak.microservices.one.api.services.mongo;

import com.singu.keycloak.microservices.one.api.domains.mongo.Domain;
import com.singu.keycloak.microservices.one.api.domains.requests.DomainRequest;
import com.singu.keycloak.microservices.one.api.domains.responses.DomainResponse;
import com.singu.keycloak.microservices.one.api.mappers.DomainMapper;
import com.singu.keycloak.microservices.one.api.repositories.mongo.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {

    private final DomainRepository repository;

    public Domain getByName(String name) {
        return repository.findByName(name);
    }

    public List<DomainResponse> getAll() {
        final List<Domain> domains = repository.findAll();

        List<DomainResponse> domainResponses = new ArrayList<>();

        domains.forEach(domain -> domainResponses.add(DomainMapper.generateResponse(domain)));
        return domainResponses;
    }

    public DomainResponse create(DomainRequest request) {
        final Domain createdDomain = repository.save(DomainMapper.createDomain(request));

        return DomainMapper.generateResponse(createdDomain);
    }
}
