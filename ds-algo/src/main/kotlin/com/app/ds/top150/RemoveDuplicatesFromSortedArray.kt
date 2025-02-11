package org.example.com.app.ds.top150

import java.util.*

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var arrLen = nums.size
        var i = 0
        while(i < arrLen) {
            var j = i + 1
            while(j < arrLen && nums[i] == nums[j]) {
                nums[j] = Int.MAX_VALUE
                j++
            }
            i = j
        }

        var j = -1
        for(i in 0 .. arrLen - 1) {
            if(nums[i] != Int.MAX_VALUE) {
                j++
                var temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
        return (j + 1)
    }
}

fun main() {
    var nums = intArrayOf(1,1,2)
    val len = RemoveDuplicatesFromSortedArray().removeDuplicates(nums)

    println(len)
    println(Arrays.toString(nums))
}