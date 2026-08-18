class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int i = 0; i<students.length ; i++){
            if(students[i]== 0){
                count[0] += 1;
            }
            else{
                 count[1] += 1;
            }
        }
        int re = students.length;
        for(int sandwich: sandwiches){
            if(count[sandwich] > 0){
                re--;
                count[sandwich]--;
            }
            else{
                break;
            }
        }
        return re;
    }
}