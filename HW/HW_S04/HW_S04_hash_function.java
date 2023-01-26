class HW_S04_hash_function {
    public static int[] getHashArray(int array[]) {
        int len = array.length;
        int[] hashArray = new int[len];
        for (int i = 0; i < len; i++) {
            int element = array[i];
            int sum = 0;
            while (element > 0) {
                sum += element % 10;
                element /= 10;
            }
            int hash = sum % len;
            System.out.println(hash);
            boolean busy = true;
            while (busy) {
                if (hashArray[hash] == 0) {
                    busy = false;
                    hashArray[hash] = array[i];
                    System.out.println(hash + ": " + hashArray[hash]);
                } else {
                    hash++;
                    if (hash == len) {
                        hash = 0;
                    }
                }

            }
        }

        return hashArray;
    }

    public static void print_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = { 911, 555, 621, 7321, 3213211, 6544, 3789, 2456, 1020, 8654 };
        print_array(getHashArray(array));
    }

}
