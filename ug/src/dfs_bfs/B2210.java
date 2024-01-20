package dfs_bfs;
import java.io.*;
import java.util.*;
/* https://www.acmicpc.net/problem/2210
1. 어떻게 같은 것을 거를건지?
숫자가 아닌 문자열 비교로!
2. 틀린 부분 : 재귀 호출 시 cnt++ 로 하면 dfs에서 돌아왔을 때 이미 cnt++이 되어있기 때문에 무한루프에 빠짐, 함수호출시에 cnt+1 을해야함
 */
public class B2210 {
    static String [][] map = new String[5][5];
    static ArrayList<String> arr = new ArrayList();
    static int[] dx = {-1,0,+1,0};
    static int[] dy = {0,+1,0,-1};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i =0; i<5; i++){
            st= new StringTokenizer(br.readLine());
            for(int j =0; j<5; j++){
                map[i][j] = st.nextToken();
            }
        }
        for(int i=0; i<5; i++){
            for(int j =0;j<5;j++){
                dfs(0,i,j,map[i][j]);
//            System.out.println(map[i][j]);
            }
//            System.out.println();
        }
        System.out.println(arr.size());

    }
    public static void dfs(int cnt,int x, int y, String answer){
        if(cnt==5){
            if(!arr.contains(answer)){
                arr.add(answer);
                System.out.println("cnt =5!!");}
            return;
        }
//        System.out.println(answer);
        for(int i=0; i<4;i++){
            int nx =dx[i]+ x;
            int ny= dy[i]+y;
            if(nx>=0&& nx<5&& ny>=0&&ny<5){
                System.out.println("cnt : "+cnt);
                dfs(cnt+1,nx,ny,answer+map[nx][ny]);
            }
        }
    }

}
