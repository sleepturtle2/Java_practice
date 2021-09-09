//BufferedReader input 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Scanner class
import java.util.Scanner;
import java.util.StringTokenizer;

class Sol{

    //cannot make non static reference from a static method
    static void Buffered_input() throws IOException
    {
        System.out.println("Buffered Reader input");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("String:"); 
        String name = reader.readLine(); 
        System.out.println("Integer: "); 
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Double: ");  
        double salary = Double.parseDouble(reader.readLine()); 
 
        System.out.println( name + " " + age + " " + salary); 
    }

    //Scanner class
    static void Scanner_input()
    {
        System.out.print("Scanner class input");
        Scanner in = new Scanner(System.in); 
        System.out.println("String: ");
        String s = in.nextLine(); 
        
        System.out.println("Integer: ");
        int age = in.nextInt(); 

        System.out.println("Char:  "); 
        char c = in.next().charAt(0);
        
        System.out.println("Float: "); 
        float f = in.nextFloat(); 

        System.out.println("Double: "); 
        double d = in.nextDouble(); 
        
        //for taking multiple spaced string input do the following 
        String s2 = in.next(); 
        s2+= in.nextLine();  
        System.out.println(s+ " " +  age + " " +  c + " " +  f + " "+ d + " " + s2); 
        
        in.close(); 

    }

    static void  Buffered_stringtokenizer() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        int n = Integer.parseInt(st.nextToken()); 
       int count = 0; 
        int arr[] = new int[n]; 
       while(n-- > 0)
       {
           int x = Integer.parseInt(br.readLine()); 
           arr[count++] = x; 
       }

       for(int i : arr)
       System.out.println(i); 
    }
    static class FastReader{
        BufferedReader br; 
        StringTokenizer st; 

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in)); 
        }

        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine()); 
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken(); 
        }

        int nextInt() {return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine(){
            String str = ""; 
            try{
                str = br.readLine(); 
            }catch(IOException e)
            {
                e.printStackTrace(); 
            }
            return str; 
        }
    }
    public static void main(String args[]) throws IOException
    {
       //Buffered_input(); 
       //Scanner_input(); 
       //Buffered_stringtokenizer(); 

       //fast reader 
       FastReader s = new FastReader(); 
       int n = s.nextInt(); 
        int count = 0;
        int arr[] = new int[n];  
        while(n-- > 0)
        {
            int x=s.nextInt(); 
            arr[count++] = x; 
        }
        for(int i : arr)
        System.out.println(i); 
        
       //string args input 
       if(args.length > 0)
       {
           System.out.println("The command line arguments are: "); 

           for(String val : args)
           System.out.println(val); 
       }
       else {
           System.out.println("No arguments found"); 
       }
    }
}