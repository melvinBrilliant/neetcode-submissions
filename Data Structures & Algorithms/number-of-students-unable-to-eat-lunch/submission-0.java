class Solution {
    /**
    0 -> circular sandwich
    1 -> rectangular sandwich
    */
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentsQ = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            studentsQ.add(students[i]);
        }
        int i = 0;
        int j = 0;
        while (i < studentsQ.size()) {
            if (sandwiches[j] == studentsQ.peek()) {
                studentsQ.removeFirst();
                i = 0;
                j++;
            } else {
                studentsQ.add(studentsQ.removeFirst());
                i++;
            }
        }
        return studentsQ.size();
    }
}