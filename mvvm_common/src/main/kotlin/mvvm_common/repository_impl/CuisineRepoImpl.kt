package mvvm_common.repository_impl

import com.sanjoo.mvvm_data.models.CuisineData
import com.sanjoo.mvvm_domain.repo_interface.CuisinesRepo

class CuisineRepoImpl:CuisinesRepo {
    override fun getAllCuisines(): List<CuisineData> {
        return emptyList()
    }

}