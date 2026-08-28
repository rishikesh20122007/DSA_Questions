class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        long res = 1;
        row.add((int)res);

        for(int i = 1; i <= rowIndex; i++){
            res = res * (rowIndex - i + 1)/i;
            row.add((int)res);
        }
        return row;
    }
}