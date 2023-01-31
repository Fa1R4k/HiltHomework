package com.example.hilthomework.data

import com.example.hilthomework.data.mappers.ImageUrlUiMapper
import com.example.hilthomework.domain.ImageUrlRepository
import com.example.hilthomework.domain.ImageUrlUiData
import javax.inject.Inject

class ImageUrlRepositoryImpl @Inject constructor(
    private val service: Server,
    private val mapper: ImageUrlUiMapper,
) : ImageUrlRepository {

    override fun getImageURL(): ImageUrlUiData {
        val response = service.getImageURl()
        return mapper(response)
    }
}