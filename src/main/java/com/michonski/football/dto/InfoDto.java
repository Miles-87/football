package com.michonski.football.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InfoDto {

    @Builder.Default
    String message = "";

    @Builder.Default
    String error = "";
}
