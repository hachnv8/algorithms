package leetcode;
/*
  Created by HachNV on 26/04/2023
 */

/*
  Question:

  Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */

/*
  Answer: solution 1:

  Dựa theo đầu vào đưa ra ta có thể thấy được chúng ta cần hợp nhất 2 mảng và sắp xếp theo chiều tăng dần

  Đầu tiên chúng ta cần hợp nhất 2 mảng dựa theo m,n cho trước.
  Tức là với m=3 thì lấy 3 số đầu tiên của mảng nums1 và thay thế các số còn lại bằng mảng nums2

  Để làm được việc này ta sử dụng vòng lặp for lặp qua các phần tử trong mảng nums1 bắt đầu từ vị trí m đến cuối mảng
  và gán giá trị của mảng nums2 tương ứng vào các vị trí đó trong nums1.
  Điều này sẽ đảm bảo rằng mảng nums1 mới sẽ chứa tất cả các phần tử của cả hai mảng.
  Sau đó ta sẽ có mảng mới là [1, 2, 3, 2, 5, 6]

  Tiếp theo là bước sắp xếp mảng theo chiều tăng dần, ở đây dùng hàm có sẵn Arrays.sort(nums1) để xử lý
 */

/**
 * Answer: solution 2:
 *
 * Với cách 2 chúng ta sẽ sử dụng kỹ thuật Hai con trỏ để xử lý
 *
 * Đầu tiên tạo ra 2 con trỏ p1, p2 dùng để chạy từ cuối lên đầu, cũng có thể chạy từ đầu tới cuối
 * Khởi tạo con trỏ p3 để xác định vị trí cần được sắp xếp mỗi lần chạy, ở đây là chạy từ cuối lên đầu
 * nên vị trí sẽ là m+n-1(=nums1.length-1) và giảm dần
 *
 * Bởi vì số lần cần phải sắp xếp sẽ chạy từ nums2.length()-1 đến nums1.length()-1, không biết được cụ thể
 * nên chúng ta sử dụng while.
 *
 * Trong vòng lặp while chúng ta so sánh p1 với p2
 * Nếu p1 > p2, ta đặt phần tử nums1[p1] vào nums1[p3]
 * và di chuyển con trỏ p1, p3 về phía trước để theo dõi các phần tử tiếp theo của mảng
 * và ngược lại, ta đặt phần tử nums2[p2] vào nums1[p3] và di chuyển con trỏ p2 và p3 về phía trước.
 * Ví dụ: với p1 = m-1 = 2, p2 = n-1 = 2, p3 = m+n-1 = 5
 * Ta so sánh nums1[2] = 3 và nums2[2] = 6 ta được nums1[2] < nums2[2] nên p3 = 5, nums1[5] = 6
 * Sau khi đã xác định được vị trí nums1[5] = 6 ta di chuyển đến p3 = 4(p3--) và p2 = 1(p2--)
 *
 * Vòng lặp while kết thúc khi tất cả các phần tử của mảng nums2 đã được chèn vào trong mảng nums1
 * và các phần tử này đã được sắp xếp trong mảng nums1 theo thứ tự tăng dần.
 */

public class p88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p2 >= 0) {
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
    }
}