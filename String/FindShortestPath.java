package String;

public class FindShortestPath {

    public static float shortestPath(String path){
        int x = 0; 
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            } else if(path.charAt(i) == 'S'){
                y--;
            } else if(path.charAt(i) == 'E'){
                x++;
            } else {
                x--;
            }
        }

        /*
         Shortest path = displacement
        sqrt((x2-x1)^2 + (y2-y1)^2)
         */

        //calculate sqyare of (x2 - x1)
        int x2 = x * x;
        //calculate sqyare of (y2 - y1)
        int y2 = y * y;
        
        float res = (float)Math.sqrt(x2 + y2);
        return res;


    // //Simplified way
    //     int x1 = 0;
    //     int y1 = 0;
    //     int x2 = 0;
    //     int y2 = 0;
    //     for(int i = 0; i < path.length(); i++){
    //         if(path.charAt(i) == 'N'){
    //             y2++;
    //         } else if(path.charAt(i) == 'S'){
    //             y2--;
    //         } else if(path.charAt(i) == 'E'){
    //             x2++;
    //         } else {
    //             x2--;
    //         }
    //     }
    //     Float res = (float)Math.sqrt(((x2 - x1) * (x2 - x1))  + ((y2 - y1) * (y2 - y1)));
    //     return res;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float spath = shortestPath(path);

        System.out.println("Shortest path is "+ spath );
        
    }
}
