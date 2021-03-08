package kg.asylbekov.hardtest


data class TopHeadlines(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)