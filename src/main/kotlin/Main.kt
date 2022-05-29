import java.util.*

fun main() {
    print("Введите строку: ")
    val string = readln()
    val result = BracketsChecker.checkBrackets(string)
    println(result)
}

object BracketsChecker {
    fun checkBrackets(string: String): Int {
        val openBracket = "[{("
        val closeBracket = "]})"

        val stack = Stack<Pair<Char, Int>>()

        for (i in 0 until string.length) {
            val element = string[i]
            if (element in openBracket) {
                stack.push(Pair(element, i))
            }
            if (element in closeBracket) {
                if (stack.empty()) {
                    return i + 1
                }
                val head = stack.peek().first
                if (convertToOpenBracket(element) == head) {
                    stack.pop()
                } else return i + 1
            }
        }
        return if (stack.empty()) {
            -1
        } else stack.firstElement().second + 1
    }

    private fun convertToOpenBracket(symbol: Char): Char {
        return when (symbol) {
            ']' -> '['
            '}' -> '{'
            ')' -> '('
            else -> ' '
        }
    }
}