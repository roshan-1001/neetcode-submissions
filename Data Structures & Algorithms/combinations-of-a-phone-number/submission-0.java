class Solution {
    public List<String> letterCombinations(String digits) {
        int s = digits.length();
        StringBuffer sb = new StringBuffer(); 
        List<String> res = new ArrayList<>();
        if (s==0){
            return res;
        }
        helper(s,0,sb,res, digits);
        return res;
    }
    public void helper(int s, int i, StringBuffer sb, List<String> res, String d){
        if(i==s){
            res.add(new String(sb.toString()));
            return;
        }
        if(d.charAt(i)=='2'){
            sb.append('a');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('b');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('c');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='3'){
            sb.append('d');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('e');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('f');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='4'){
            sb.append('g');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('h');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('i');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='5'){
            sb.append('j');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('k');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('l');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='6'){
            sb.append('m');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('n');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('o');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='7'){
            sb.append('p');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('q');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('r');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('s');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='8'){
            sb.append('t');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('u');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('v');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(d.charAt(i)=='9'){
            sb.append('w');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('x');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('y');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
            sb.append('z');
            helper(s,i+1,sb,res,d);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}
