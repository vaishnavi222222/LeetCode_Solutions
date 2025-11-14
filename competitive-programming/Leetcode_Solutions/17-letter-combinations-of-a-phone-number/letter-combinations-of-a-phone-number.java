class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) return ans;

        ans.add("");

        for (char digit : digits.toCharArray()) {
            String letters = "";

            switch (digit) {
                case '2': letters = "abc"; break;
                case '3': letters = "def"; break;
                case '4': letters = "ghi"; break;
                case '5': letters = "jkl"; break;
                case '6': letters = "mno"; break;
                case '7': letters = "pqrs"; break;
                case '8': letters = "tuv"; break;
                case '9': letters = "wxyz"; break;
            }

            List<String> temp = new ArrayList<>();
            for (String prefix : ans) {
                for (char ch : letters.toCharArray()) {
                    temp.add(prefix + ch);
                }
            }

            ans = (ArrayList<String>) temp;
        }

        return ans;
    }
}
