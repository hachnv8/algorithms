package leetcode;
/*
  Created by HachNV on 25/04/2023
 */

/*
  Question:

  You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
  and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

/**
 * Answer:
 *
 * Đầu tiên khởi tạo ListNode dummyHead để lưu giá trị sau khi tính tổng với giá trị mặc định là 0
 *
 * Tiếp theo tạo ListNode curr để lưu giá trị hiện tại của dummyHead
 * Tạo biến carry để lưu phần dư khi cộng
 *
 * Vòng lặp while được sử dụng để loop đến khi l1, l2 và carry đều bằng null.
 * Trong mỗi lần lặp lại, các giá trị x,y được lấy từ các node l1, l2 sau đó cộng với giá trị carry tạo ra sum
 * Biến carry được cập nhật bằng sum/10 còn giá trị sum%10 được lưu vào curr.next,
 * và curr = curr.next để tính tổng 2 chữ số tiếp theo của l1, l2
 *
 * Sau khi cộng hết ta có dummyHead lưu trữ 0 và các tổng của các chữ số của l1, l2.
 * Để lấy tổng thì ta return dummyHead.next để loại bỏ số 0
 */

public class p2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int x = l1.val;
            int y = l2.val;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum/10;
            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}
