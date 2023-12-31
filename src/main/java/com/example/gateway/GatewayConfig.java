package com.example.gateway;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("getProductos", r -> r.path("/api/productos")
                        .uri("lb://servicioProductos"))
                .route("getProductoById", r -> r.path("/api/productos/{id}")
                        .uri("lb://servicioProductos"))
                .route("GuardarProductos", r -> r.path("/api/productos")
                        .uri("lb://servicioProductos"))
                .route("productos", r -> r.path("/api/productos/{id}")
                        .uri("lb://servicioProductos"))
                .route("productos", r -> r.path("/api/productos/{id}")
                        .uri("lb://servicioProductos"))
                .build();
    }

}