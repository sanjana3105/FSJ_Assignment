/*
Given two non-negative integers num1 and num2 represented as strings,
 return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Input: num1 = "2", num2 = "3"
Output: "6"

Input: num1 = "123", num2 = "456"
Output: "56088"
*/

class Solution {

public String multiply (String num1, String num2) {

int n1=num1.length(), n2=num2.length(); char[] ans new char [n1+n2]; Arrays.fill(ans, '0'); for (int j =n2-1; j>=0; j--){

for (int i=n1-1;i>=0; i--) {

int p=

(num1.charAt(i)-'0')*(num2.charAt(j) '0');

int temp-ans [i+j+1] -

ans [i+j+1] (char)

(temp+'0'); ans [i+j]=(char) ((ans [i+j]-'0'+temp/10)+'0' ) ;

}

String res="";

} boolean nonZero=true; for (int i=0; i<ans.length;i++)

{ nonZero== false) {

if (ans[i]!='0' ||

res=res+ans[i]; nonZero=false;

}

} if (res.length()==0)

res="0"; return res;

}

}