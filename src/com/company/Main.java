package com.company;
//reverse the string and don't take up extra memory
// time complexity
//采用双指针的做法

public class Main {
    public static void main(String[] args) {
	// write your code here
        char [] chars = {'h','e','l','l','o'};
        reverseString(chars);
    }

    public static void reverseString(char [] s){
            for (int left = 0, right = s.length - 1; left < right; ++left, --right) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
            }
    }
}
