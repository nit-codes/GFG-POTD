class Solution {
    public static int findUnion(int a[], int b[]) {

HashSet<Integer> set = new HashSet<>();
for (int element:a){
 set.add(element);
}
for (int element:b){
set.add(element);
}
return set.size();

}
