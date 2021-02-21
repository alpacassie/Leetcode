class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        
        if (numRows == 0) return allrows;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        allrows.add(first_row);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = allrows.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++) {
                row.add(prev_row.get(j) + prev_row.get(j-1));
            }
            row.add(1);
            allrows.add(row);
                            
        }
        return allrows;      
     }  
}