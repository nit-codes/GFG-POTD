//User function Template for Java

class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
      ArrayList<Integer> ans = new ArrayList();
      Set<String>hst = new HashSet();
      for(int i=0;i<m;i++){
          StringBuilder sb=new StringBuilder();
          for(int j:matrix[i]){
              sb.append(j);
          }
          String row=sb.toString();
          if(hst.contains(row))
          ans.add(i);
          else
          hst.add(row);
      }
      return ans;
    }
}
