class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
          
        int maxi = 0;
        
        
        for(int i = 0; i < left.size(); i++){
            
            
            maxi = max(maxi , left[i] - 0);
            
            
            
        }
        
        for(int i = 0; i < right.size(); i++){
            
            
            maxi = max(maxi , n - right[i]);
            
            
            
        }
        
        return maxi;
    }
};