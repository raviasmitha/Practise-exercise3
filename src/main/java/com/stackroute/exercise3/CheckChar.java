package com.stackroute.exercise3;

public class CheckChar {
        public String[] remVow(String s[]) {
            for (int i = 0; i < s.length; i++)
                s[i] = s[i].replaceAll("[aeiouAEIOU]", "");
            return s;
        }

}
