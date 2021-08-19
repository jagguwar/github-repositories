package br.com.githubrepositories.domain

import br.com.githubrepositories.core.UseCase
import br.com.githubrepositories.data.model.Repo
import br.com.githubrepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}