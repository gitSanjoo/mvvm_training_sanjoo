package mvvm_common.repository_impl

import com.google.gson.Gson
import com.sanjoo.mvvm_data.models.PlainTextDataProvider
import com.sanjoo.mvvm_data.retrofit.ApiServiceClass
import com.sanjoo.mvvm_data.retrofit.RetrofitClass
import com.sanjoo.mvvm_domain.entities.CuisineEntity
import com.sanjoo.mvvm_domain.entities.RestaurantInfoEntity
import com.sanjoo.mvvm_domain.repo_interface.CuisinesRepo

class CuisineRepoImpl:CuisinesRepo {
    override fun getAllCuisines(): List<CuisineEntity> {
         /*val restaurantInfoEntity:RestaurantInfoEntity =
             Gson().fromJson(PlainTextDataProvider.allCuisinesAvailableJsonData,RestaurantInfoEntity::class.java)
        return restaurantInfoEntity.cuisines*/

        //now here is the problem, we want to use ApiService class but that will be taking context(maybe other things as well) in params. Take a look
    // at below code
        val retrofitClass=RetrofitClass()
        val okHttpClient=RetrofitClass().getOKHttpClient()
        val retrofitBuilder=RetrofitClass().getRetrofitBuilder(okHttpClient)

        val apiServiceClass=ApiServiceClass()

        apiServiceClass.getApiService(retrofitClass.getRetrofitBuilder(okHttpClient))
    }

}