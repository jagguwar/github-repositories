package br.com.githubrepositories.data.services

import br.com.githubrepositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>

}