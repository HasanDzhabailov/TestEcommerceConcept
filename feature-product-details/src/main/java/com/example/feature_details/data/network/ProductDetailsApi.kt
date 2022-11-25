package com.example.feature_details.data.network

import com.example.feature_details.data.model.ProductDetailsDto
import retrofit2.http.GET

interface ProductDetailsApi {
	@GET("6c14c560-15c6-4248-b9d2-b4508df7d4f5")
	suspend fun getDetails(): ProductDetailsDto
}
