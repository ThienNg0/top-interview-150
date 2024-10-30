package array

fun removeElement(nums: IntArray, `val`: Int): Int {
    var size = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[size] = nums[i]
            size++
        }
    }
    return size
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val `val` = 3
    // Gọi hàm removeElement và lưu kết quả vào biến
    val newSize = removeElement(nums, `val`)

    // In ra kích thước mới
    println("Kích thước mới của mảng: $newSize")

    // In ra mảng đã sửa đổi tới kích thước mới
    println("Mảng đã sửa đổi: ${nums.take(newSize)}")
}
