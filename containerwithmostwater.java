class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int lp=0;
        int rp=height.length-1;
        while(lp < rp){
            int ht= Math.min(height[lp], height[rp]);
            int wd=rp-lp;
            int water= ht * wd;
            maxArea= Math.max(maxArea, water);
            if(lp <rp){
                lp++;
            }else{
                rp++;
            }
        }

        return maxArea;
    }
}
