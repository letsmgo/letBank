package com.zup.br.letBank.adapter.`in`.web.request

import com.zup.br.letBank.adapter.`in`.web.response.PixResponse
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank


data class PixRequest (
    @field:[NotBlank Email] val email: String,
    @field:[NotBlank] val keyPix: String
    ){
        fun mapperToPixResponse(email: String, keyPix: String) : PixResponse =
                PixResponse(
                        keyPixResponse = keyPix,
                        email = email
                )

}