package com.example.hilthomework.data

import com.example.hilthomework.data.models.ImageUrlResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getImageURl() = ImageUrlResponse("https://ru-static.z-dn.net/files/d0e/48001b7a8907be5cf675cbb33ec298fa.jpg")
}
