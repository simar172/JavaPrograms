package datastr;

public class valid {
	public static boolean isNumber(String s) {
        try{
            int a=Integer.parseInt(s);
            double b=Double.parseDouble(s);
            if(a>0 || a<0 ||a==0||s.charAt(0)=='.' ) {
            	return true;
            }
            if(s.startsWith(".")) {
            	return true;
            }

        }
        catch(NumberFormatException e){
        	return false;
        }
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isNumber(".1"));
        
	}

}
