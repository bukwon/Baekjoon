import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // data -> [code, date, maximum, remain]
        // ext -> 기준
        // val_ext -> 기준 값
        // sort_by -> 정렬 기준
        
        int data_size = data.length;
        int pos = -1; // for문 내 비교할 기준 및 오름차순 기준
        
        // for문 내 비교할 기준
        pos = returnPosVal(ext);
        
        List<FilteringData> filteringDatum = new ArrayList<>();
        
        for (int i = 0; i < data_size; i ++) {
            if (data[i][pos] < val_ext) {
                int c = data[i][0];
                int d = data[i][1];
                int m = data[i][2];
                int r = data[i][3];
                
                filteringDatum.add(new FilteringData(c, d, m, r));
            }
        }
        
        // 오름차순 기준
        pos = returnPosVal(sort_by);
        
        if (pos == 0) {
            filteringDatum.sort(Comparator.comparingInt(f -> f.code));
        } else if (pos == 1) {
            filteringDatum.sort(Comparator.comparingInt(f -> f.date));
        } else if (pos == 2) {
            filteringDatum.sort(Comparator.comparingInt(f -> f.maximum));
        } else if (pos == 3) {
            filteringDatum.sort(Comparator.comparingInt(f -> f.remain));
        }
        
        int filteringDatumSize = filteringDatum.size();
        int[][] answer = new int[filteringDatumSize][4];
        
        for (int i = 0; i < filteringDatumSize; i ++) {
            answer[i][0] = filteringDatum.get(i).code;
            answer[i][1] = filteringDatum.get(i).date;
            answer[i][2] = filteringDatum.get(i).maximum;
            answer[i][3] = filteringDatum.get(i).remain;
        }
        
        return answer;
    }
    
    int returnPosVal(String ext) {
        if (ext.equals("code")) {
            return 0;
        } else if (ext.equals("date")) {
            return 1;
        } else if (ext.equals("maximum")) {
            return 2;
        } else {
            return 3;
        }
    }
}

class FilteringData {
    int code;
    int date;
    int maximum;
    int remain;
    
    public FilteringData(int code, int date, int maximum, int remain) {
        this.code = code;
        this.date = date;
        this.maximum = maximum;
        this.remain = remain;
    }
}