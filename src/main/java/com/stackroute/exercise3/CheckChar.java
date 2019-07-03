package com.stackroute.exercise3;

public class CheckChar {

    //check charecter is vowel
        public String[] remVow(String s[]) {

            // searching the string for vowels

            for (int i = 0; i < s.length; i++)
                s[i] = s[i].replaceAll("[aeiouAEIOU]", "");// removing vowels
            return s;
        }

}
