package br.brunodorea.coinconverter.domain.di

import br.brunodorea.coinconverter.domain.GetExchangeValueUseCase
import br.brunodorea.coinconverter.domain.ListExchangeUseCase
import br.brunodorea.coinconverter.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}