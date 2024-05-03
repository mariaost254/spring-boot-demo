package com.demo.payload;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsResponseDTO {

    List<ProductResponseDTO> products;
}
