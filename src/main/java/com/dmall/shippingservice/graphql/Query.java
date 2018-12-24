package com.dmall.shippingservice.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dmall.shippingservice.model.Shipping;
import com.dmall.shippingservice.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class Query implements GraphQLQueryResolver {

    @Autowired
    ShippingRepository shippingRepository;

    public Page<Shipping> getRecentShippings(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return shippingRepository.findAll(pageRequest);
    }
}
