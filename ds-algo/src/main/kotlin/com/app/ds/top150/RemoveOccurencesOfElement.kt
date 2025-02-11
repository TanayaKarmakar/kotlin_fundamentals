package org.example.com.app.ds.top150

class RemoveOccurencesOfElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var arrLen = nums.size

        for(i in 0 .. arrLen-1) {
            if(nums[i] == `val`) {
                nums[i] = Int.MAX_VALUE
            }
        }

        var j = -1
        for(i in 0 .. arrLen - 1) {
            if(nums[i] != Int.MAX_VALUE) {
                j++
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
        return (j + 1)
    }
}

fun main() {
    var nums = intArrayOf(0,1,2,2,3,0,4,2)

    val len = RemoveOccurencesOfElement().removeElement(nums, 2)
    println(len)
}