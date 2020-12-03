import java.util.*

fun main(args: Array<String>) {
    var nums = arrayOf(1,2,3,4,5)

    println(Arrays.toString(nums))

    var nums1 = IntArray(5, {i -> i * 2 + 3})

    println(Arrays.toString(nums1))

    var nums2 = arrayOf(99,2,4,6,7)
    println(nums2[3])

    nums2[4] = 25
    println(nums2[4])

    println(nums2.get(2))

    nums2.set(2, 88)

    println(Arrays.toString(nums2))

    //appends an element at the end of the array
    nums2 = nums2.plus(1)

    println(Arrays.toString(nums2))

    //printing the first value in the array
    println(nums2.first())

    //printing the last value in the array
    println(nums2.last())

    println(nums2.indexOf(88))

    println("Array length - ${nums2.count()}")

    var nEvens = nums2.count { it % 2 === 0 }

    println("There are ${nEvens} number of elements in the array")

    //sorting an array
    val sortedNumbers = nums2.sortedArray()

    println("Sorted ${Arrays.toString(sortedNumbers)}")

    var sortedNumbersDesc = nums2.sortedArrayDescending()

    println("Sorted descending ${Arrays.toString(sortedNumbersDesc)}")
}