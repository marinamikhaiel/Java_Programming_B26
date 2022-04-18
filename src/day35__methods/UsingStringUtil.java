package day35__methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("jamES"));

        System.out.println(StringUtil.frequencyOfCharacter("apple",'p'));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'z'));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'P'));

        System.out.println(StringUtil.uniqueCharacter("aaaaabcdddddeeff"));
        System.out.println(StringUtil.uniqueCharacter("java"));
        System.out.println(StringUtil.uniqueCharacter2("aaaaabcdddddeeff"));
        System.out.println(StringUtil.uniqueCharacter("eeiioo"));

    }
}
