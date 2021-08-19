package br.com.githubrepositories

import android.app.Application
import br.com.githubrepositories.data.di.DataModule
import br.com.githubrepositories.domain.di.DomainModule
import br.com.githubrepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}