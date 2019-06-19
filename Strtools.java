import javax.lang.model.util.ElementScanner6;

public class StrTools0524{
    public static String changeFirstChar(String str){
        //String tmp = str.substring(1);
        //String f = str.substring(0,1);
        //return firstChar.toUpperCase() + remaindStr;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    public static String addperiod(String str){
        return str + ".";
    }   

    //replace a target word with a given word
    public static String replace(String str, String target, String repl)
    int firstIndex = str.indexOf(target);
    int secondIndex = firstIndex + target.length();
    String firstPart = str.substring(0, firstIndex);
    String seconfPart = str.substring(secondIndex);
    return firstPart + repl + SecondPart;
    }
    // print single character of a string
    //"abcd" return "a, b, c, d."
    public static String printSingleChr(String str){
        int index = 0;
        String tmp = "";
        while (index < str.leng()(-1){
            tmp += str.substring(0,1);
            tmp += ",";
            tmp += " ";
            index++;
        }
    }
    return tmp + str.substring(length()-1) + ".";
}
    public static void main(String []args){
        //change the first charactor to another charactor 
        String str = "the dog is so cute"; //change the first charactor to upper case
        String tmp = replace(str,"dog","cat"); //tmp "The"
        System.out.println(tmp);
    }
    // abc-->cba reverse 翻转字符串
    public static String reverse(String str){
        int index = str.length()-1;
        String tmp = "";
        while(index < 0){
            tmp += str.substring(index,index +1);
            index --;
        }
        return tmp;
    }
 }
    public static String parlidrom(String str){
    String tmp = "";
        if (str.length() % 2 == 0)
            tmp = str.substring(0, str.length()/2);
        else{
            tmp = str.substring(0, str.length()/2+1);
        return tmp + reverse(tmp);
        }

    }
    //判断是否是回文
    public static bloolean isPali(String str){
        //public 是用来说明方法访问周围的关键字，public的方法可以在client program里访问
        //static 静态方法关键字，此方法可以直接用className.methodName()调用
        //boolean 返回值判断return,type
        //String str: Paraneter type
        String half = str.substring(0, str.length()/2);
        String SecondHalf = "";

        if (str.length() % 2 == 0){
            SecondHalf = str.substring(str.length()/2);
        }
        else{
            SecondHalf = str.substring(str.length()/2 + 1);
        }
        return reverse(SecondHalf).equals(half);                                              
    }
