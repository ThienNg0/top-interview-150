package array
fun merge(nums1:IntArray,m : Int,nums2:IntArray, n:Int):Unit {
    var i = m - 1 // Chỉ số cho nums1
    var j = n - 1 // Chỉ số cho nums2
    var k = m + n - 1 // Chỉ số cho vị trí cuối của nums1

    // Duyệt từ cuối đến đầu
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }

    // Sao chép các phần tử còn lại của nums2 (nếu có)
    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }

}
fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3
    merge(nums1, m, nums2, n)
    println(nums1.joinToString(", "))
}