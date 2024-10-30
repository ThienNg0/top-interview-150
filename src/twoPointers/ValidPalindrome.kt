package twoPointers

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1

    while (left < right) {
        // Bỏ qua các ký tự không phải chữ/số từ bên trái
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }
        // Bỏ qua các ký tự không phải chữ/số từ bên phải
        while (left < right && !s[right].isLetterOrDigit()) {
            right--
        }

        // So sánh hai ký tự sau khi chuyển thành chữ thường
        if (s[left].toLowerCase() != s[right].toLowerCase()) {
            return false  // Không phải palindrome
        }

        // Di chuyển hai con trỏ
        left++
        right--
    }

    return true  // Là palindrome
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))  // true
    println(isPalindrome("race a car"))  // false
}

