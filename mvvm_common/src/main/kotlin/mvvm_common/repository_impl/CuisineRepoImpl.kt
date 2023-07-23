package mvvm_common.repository_impl

import com.google.gson.Gson
import com.sanjoo.mvvm_data.models.PlainTextDataProvider
import com.sanjoo.mvvm_domain.entities.CuisineEntity
import com.sanjoo.mvvm_domain.entities.RestaurantInfoEntity
import com.sanjoo.mvvm_domain.repo_interface.CuisinesRepo

class CuisineRepoImpl:CuisinesRepo {
    override fun getAllCuisines(): List<CuisineEntity> {
         val restaurantInfoEntity:RestaurantInfoEntity =
             Gson().fromJson(PlainTextDataProvider.allCuisinesAvailableJsonData,RestaurantInfoEntity::class.java)
        return restaurantInfoEntity.cuisines
    }

}