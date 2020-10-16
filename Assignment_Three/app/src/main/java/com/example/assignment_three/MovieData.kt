package com.example.assignment_three

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieData(
    @SerializedName("vote_count") val vote_count: Int?,
    @SerializedName("id") val id: Int?,
    @SerializedName("video") val video: Boolean?,
    @SerializedName("vote_average") val vote_average: Double?,
    @SerializedName("title") val title: String?,
    @SerializedName("popularity") val popularity: Double?,
    @SerializedName("poster_path") val poster_path: String?,
    @SerializedName("original_language") val original_language: String?,
    @SerializedName("original_title")val original_title: String?,
    @SerializedName("genre_ids") val genre_ids: List<Int?>?,
    @SerializedName("backdrop_path")val backdrop_path: String?,
    @SerializedName("overview") val overview: String?,
    @SerializedName("release_date") val release_date: String?
) : Serializable

