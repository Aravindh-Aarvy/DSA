
class MergeSort {
	public static void main(String[] args) {
		System.out.println("Before sorting ");
		int[] arr = { 9, 4, 2, 1, 5, 8, 4, 5 };
		for (int k : arr) {
			System.out.print(k + "\t");
		}
		System.out.println();
		int[] finalval = divide(arr);
		System.out.println("After sorting ");
		for (int k : finalval) {
			System.out.print(k + "\t");
		}
	}

	static int[] divide(int[] arr) {

		if (arr.length <= 1) {
			return arr;
		}
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;

		int[] leftArray = new int[mid + 1];
		int[] rightArray = new int[end - mid];
		int k = 0;
		for (int i = 0; i <= mid; i++) {
			leftArray[k++] = arr[i];
		}
		int l = 0;
		for (int i = mid + 1; i < arr.length; i++) {
			rightArray[l++] = arr[i];
		}

		int[] left = divide(leftArray);
		int[] right = divide(rightArray);

		return conquer(left, right);
	}

	static int[] conquer(int[] left, int[] right) {
		int k = 0;
		int i = 0;
		int j = 0;
		int total = left.length + right.length;
		int[] newArr = new int[total];

		while (i < left.length && j < right.length) {

			if (left[i] < right[j]) {
				newArr[k++] = left[i];
				i++;
			} else {
				newArr[k++] = right[j];
				j++;
			}
		}
		while (i < left.length) {
			newArr[k++] = left[i++];
		}
		while (j < right.length) {
			newArr[k++] = right[j++];
		}

		return newArr;
	}
}
