
    
        HashSet<String> set= new HashSet<>();
        String str = null;
        for(int i=0; i<t;i++){
            str = pair_left[i].concat(" "+pair_right[i]);
            set.add(str);
            System.out.println(set.size());
        }
