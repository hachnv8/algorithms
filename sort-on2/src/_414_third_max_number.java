/**
 * Created by HachNV on 16/05/2023
 */
public class _414_third_max_number {
    public int thirdMax(int[] nums) {
        long [] rs = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for (int i = 0; i <nums.length ; i++) {
            insert(rs,nums[i]);
        }
        if(rs[2] != Long.MIN_VALUE){
            return (int) rs[2];
        }
        return (int) rs[0];

    }

    private void insert(long[] rs, long num) {
       int  i = 0;
        while (i<rs.length){
            if(rs[i] == num){
                return;
            }else if(num> rs[i]){
               break;
            }else {
                i++;
            }
        }
        if(i <rs.length){
            for (int j = rs.length-2; j >=i ; j--) {
                rs[j+1] = rs[j];
            }
            rs[i] = num;
        }

    }
}
