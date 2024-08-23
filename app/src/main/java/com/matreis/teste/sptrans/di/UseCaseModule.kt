package com.matreis.teste.sptrans.di

import com.matreis.teste.sptrans.data.repository.arrivaltime.ArrivalTimeRepository
import com.matreis.teste.sptrans.data.repository.busstop.BusStopRepository
import com.matreis.teste.sptrans.data.repository.lines.LinesRepository
import com.matreis.teste.sptrans.data.repository.vehicleposition.VehiclePositionRepository
import com.matreis.teste.sptrans.domain.usecase.GetArrivalTimeUseCase
import com.matreis.teste.sptrans.domain.usecase.GetBusStopUseCase
import com.matreis.teste.sptrans.domain.usecase.GetLineUseCase
import com.matreis.teste.sptrans.domain.usecase.GetVehiclePositionUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideGetLinesUseCase(repository: LinesRepository): GetLineUseCase {
        return GetLineUseCase(repository)
    }

    @Provides
    fun provideGetBusStopUseCase(repository: BusStopRepository): GetBusStopUseCase {
        return GetBusStopUseCase(repository)
    }

    @Provides
    fun provideGetVehiclePositionUseCase(repository: VehiclePositionRepository): GetVehiclePositionUseCase {
        return GetVehiclePositionUseCase(repository)
    }

    @Provides
    fun provideGetArrivalTimeUseCase(repository: ArrivalTimeRepository): GetArrivalTimeUseCase {
        return GetArrivalTimeUseCase(repository)
    }

}