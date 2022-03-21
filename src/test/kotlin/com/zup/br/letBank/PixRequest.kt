package com.zup.br.letBank

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank


data class PixRequest (
    @field:[NotBlank Email] val email: String,
    @field:[NotBlank] val keyPix: String
        )