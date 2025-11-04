fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun main() {
    val primes = mutableListOf<Int>()
    var num = 2
    while (primes.size < 50) {
        if (isPrime(num)) primes.add(num)
        num++
    }

    println("First 50 prime numbers:")
    println(primes)
    println()

    val evens = (1..50).map { it * 2 }

    val combined = primes.toMutableList().apply { addAll(evens) }

    println("Combined list (primes + evens):")
    println(combined)
}