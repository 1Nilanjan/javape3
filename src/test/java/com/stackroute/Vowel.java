package com.stackroute;

public class Vowel
{
    public String[] removeVowel(String[] str1) {
        int len=str1.length;
        System.out.println(len);
        System.out.println(str1[0]);
        String[] str2=new String[len];
        for(int i=0;i<len;i++){
              str2[i]= str1[i].replaceAll("[aeiou]","");


            }
        return str2;

        }
}


