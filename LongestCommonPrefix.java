/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution { public String

longestCommonPrefix(String[] strs) {

int min=strs [0].length();

for (int

i=1;i<strs.length; i++)

if (min>strs[i].length()) min=strs[i].length();

int k=0;

String ans="";

boolean flag=false;

while (k<min){ //while (true){

for (int

i=1;i<strs.length; i++) {

if (

strs[i].charAt(k)!=strs [i

1].charAt(k)){

flag=true; break;

}

}

if (flag) break;

ans+=strs[0].charAt(k)+"";

k++;

} return ans;

}

}