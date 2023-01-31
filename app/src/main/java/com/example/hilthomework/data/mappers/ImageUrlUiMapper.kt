package com.example.hilthomework.data.mappers

import com.example.hilthomework.data.models.ImageUrlResponse
import com.example.hilthomework.domain.ImageUrlUiData
import javax.inject.Inject

class ImageUrlUiMapper @Inject constructor() {

    operator fun invoke(response: ImageUrlResponse): ImageUrlUiData = with(response) {
        ImageUrlUiData(
            imageURL = imageURL.orEmpty()
        )
    }
}