import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (29.53%)
 * Likes:    1889
 * Dislikes: 0
 * Total Accepted:    133.5K
 * Total Submissions: 448.8K
 * Testcase Example:  '"abcabcbb"'
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 
 * 
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int length = 0;
        int strLen = s.length();
        Map<Character,Integer> map = new HashMap<>();
        while(end<strLen){
            
            if( map.containsKey(s.charAt(end)) ) {
                //取max是因为“abba”这种情况，start加1是因为要从重复出现处下一个开始
                start = Math.max(map.get(s.charAt(end))+1, start);
            }
            //因为start+1，所以end-start时要加1
            length = Math.max(length, end-start+1);
            map.put(s.charAt(end),end++);
        }
        return length;
    }
}

