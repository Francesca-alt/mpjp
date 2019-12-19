
public class Kata {
	    static String noSpace(final String x) {
	    	return x.replaceAll(" ","");// ha creato nuovo oggetto nello heap;
	    }
	}

//static String noSpace(final String x) { // metodo alternativo rispetto al primo;
//	StringBuilder i =new SB();
//for(int i:0<len) {
//	char cur = x.charAt(i);
//	if(cur!='') {
//		sb.append(cur);
//	}
//}
//return sb.toString
//}
