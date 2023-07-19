import com.google.gson.annotations.SerializedName

data class Dishes (

    @SerializedName("dishName"     ) var dishName     : String? = null,
    @SerializedName("dishImageUrl" ) var dishImageUrl : String? = null,
    @SerializedName("price"        ) var price        : Int?    = null,
    @SerializedName("dishType"     ) var dishType     : String? = null,
    @SerializedName("mealType"     ) var mealType     : String? = null,
    @SerializedName("rating"       ) var rating       : Int?    = null

    )
