/*
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


Input: strs = [""]
Output: [[""]]


Input: strs = ["a"]
Output: [["a"]]
*/


class Solution { public List<List<String>> groupAnagrams (String[] strs) {

HashMap<HashMap<Character, Integer>, Ar rayList<String>>hm-new HashMap<>(); for (String s:strs) {

HashMap<Character, Integer> hm2=new HashMap<>(); for (int

i=0; i<s.length(); i++)

{

hm2.put(s.charAt(i), hm2.getOrDefault( s.charAt(i), 0)+1);

} if (hm.contains Key (hm2)) hm.get(hm2).add(s);

else

{

hm.put(hm2, new ArrayList<String>()); hm.get(hm2).add(s);

}

}

List<List<String>> ans=new ArrayList<<>(); for (List<String> al:hm.values()) ans.add(al); return ans;

}
}