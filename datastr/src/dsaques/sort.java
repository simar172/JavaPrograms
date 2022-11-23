package dsaques;

public class sort {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selec(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int l = i - 1;
            int current = arr[i];
            while (l >= 0 && arr[l] > current) {
                arr[l + 1] = arr[l];
                l--;
            }
            arr[l + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void conquer(int[] arr, int s, int mid, int e) {
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;
        int[] mgd = new int[e - s + 1];
        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] < arr[idx2]) {
                mgd[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                mgd[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            mgd[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= e) {
            mgd[x] = arr[idx2];
            x++;
            idx2++;
        }
        for (int i = 0, j = s; i < mgd.length; i++, j++) {
            arr[j] = mgd[i];
        }
    }

    public static void divide(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, Math.abs(a - b));
        }
    }

    public static void merge(int[] arr) {
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2 };
        System.out.println(gcd(24, 73));
    }
}
