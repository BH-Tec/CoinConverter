package br.brunodorea.coinconverter.domain

import br.brunodorea.coinconverter.core.UseCase
import br.brunodorea.coinconverter.data.model.ExchangeResponseValue
import br.brunodorea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}