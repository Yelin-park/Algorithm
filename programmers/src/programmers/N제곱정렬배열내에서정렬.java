package programmers;
import java.util.Arrays;

public class N제곱정렬배열내에서정렬 {

    // n^2 정렬... 배열 내에서 정렬함
    public static void sort(int[] arr) {

        int min;
        int minIdx;
        int tmp;

        // 시작 위치를 돔
        for (int st = 0; st < arr.length; st++) {
            min = arr[st];
            minIdx = st;
            // 시작 위치 이후로 시작위치보다 작은 값이 있으면 그 값과 인덱스를 저장함
            for (int cur = st+1; cur < arr.length; cur++) {
                if (arr[cur] < min) {
                    min = arr[cur];
                    minIdx = cur;
                }
            }
            // min값이 저장된 값과 인덱스를 이용하여 시작 위치의 값과 자리를 바꿈
            tmp = arr[minIdx];
            arr[minIdx] = arr[st];
            arr[st] = tmp;
        }
    }

    // 병합정렬하여 정렬된 배열을 리턴함
    public static int[] mergeSort(int[] arr) {

        // 종료조건 : 길이가 1이거나, 2일 때
        if (arr.length == 1) {
            return arr;
        } else if(arr.length == 2) {
            if (arr[0] <= arr[1]) {
                return arr;
            } else {
                return new int[] {arr[1], arr[0]};
            }
        }

        // 왼쪽 배열과 오른쪽 배열 copy해주고 mergeSort 메소드 콜
        // 정렬된 값을 입력할 배열 초기화
        int midIdx = arr.length / 2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, midIdx));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, midIdx, arr.length));
        int[] mergedArr = new int[arr.length];

        int leftIdx = 0;
        int rightIdx = 0;
        int mergedIdx = 0;

        // 병합하여 정렬
        while ((leftIdx < leftArr.length) && (rightIdx < rightArr.length)) {
            if (leftArr[leftIdx] <= rightArr[rightIdx]) {
                mergedArr[mergedIdx++] = leftArr[leftIdx++];
            } else {
                mergedArr[mergedIdx++] = rightArr[rightIdx++];
            }
        }
        while (leftIdx < leftArr.length) {
            mergedArr[mergedIdx++] = leftArr[leftIdx++];
        }
        while (rightIdx < rightArr.length) {
            mergedArr[mergedIdx++] = rightArr[rightIdx++];
        }

        // 정렬된 배열 리턴
        return mergedArr;
    }

    public static void main(String[] args) {

        int[] arr = {2, 8, 6, 4, 3, 7, 9};

        arr = mergeSort(arr);
        //sort(arr);

        int max = arr[arr.length - 1];
        int median = arr[arr.length / 2];
        int min = arr[0];
        int sum = max + median + min;

        System.out.println("최대값 : " + max + ", 최소값 : " + min + ", 중간값 : " + median + " 의 합은 " + sum);

    }

}

