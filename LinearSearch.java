public class LinearSearch {

    public int linearsearch(int A[], int n, int key) {
        int index = 0;
        while(index < n) {
            if(A[index] == key)
                    return index;
            index = index + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        LinearSearch s = new LinearSearch();
        int A[] = {67,21,63,96,51};
        int found = s.linearsearch(A, A.length, 96);
        //int found = s.linearsearch(A, A.length, 84);
        //int found = s.linearsearch(A, A.length, 100);
        System.out.println("Result: "+found);
    }

}
