class Solution {
    public double largestTriangleArea(int[][] points) {
        int x1,y1,x2,y2,x3,y3;
        double area=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    x1=points[i][0];
                    y1=points[i][1];
                    x2=points[j][0];
                    y2=points[j][1];
                    x3=points[k][0];
                    y3=points[k][1];
                    area=Math.max(area,0.5*Math.abs((x1*y2+x2*y3+x3*y1-(y1*x2+y2*x3+y3*x1))));
                }
            }
        }
        return area;
    }
}
