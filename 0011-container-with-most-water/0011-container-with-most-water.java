class Solution {
    public int maxArea(int[] height) {
    int left=0;
    int right=height.length -1;
    int area=0;
    for (int i=0;i<height.length;i++){
       int h = Math.min(height[left],height[right]);
            int j= right-left;
            area = Math.max(area, h * j);
            if (height[left] < height[right]) {
                left++;
            }
            else
            { 
                right--;
            }
        }
        return area;
            
        
    }
}