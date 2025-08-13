import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Fetching posts from API...")

    val posts = fetchPosts()

    println("Fetched ${posts.size} posts:")
    posts.take(5).forEach { post ->
        println("\nPost ID: ${post.id}")
        println("Title: ${post.title}")
        println("Body: ${post.body}")
    }
}
