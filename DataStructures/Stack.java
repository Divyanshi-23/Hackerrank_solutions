import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<>();
        ArrayList <Character> ll = new ArrayList<>();
        int k=0; 
         
		while (sc.hasNext()) {
			String input=sc.next();
            list.add(input);
        }    
        
        for(int i=0;i<list.size();i++){
            int length=ll.size();    
            for(int j=0;j<length;j++){
                ll.remove(0);
            }
            String s = list.get(i);
            for(int j=0;j<s.length();j++){
                ll.add(s.charAt(j));
            }
            while(ll.isEmpty()==false){
                if((ll.size())%2==0){
                    char c = ll.get(k);
                    if(c=='{'){
                        if(ll.get(k+1)=='}'){
                            
                            ll.remove(k);
                            ll.remove(k);
                            k=0;
                        }
                        else{
                            k++;
                        }
                    }
                    else if(c=='['){
                        if(ll.get(k+1)==']'){
                            ll.remove(k);
                            ll.remove(k);
                            k=0;
                        }
                        else{
                            k++;
                        }
                    }
                    else if(c=='('){
                        if(ll.get(k+1)==')'){
                            ll.remove(k);
                            ll.remove(k);
                            k=0;
                        }
                        else{
                            k++;
                        }
                    }
                    else{
                        System.out.println(false);
                        k=0;
                        break;
                    }
                }
                else{
                    System.out.println(false);
                    break;
                } 
                
            }
            if(ll.isEmpty()){
                System.out.println(true);
            }
        }    
        sc.close();
    }
}




