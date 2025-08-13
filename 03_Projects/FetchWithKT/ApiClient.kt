import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import models.Post

suspend fun fetchPosts(): List<Post> {
    val client =
            HttpClient(CIO) {
                install(ContentNegotiation) { json(Json { ignoreUnknownKeys = true }) }
            }

    val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts")
    val posts: List<Post> = response.body()
    client.close()
    return posts
}
