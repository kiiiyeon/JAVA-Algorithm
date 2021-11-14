import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

class Point {
    int x;
    int y;
    public Point (int x, int y) {this.x = x; this.y=y;}
}

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        List<Integer> left = Arrays.asList(1,4,7);
        List<Integer> right = Arrays.asList(3,6,9);
        List<Integer> middle = Arrays.asList(2,5,8,0);
        
        int nowRight = 11;
        int nowLeft = 10;
        
        HashMap<Integer, Point> map = new HashMap<>();//HashMap생성
        map.put(0, new Point(1, 0));
        map.put(1, new Point(0, 3));
        map.put(2, new Point(1, 3));
        map.put(3, new Point(2, 3));
        map.put(4, new Point(0, 2));
        map.put(5, new Point(1, 2));
        map.put(6, new Point(2, 2));
        map.put(7, new Point(0, 1));
        map.put(8, new Point(1, 1));
        map.put(9, new Point(2, 1));
        map.put(10, new Point(0, 0));
        map.put(11, new Point(2, 0));
        
        for (int number : numbers) {
            if (left.contains(number)) {
                sb.append("L");
                nowLeft = number;
            }
            else if (right.contains(number)) {
                sb.append("R");
                nowRight = number;
            }
            else {
                Point point = map.get(number);
                Point leftPoint = map.get(nowLeft);
                Point rightPoint = map.get(nowRight);
                
                int distL = Math.abs(point.x - leftPoint.x) + Math.abs(point.y - leftPoint.y);
                int distR = Math.abs(point.x - rightPoint.x) + Math.abs(point.y - rightPoint.y);
                if (distR == distL) {
                    if (hand.equals("left")) {
                        sb.append("L");
                        nowLeft = number;
                    }
                    else {
                        sb.append("R");
                        nowRight = number;
                    }
                }
                else if (distR < distL) {
                    sb.append("R");
                    nowRight = number;
                }
                else {
                    sb.append("L");
                    nowLeft = number;
                }
            }
        }
        
        
        
        return sb.toString();
    }
}