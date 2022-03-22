package com.zup.br.letBank.adapter.`in`.web

import com.zup.br.letBank.adapter.`in`.web.request.PixRequest
import com.zup.br.letBank.adapter.`in`.web.response.PixResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class GetPixController {

    @GetMapping("v1/pix")
    fun getPix(@RequestBody @Valid pixRequest: PixRequest): PixResponse {
        return pixRequest.mapperToPixResponse(email = pixRequest.email, keyPix = pixRequest.keyPix)
    }
}