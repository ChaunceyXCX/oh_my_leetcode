/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 *
 * https://leetcode-cn.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (56.15%)
 * Likes:    630
 * Dislikes: 0
 * Total Accepted:    120.6K
 * Total Submissions: 214.6K
 * Testcase Example:  '121'
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 示例 1:
 * 
 * 输入: 121
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 
 * 示例 3:
 * 
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 * 进阶:
 * 
 * 你能不将整数转为字符串来解决这个问题吗？
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 ) {
            return false;
        } else {
            int reverseInt = 0;
            int x1 = x;
            while( x != 0 ) {
                if( reverseInt > Integer.MAX_VALUE/10 || ( reverseInt == Integer.MAX_VALUE/10 && x%10 > Integer.MAX_VALUE%10) ) {
                    return false;
                }
                reverseInt = reverseInt*10 + x%10;
                x = x/10;
                // System.out.print(reverseInt+"^^^");
            }
            // System.out.print(reverseInt+"^^^"+x1);
            if( reverseInt == x1 ){
                return true;
            }else{
                return false;
            }
        }
    }
}

