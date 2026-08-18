class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentsQ = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            studentsQ.add(students[i]);
        }
        int i = 0;
        int j = 0;
        while(i < studentsQ.size()) {
            if (sandwiches[j] == studentsQ.peekFirst()) {
                studentsQ.removeFirst();
                j++;
                i = 0;
            } else {
                studentsQ.addLast(studentsQ.removeFirst());
                i++;
            }
        }
        return studentsQ.size();
    }
}