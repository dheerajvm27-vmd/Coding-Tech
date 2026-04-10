package module13;
class SegmentTree {
    int[] tree;
    int n;

    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }

    void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start]; // leaf node
        } else {
            int mid = (start + end) / 2;

            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);

            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }

    int query(int node, int start, int end, int L, int R) {

        if (end < L || start > R)
            return Integer.MIN_VALUE;

        if (L <= start && end <= R)
            return tree[node];

        int mid = (start + end) / 2;

        int left = query(2 * node + 1, start, mid, L, R);
        int right = query(2 * node + 2, mid + 1, end, L, R);

        return Math.max(left, right);
    }

    void update(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = value;
        } else {
            int mid = (start + end) / 2;

            if (index <= mid)
                update(2 * node + 1, start, mid, index, value);
            else
                update(2 * node + 2, mid + 1, end, index, value);

            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }
}
public class ST {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 9, 3};

        SegmentTree st = new SegmentTree(arr);

        int result = st.query(0, 0, arr.length - 1, 1, 4);
        System.out.println("Max in range [1,4] = " + result); 

        st.update(0, 0, arr.length - 1, 2, 10);

        result = st.query(0, 0, arr.length - 1, 1, 4);
        System.out.println("After update, Max in range [1,4] = " + result); 
    }
}
