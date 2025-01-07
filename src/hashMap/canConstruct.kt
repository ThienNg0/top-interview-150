package hashMap

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    // Tạo bảng đếm tần suất ký tự của magazine
    val charCount = IntArray(26) { 0 } // Chứa 26 ký tự a-z

    // Đếm tần suất ký tự trong magazine
    for (char in magazine) {
        charCount[char - 'a']++
    }

    // Kiểm tra các ký tự trong ransomNote
    for (char in ransomNote) {
        if (charCount[char - 'a'] <= 0) {
            return false // Nếu không đủ ký tự
        }
        charCount[char - 'a']-- // Giảm tần suất sau khi sử dụng
    }

    return true // Nếu tất cả ký tự trong ransomNote đều đủ
}

fun main() {
    val ransomNote1 = "a"
    val magazine1 = "b"
    println(canConstruct(ransomNote1, magazine1)) // Output: false

    val ransomNote2 = "aa"
    val magazine2 = "ab"
    println(canConstruct(ransomNote2, magazine2)) // Output: false

    val ransomNote3 = "aa"
    val magazine3 = "aab"
    println(canConstruct(ransomNote3, magazine3)) // Output: true
}
