class Solution {
       
      HashMap<Integer , HashMap<Integer , Integer>> map;
    int M = (int)(1e9)+7;
    public int countVowelPermutation(int n) {
        
   
map = new HashMap<>();
      
        
return  solve(0 , 'c' , n);
        
       
    }


public int solve(int i , char c , int n){

if(i == n){
  
 
    return 1;
}


    if(map.containsKey(i) && map.get(i).containsKey((int)(c-'a'))){
        
        return map.get(i).get((int)(c-'a'));
    }
   


int take1 = 0;
    int take2 = 0;
    int take3 = 0;
    int take4 = 0;
    int take5 = 0;
    int take6= 0;

if(c == 'c'){

char arr[] = {'a' , 'e' , 'i' , 'o' , 'u'};

for(int j = 0;  j < arr.length; j++){

take1 = (take1 +  solve(i+1 , arr[j] , n )%M)%M;

}

//if
}else if(c ==  'a'){

    take2 = (solve(i+1 , 'e' , n))%M;
    
}else if(c == 'e'){

char arr[] = {'a'  , 'i'};
for(int j = 0;  j < arr.length; j++){

take3 = (take3 +  (solve(i+1 , arr[j] , n ))%M)%M;

}

}else if(c == 'i'){


char arr[] = {'a' , 'e' , 'o' , 'u'};

for(int j = 0;  j < arr.length; j++){

take4 = (take4 +  solve(i+1 , arr[j] , n )%M)%M;
}

}else if(c == 'u'){

    take5 =    solve(i+1 , 'a' , n)%M;
}else if(c == 'o'){

char arr[] = {'i'  , 'u'};
for(int j = 0;  j < arr.length; j++){

take6 = (take6 +  solve(i+1 , arr[j] , n )%M)%M;

}


}

int ans =  (take1+take2+take3+take4+take5+take6)%M;
    
    if(map.containsKey(i) == false){
        map.put(i , new HashMap<>());
    }
  
    map.get(i).put((int)(c-'a') , ans);
    
return ans;


    // end
}



}