package domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse (
    val meta: MetaData,
    val data: Map<String, Currency>
)

@Serializable
data class MetaData (
    @SerialName("last_update_at")
    val lastUpdateAt: String
)

@Serializable
data class Currency (
    val code: String,
    val value: Double
)