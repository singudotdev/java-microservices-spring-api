package dev.singu.microservices.api.mappers;

import dev.singu.microservices.api.domains.mongo.Domain;
import dev.singu.microservices.api.domains.requests.DomainRequest;
import dev.singu.microservices.api.domains.responses.DomainResponse;


public class DomainMapper {

    private DomainMapper() {

    }

    public static DomainResponse generateResponse(Domain domain) {

        return DomainResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public static Domain createDomain(DomainRequest domain) {
        return Domain.builder()
                .id(null)
                .name(domain.getName())
                .build();
    }

    public static Domain updatedomain(Domain domain) {
        return Domain.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

}
