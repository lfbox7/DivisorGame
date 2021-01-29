class Main {
  public static boolean divisorGame(int N) {
  // create boolean array N + 1 for length
  boolean [] turns = new boolean [N + 1]; 
  // iterate through the turns, from 1 <= N
  for (int i = 1; i <= N; i++) {
    // iterate through x = 1 to i
    for (int x = 1; x < i; x++) {
        // if i % x == 0;
        if (i % x == 0  && !turns[i - x]) {
            //boolean[i] = true
            turns[i] = true;
            //break
            break;
        }
      }
    }          
    // return boolean[N]
    return turns[N];
  } 
  public static void main(String[] args) {
    int N = 937;
    System.out.println(divisorGame(N));
  }
}