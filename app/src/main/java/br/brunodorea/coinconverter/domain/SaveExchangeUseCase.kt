package br.brunodorea.coinconverter.domain

import br.brunodorea.coinconverter.core.UseCase
import br.brunodorea.coinconverter.data.model.ExchangeResponseValue
import br.brunodorea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}