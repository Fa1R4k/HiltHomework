package com.example.hilthomework.di

import com.example.hilthomework.data.ImageUrlRepositoryImpl
import com.example.hilthomework.domain.ImageUrlRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: ImageUrlRepositoryImpl): ImageUrlRepository
}