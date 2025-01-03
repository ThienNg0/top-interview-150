package twoPointers

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0 // Trường hợp mảng rỗng

    var slow = 0 // Vị trí của phần tử duy nhất hiện tại

    for (fast in 1 until nums.size) {
        if (nums[fast] != nums[slow]) {
            slow++ // Di chuyển con trỏ slow
            nums[slow] = nums[fast] // Cập nhật giá trị duy nhất
        }
    }
    return slow + 1 // Số phần tử duy nhất
}

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val k = removeDuplicates(nums)
    println("Number of unique elements: $k")
    println("Modified array: ${nums.slice(0 until k)}")
}