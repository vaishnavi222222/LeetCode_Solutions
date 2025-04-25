class Solution {
    public int countSegments(String s) {
        if(s.length() < 0 || s.trim().isEmpty()) return 0;
        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
}