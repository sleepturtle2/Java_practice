import java.io.*; 
import java.util.*; 

class Pair {
    int x; int y; 

    public Pair(int x, int y){
        this.x = x; 
        this.y = y; 
    }
}

class SortByFirst implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        return a.x - b.x; 
    }
}

class custom_compare{
     void sortPairs(Pair arr[], int N)
    {
        Arrays.sort(arr, new SortByFirst()); 
        for(int i = 0; i<N; i++)
        System.out.println(arr[i].x + " " + arr[i].y + " "); 

        System.out.println(); 
    }
}

class array_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int testcase = sc.nextInt(); 

        while(testcase -- > 0)
        {
            int N = sc.nextInt(); 
            Pair arr[] = new Pair[N];
            
            for(int i=0; i<N; i++)
            {
                int x = sc.nextInt(); 
                int y = sc.nextInt(); 
                arr[i] = new Pair(x, y); 
            }

            custom_compare obj = new custom_compare(); 
            obj.sortPairs(arr, N); 
        }
        sc.close(); 
    }
}