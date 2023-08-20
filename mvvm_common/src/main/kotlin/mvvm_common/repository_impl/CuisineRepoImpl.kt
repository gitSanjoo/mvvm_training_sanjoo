package mvvm_common.repository_impl

import com.google.gson.Gson
import com.sanjoo.mvvm_data.models.CuisineData
import com.sanjoo.mvvm_data.models.PlainTextDataProvider
import com.sanjoo.mvvm_data.retrofit.ApiService
import com.sanjoo.mvvm_data.retrofit.ApiServiceClass
import com.sanjoo.mvvm_data.retrofit.RetrofitClass
import com.sanjoo.mvvm_domain.DataToDomainEntityTransformer.toDomain
import com.sanjoo.mvvm_domain.entities.CuisineEntity
import com.sanjoo.mvvm_domain.entities.RestaurantInfoEntity
import com.sanjoo.mvvm_domain.repo_interface.CuisinesRepo
import javax.inject.Inject

class CuisineRepoImpl   @Inject constructor():CuisinesRepo {
    override suspend fun getAllCuisines(): List<CuisineEntity> {
         /*val restaurantInfoEntity:RestaurantInfoEntity =
             Gson().fromJson(PlainTextDataProvider.allCuisinesAvailableJsonData,RestaurantInfoEntity::class.java)
        return restaurantInfoEntity.cuisines*/

        //now here is the problem, we want to use ApiService class but that will be taking context(maybe other things as well) in params. Take a look
    // at below code
        val retrofitClass=RetrofitClass()
        val okHttpClient=retrofitClass.getOKHttpClient()
        val retrofitBuilder=RetrofitClass().getRetrofitBuilder(okHttpClient)

        val apiServiceClass=ApiServiceClass()

        val cuisinesData= apiServiceClass.getApiService(retrofitBuilder).getAllCuisines()

        val cuisinesEntities=ArrayList<CuisineEntity>()

        cuisinesData.forEach {
            cuisinesEntities.add(it.toDomain())
        }

        return cuisinesEntities
    }

}