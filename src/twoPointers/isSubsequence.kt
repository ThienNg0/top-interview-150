package twoPointers

fun isSubsequence(s: String, t: String): Boolean {
    var i = 0 // Con trỏ cho chuỗi s
    var j = 0 // Con trỏ cho chuỗi t

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++ // Di chuyển con trỏ s nếu ký tự khớp
        }
        j++ // Di chuyển con trỏ t
    }

    return i == s.length // Nếu duyệt hết s, thì s là subsequence
}

fun main() {
    val s1 = "abc"
    val t1 = "ahbgdc"
    println(isSubsequence(s1, t1)) // Output: true

    val s2 = "axc"
    val t2 = "ahbgdc"
    println(isSubsequence(s2, t2)) // Output: false
}
