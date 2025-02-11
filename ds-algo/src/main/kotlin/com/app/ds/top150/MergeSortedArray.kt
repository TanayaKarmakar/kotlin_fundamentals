package org.example.com.app.ds.top150

import java.util.*

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1
        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]
            } else {
                nums1[k--] = nums2[j--]
            }
        }
    }
}

fun main() {
    var nums1 = intArrayOf(4,0,0,0,0,0)
    var nums2 = intArrayOf(1,2,3,5,6)

    var obj = MergeSortedArray()
    obj.merge(nums1, 1, nums2, 5)
    println(Arrays.toString(nums1))
}