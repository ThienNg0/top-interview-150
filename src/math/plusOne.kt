package math

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.indices.reversed()) {
        if (digits[i] < 9) {
            digits[i] += 1
            return digits
        }
        digits[i] = 0
    }
    // Nếu còn dư nhớ sau khi duyệt hết, thêm 1 vào đầu mảng
    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}

fun main() {
    val digits1 = intArrayOf(1, 2, 3)
    val digits2 = intArrayOf(4, 3, 2, 1)
    val digits3 = intArrayOf(9)

    println(plusOne(digits1).joinToString(", ")) // Output: [1, 2, 4]
    println(plusOne(digits2).joinToString(", ")) // Output: [4, 3, 2, 2]
    println(plusOne(digits3).joinToString(", ")) // Output: [1, 0]
}
